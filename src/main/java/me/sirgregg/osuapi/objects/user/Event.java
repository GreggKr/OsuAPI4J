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

    public String getHtml() {
        return html;
    }

    public String getBeatmapID() {
        return beatmapID;
    }

    public String getBeatmapSetID() {
        return beatmapSetID;
    }

    public String getDate() {
        return date;
    }

    public String getEpicFactor() {
        return epicFactor;
    }
}
