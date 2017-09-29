package me.sirgregg.osuapi.objects;

import com.google.gson.annotations.SerializedName;

public class Beatmap {
	private String approved;

	@SerializedName("approved_date")
	private String approvedDate;

	@SerializedName("last_update")
	private String lastUpdate;

	private String artist;

	@SerializedName("beatmap_id")
	private String beatmapID;

	@SerializedName("beatmapset_id")
	private String beatmapsetID;

	private String bpm;

	@SerializedName("creator")
	private String mapper;

	@SerializedName("difficultyrating")
	private String stars;

	@SerializedName("diff_size")
	private String circleSize;

	@SerializedName("diff_overall")
	private String overallDifficulty;

	@SerializedName("diff_approach")
	private String approachRate;

	@SerializedName("diff_drain")
	private String healthDrain;

	@SerializedName("hit_length")
	private String timeWithoutBreaks;

	private String source;

	@SerializedName("genre_id")
	private String genre;

	@SerializedName("language_id")
	private String language;

	@SerializedName("title")
	private String songName;

	@SerializedName("total_length")
	private String totalLength;

	@SerializedName("version")
	private String difficultyName;

	@SerializedName("file_md5")
	private String encodedFileHash;

	private String mode;

	@SerializedName("tags")
	private String beatmapTags;

	@SerializedName("favourite_count")
	private String favoriteCount;

	@SerializedName("playcount")
	private String playCount;

	@SerializedName("passcount")
	private String passCount;

	@SerializedName("max_combo")
	private String maxComboPossible;

	/**
	 * -2 -> Graveyard
	 * -1 -> WIP
	 * 0 -> Pending
	 * 1 -> Ranked
	 * 2 -> Approved
	 * 3 -> Qualified
	 * 4 -> Loved
	 *
	 * @return a numerical representation of the approved status
	 */
	public int getApprovedStatus() {
		return Integer.parseInt(approved);
	}

	/**
	 * @return when the beatmap was set to ranked status (UTC+8)
	 */
	public String getRankedDate() {
		return approvedDate;
	}

	/**
	 * Returns the date the map was last edited
	 *
	 * @return when the beatmap was updated last (UTC+8)
	 */
	public String getLastUpdate() {
		return lastUpdate;
	}

	/**
	 * @return the artist of the song
	 */
	public String getArtist() {
		return artist;
	}

	/**
	 * @return the beatmap id of the map
	 */
	public int getBeatmapID() {
		return Integer.parseInt(beatmapID);
	}

	/**
	 * @return the map's set id
	 */
	public int getBeatmapsetID() {
		return Integer.parseInt(beatmapsetID);
	}

	/**
	 * @return the map's BPM
	 */
	public double getBPM() {
		return Double.parseDouble(bpm);
	}

	/**
	 * @return the map's creator (not to be confused with the song's creator)
	 */
	public String getMapper() {
		return mapper;
	}

	/**
	 * Star count that does <em>not</em> take mods into account
	 *
	 * @return the star count of the map
	 */
	public String getStars() {
		return stars;
	}

	/**
	 * CS that does <em>not</em> take mods into account
	 *
	 * @return the cs of the map
	 */
	public String getCircleSize() {
		return circleSize;
	}

	/**
	 * OD that does <em>not</em> take mods into account
	 *
	 * @return the od of the map
	 */
	public String getOverallDifficulty() {
		return overallDifficulty;
	}

	/**
	 * AR that does <em>not</em> take mods into account
	 *
	 * @return the ar of the map
	 */
	public String getApproachRate() {
		return approachRate;
	}

	/**
	 * HP that does <em>not</em> take mods into account
	 *
	 * @return the hp of the map
	 */
	public String getHealthDrain() {
		return healthDrain;
	}

	/**
	 * Does not include break time
	 *
	 * @return the time of the map without breaks
	 */
	public String getTimeWithoutBreaks() {
		return timeWithoutBreaks;
	}

	/**
	 * Not sure what this is. If you happen to know, please let me know.
	 *
	 * @return something that's quite often BMS
	 */
	public String getSource() {
		return source;
	}

	/**
	 * 0 -> Any
	 * 1 -> Unspecified
	 * 2 -> Video Game
	 * 3 -> Anime
	 * 4 -> Rock
	 * 5 -> Pop
	 * 6 -> Other
	 * 7 -> Novelty
	 * 9 -> Hip Hop
	 * 10 -> Electronic
	 *
	 * Note that there is no "8"
	 *
	 * @return numerical representation of genre
	 */
	public int getGenre() {
		return Integer.parseInt(genre);
	}

	/**
	 * 0 -> Any
	 * 1 -> Other
	 * 2 -> English
	 * 3 -> Japanese
	 * 4 -> Chinese
	 * 5 -> Instrumental
	 * 6 -> Korean
	 * 7 -> French
	 * 8 -> German
	 * 9 -> Swedish
	 * 10 -> Spanish
	 * 11 -> Italian
	 *
	 * @return numerical representation of language
	 */
	public int getLanguage() {
		return Integer.parseInt(language);
	}

	/**
	 * @return the name of the song (not to be confused with the difficulty name)
	 */
	public String getSongName() {
		return songName;
	}

	/**
	 * @return length of song WITH break time included
	 */
	public int getTotalLength() {
		return Integer.parseInt(totalLength);
	}


	/**
	 * @return name of the difficulty
	 */
	public String getDifficultyName() {
		return difficultyName;
	}

	/**
	 * @return md5 hash of file
	 */
	public String getFileHash() {
		return encodedFileHash;
	}

	/**
	 * 0 -> osu!standard (osu!)
	 * 1 -> Taiko
	 * 2 -> Catch the Beat (CtB)
	 * 3 -> osu!mania (Mania)
	 *
	 * @return game mode
	 */
	public String getMode() {
		return mode;
	}

	/**
	 * @return array of map tags
	 */
	public String[] getBeatmapTags() {
		return beatmapTags.split("\\s");
	}

	/**
	 * @return amount of times map has been favorited
	 */
	public String getFavoriteCount() {
		return favoriteCount;
	}

	/**
	 * @return amount of times map has been played
	 */
	public String getPlayCount() {
		return playCount;
	}

	/**
	 * Note: osu!api defines passed as: completed (the user didn't fail or <strong>retry</strong>)
	 * Basically, if the user retries, it does not count it.
	 *
	 * @return amount of times map has been passed
	 */
	public String getPassCount() {
		return passCount;
	}

	/**
	 * @return max combo a user can reach
	 */
	public String getMaxComboPossible() {
		return maxComboPossible;
	}
}
