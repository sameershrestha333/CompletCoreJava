package com.java.execeptionhandling.trycaught;

public class ExceptionHandling {

	public static void main(String[] args) {
		// String Array containing valid and invalid numeric values
		String[] s = { "123", "abc", "xyz", "456" };

		for (int i = 0; i < s.length; i++) {
			try {
				System.out.println();
				int intValue = Integer.parseInt(s[i]);
			} catch (NumberFormatException ex) {
				System.out.println();
			}
		}

	}
}
