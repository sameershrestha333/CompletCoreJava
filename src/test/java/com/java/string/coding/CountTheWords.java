package com.java.string.coding;

import java.util.Scanner;

/**
 * Write a java program to count the number of words in a string?
 * 
 * @author sameer
 *
 */
public class CountTheWords {

	public static void main(String[] args) {
		System.out.println("Enter the string");

		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();

		int count = 1;

		for (int i = 0; i < s.length() - 1; i++) {
			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {
				count++;
			}
		}

		System.out.println("Number of words in a string = " + count);

	}

}
