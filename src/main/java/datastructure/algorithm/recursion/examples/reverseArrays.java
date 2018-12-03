package datastructure.algorithm.recursion.examples;

import java.util.Arrays;

public class reverseArrays {

	public static void main(String[] args) {
		int[] numList = { 10, 20, 30, 40, 50 };
		reverseNum(numList);
	}

	private static void reverseNum(int[] numList) {

		if (numList.length == 0)
			return;
		int[] newArray = new int[numList.length - 1];
		for (int i = 0; i < numList.length - 1; i++)
			newArray[i] = numList[i + 1];

		reverseNum(newArray);
		System.out.print(numList[0]);
	}

}
