package it.marco.lastminute.utils;

public class Utils {

	public static String removeAllSpaces(String st) {

		if (st != null && ! "".equals(st)) {

			st = st.replaceAll("\\s+","");
		}

		return st;
	}

	public static String toLowerCase(String st) {

		if (st != null && ! "".equals(st)) {

			st = st.toLowerCase();
		}

		return st;
	}
}
