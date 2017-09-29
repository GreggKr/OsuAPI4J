package me.sirgregg.osuapi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OsuAPI {
	private String token;
	private Osu osu;

	public OsuAPI(String token) {
		if (token == null || !isValidToken(token)) {
			throw new IllegalArgumentException("That is not a valid token.");
		}

		this.token = token;
		this.osu = new Osu(token);
	}

	/**
	 * Validates a token
	 *
	 * @param token osu!api token that you wish to check
	 * @return if the token matches the regex
	 */
	private boolean isValidToken(String token) {
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9]{40}$");
		Matcher matcher = pattern.matcher(token);

		return matcher.find();
	}

	public String getToken() {
		return token;
	}
}
