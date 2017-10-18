package me.sirgregg.osuapi;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;
import me.sirgregg.osuapi.objects.Beatmap;
import me.sirgregg.osuapi.objects.user.User;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class Osu {
	private String baseURL = "https://osu.ppy.sh/api/";
	private String token;

	public Osu(String token) {
		this.token = token;
	}

	/**
	 * Gets a set's maps
	 *
	 * @param beatmapsetId set id
	 * @param mode parsed (numerical) mode
	 * @return the list of beatmaps in the set
	 */
	public Beatmap[] getBeatmaps(String beatmapsetId, int mode) {
		String url = baseURL + "get_beatmaps?k=" + sanatizeURL(token) + "&s=" + sanatizeURL(beatmapsetId) + "&m=" + mode;

		String json = getJson(url);
		if (jsonExists(json)) {
			Gson gson = new GsonBuilder().create();
			return gson.fromJson(json, Beatmap[].class);
		}

		return null;
	}

	/**
	 * Gets a map
	 * @param beatmapId map id
	 * @param mode parsed (numerical) mode
	 * @return the beatmap
	 */
	public Beatmap getBeatmap(String beatmapId, int mode) {
		String url = baseURL + "get_beatmaps?k=" + sanatizeURL(token) + "&b=" + sanatizeURL(beatmapId) + "&m=" + mode;

		String json = getJson(url);
		if (jsonExists(json)) {
			Gson gson = new GsonBuilder().create();
			return gson.fromJson(json, Beatmap[].class)[0];
		}

		return null;
	}

	public User getUser(String username, int mode, int eventDays) {
		String url = baseURL + "get_user?k=" + sanatizeURL(token) + "&u=" + sanatizeURL(username) + "&type=string&event_days";

		String json = getJson(url);
		if (jsonExists(json)) {
			Gson gson = new GsonBuilder().create();
			return gson.fromJson(json, User[].class)[0];
		}

		return null;
	}

	/**
	 * Get json from a url
	 *
	 * @param url the url to grab data from
	 * @return the json from the url
	 */
	private String getJson(String url) {
		try {
			URLConnection connection = new URL(url).openConnection();
			connection.connect();

			StringBuilder sb = new StringBuilder();
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String line;

			while ((line = bufferedReader.readLine()) != null) {
				sb.append(line);
			}

			return sb.toString();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * Checks if json exists
	 *
	 * @param json the json to check
	 * @return if it exists or not
	 */
	private boolean jsonExists(String json) {
		return !(new JsonParser().parse(json).getAsJsonArray().get(0) == null);
	}

	/**
	 * URLencoding
	 *
	 * @param url thing to encode
	 * @return encoded thing
	 */
	private String sanatizeURL(String url) {
		try {
			return URLEncoder.encode(url, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return null;
		}
	}
}
