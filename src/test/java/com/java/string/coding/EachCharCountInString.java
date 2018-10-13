package com.java.string.coding;

import java.util.HashMap;
import java.util.Map;

/**
 * How To Count Occurrences Of Each Character In String In Java?
 * 
 * @author sameer
 *
 */
public class EachCharCountInString {

	public static void characterCount(String inputString) {
		Map<Character, Integer> charCountMap = new HashMap<>();
		char[] charArray = inputString.replaceAll("\\s", "").toCharArray();

		for (char c : charArray) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}
		}
		System.out.println(charCountMap);

	}

	public static void main(String[] args) {
		characterCount("Java J2EE Java JSP J2EE");

		characterCount("All Is Well");

		characterCount("Done And Gone");
	}

}
