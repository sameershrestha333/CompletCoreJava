package com.java.arrays.checkEquality;

import java.util.Arrays;

public class EqualityOfTwoArrays {

	public boolean checkEqualityIterative(int[] a, int[] b) {

		if (a.length == b.length) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] != b[i]) {
					return false;
				}

			}
		} else {
			return false;
		}

		return true;
	}

	public boolean checkEqualityEqual(int[] a, int[] b) {
		if (a.length == b.length) {
			return Arrays.equals(a, b);
		} else {
			return false;
		}
	}
}
