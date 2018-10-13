package com.java.arrays.algorithm;

import java.lang.annotation.Target;
import java.util.HashSet;
import java.util.Set;

public class PairsOfElementsInArray {

	public static void findThePairs(int inputArray[], int inputNumber) {
		int arraySize = inputArray.length;
		System.out.println("Pairs of elements whose sum is " + inputNumber + " are : ");
		for (int i = 0; i < arraySize; i++) {
			for (int j = i + 1; j < arraySize; j++) {
				if (inputArray[i] + inputArray[j] == inputNumber) {
					System.out.printf("(%d,%d) %n", inputArray[i], inputArray[j]);
				}
			}
		}
	}

	public static void ArraySumUsingSet(int inputArray[], int inputNumber) {
		System.out.println("Pairs of elements whose sum is " + inputNumber + " are : ");

		if (inputArray.length < 2) {
			return;
		}
		Set set = new HashSet<>();

		for (int value : inputArray) {
			int target = inputNumber - value;

			if (set.contains(target)) {
				System.out.printf("(%d,%d)%n", value, target);
			} else {
				set.add(value);
			}
		}

	}

	public static void main(String[] args) {
		/*
		 * findThePairs(new int[] { 4, 6, 5, -10, 8, 5, 20 }, 10);
		 * 
		 * findThePairs(new int[] { 4, -5, 9, 11, 25, 13, 12, 8 }, 20);
		 * 
		 * findThePairs(new int[] { 12, 13, 40, 15, 8, 10, -15 }, 25);
		 * 
		 * findThePairs(new int[] { 12, 23, 125, 41, -75, 38, 27, 11 }, 50);
		 */
		ArraySumUsingSet(new int[] { 4, 6, 5, -10, 8, 5, 20 }, 10);

		ArraySumUsingSet(new int[] { 4, -5, 9, 11, 25, 13, 12, 8 }, 20);

		ArraySumUsingSet(new int[] { 12, 13, 40, 15, 8, 10, -15 }, 25);

		ArraySumUsingSet(new int[] { 12, 23, 125, 41, -75, 38, 27, 11 }, 50);
	}

}
