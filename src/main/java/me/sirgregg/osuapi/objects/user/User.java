package me.sirgregg.osuapi.objects.user;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class User {
	@SerializedName("user_id")
	private String userID;

	private String username;

	private String count300;

	private String count100;

	private String count50;

	@SerializedName("playcount")
	private String playCount;

	@SerializedName("ranked_score")
	private String rankedScore;

	@SerializedName("total_score")
	private String totalScore;

	@SerializedName("pp_rank")
	private String rank;

	private String level;

	@SerializedName("pp_raw")
	private String pp;

	private String accuracy;

	@SerializedName("count_rank_ss")
	private String ssCount;

	@SerializedName("count_rank_s")
	private String sCount;

	@SerializedName("count_rank_a")
	private String aCount;

	private String country;

	@SerializedName("pp_country_rank")
	private String countryRank;

	private List<Event> events;
}
