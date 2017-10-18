package me.sirgregg.osuapi.objects.user;

import com.google.gson.annotations.SerializedName;

public class Event {
	@SerializedName("display_html")
	private String html;

	@SerializedName("beatmap_id")
	private String beatmapID;

	@SerializedName("beatmapset_id")
	private String beatmapSetID;

	private String date;

	@SerializedName("epicfactor")
	private String epicFactor;
}
