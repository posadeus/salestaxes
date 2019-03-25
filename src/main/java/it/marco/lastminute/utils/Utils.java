package it.marco.lastminute.utils;

public class Utils {

	/**
	 * This method removes all the spaces from a String.
	 * If a String is NULL, it return NULL
	 *
	 * @param st	String to check
	 *
	 * @return		the String without white spaces
	 */
	public static String removeAllSpaces(String st) {

		if (st != null && ! "".equals(st)) {

			st = st.replaceAll("\\s+","");
		}

		return st;
	}

	/**
	 * This method puts in lower case a String.
	 * If a String is NULL, it return NULL
	 *
	 * @param st	String to check
	 *
	 * @return		the String in lower case
	 */
	public static String toLowerCase(String st) {

		if (st != null && ! "".equals(st)) {

			st = st.toLowerCase();
		}

		return st;
	}
}
