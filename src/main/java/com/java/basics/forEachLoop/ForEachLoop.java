package com.java.basics.forEachLoop;

public class ForEachLoop {
	public static void main(String[] args) {
		// An array of String
		String[] arrStr = { "First", "Second", "Third", "Fourth", "Fifth" };

		// Iterate over every element of the array using for-loop
		for (String s : arrStr) {
			System.out.println(s);
		}
	}
}
