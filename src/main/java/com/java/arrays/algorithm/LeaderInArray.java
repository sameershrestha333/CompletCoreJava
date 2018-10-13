package com.java.arrays.algorithm;

import java.util.Arrays;

public class LeaderInArray {

	public static void main(String[] args) {
		findLeadersInAnArray(new int[] { 12, 9, 7, 14, 8, 6, 3 });

		findLeadersInAnArray(new int[] { 8, 23, 19, 21, 15, 6, 11 });

		findLeadersInAnArray(new int[] { 55, 67, 71, 57, 51, 63, 38 });

		findLeadersInAnArray(new int[] { 21, 58, 44, 14, 51, 36, 23 });
	}

	private static void findTheLeaders(int[] is) {
		System.out.println("Leaders in " + Arrays.toString(is) + " are :");
		for (int i = 0; i < is.length; i++) {
			int j;
			for (j = i + 1; j < is.length; j++) {
				if (is[i] <= is[j]) {
					break;
				}
			}
			if (j == is.length) {
				System.out.println(is[i] + ", ");
			}
		}

	}

	private static void findTheLeadersA(int[] is) {
		System.out.println("Leaders in " + Arrays.toString(is) + " are :");
		for (int i = 0; i < is.length; i++) {
			boolean flag = true;
			for (int j = i + 1; j < is.length; j++) {
				if (is[i] < is[j]) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				System.out.println(is[i] + ", ");
			}
		}

	}

	private static void findLeadersInAnArray(int[] is) {
		System.out.println("Leaders in " + Arrays.toString(is) + " are :");
		int rightMax = is[is.length - 1];
		System.out.println(rightMax + ", ");

		for (int i = is.length - 2; i >= 0; i--) {
			if (is[i] > rightMax) {
				rightMax = is[i];
				System.out.println(rightMax + ", ");
			}
		}
	}

}
