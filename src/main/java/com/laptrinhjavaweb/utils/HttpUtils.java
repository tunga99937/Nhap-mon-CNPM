package com.laptrinhjavaweb.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class HttpUtils {
	private HttpUtils() {
	}

	public static <T> T getSessionValue(final String name, final HttpServletRequest request) {
		HttpSession session = request.getSession();

		return (T) session.getAttribute(name);
	}

	public static boolean isSessionExits(final String name, final HttpServletRequest request) {
		HttpSession session = request.getSession();

		return (session.getAttribute(name) == null) ? false : true;
	}

	public static void setSessionValue(final String name, final Object value, final HttpServletRequest request) {
		HttpSession session = request.getSession();

		session.setAttribute(name, value);
	}

}
