package com.java.string.coding;

/**
 * How To Find Largest Number Less Than Given Number And Without Given Digit?
 * 
 * @author sameer
 *
 */
public class LargestNumber {

	public int findLargest(int number, int digit) {
		char charAt = Integer.toString(digit).charAt(0);
		for (int i = number; i > 0; --i) {
			if (Integer.toString(i).indexOf(charAt) == -1) {
				return i;
			}
		}

		return -1;

	}

	public static void main(String[] args) {

	}

}
