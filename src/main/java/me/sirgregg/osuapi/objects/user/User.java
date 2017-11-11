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

    public String getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public String getCount300() {
        return count300;
    }

    public String getCount100() {
        return count100;
    }

    public String getCount50() {
        return count50;
    }

    public String getPlayCount() {
        return playCount;
    }

    public String getRankedScore() {
        return rankedScore;
    }

    public String getTotalScore() {
        return totalScore;
    }

    public String getRank() {
        return rank;
    }

    public String getLevel() {
        return level;
    }

    public String getPp() {
        return pp;
    }

    public String getAccuracy() {
        return accuracy;
    }

    public String getSsCount() {
        return ssCount;
    }

    public String getsCount() {
        return sCount;
    }

    public String getaCount() {
        return aCount;
    }

    public String getCountry() {
        return country;
    }

    public String getCountryRank() {
        return countryRank;
    }

    public List<Event> getEvents() {
        return events;
    }
}
