package interviewquestion;

import java.util.Arrays;
import java.util.Collections;

import com.google.common.primitives.Ints;

public class ArrayReverseExample {

	public static void main(String[] args) {
		reverseArray();
		reverseArrayUsingBuiltInFun();

	}

	/**
	 * 2 ways to reverse an Array . 1. Using For loop and swap the elements till the
	 * mid point.
	 */
	private static void reverseArray() {
		int[] array = new int[] { 1, 2, 3, 4, 5, 6 };

		for (int i = 0; i < array.length / 2; i++) {
			int temp = array[i];
			int index = array.length - i - 1;
			array[i] = array[index];
			array[index] = temp;
		}
		System.out.println(Arrays.toString(array));
	}

	/**
	 * 2 ways to reverse an Array . 1. Using build in function
	 * (Collections.reverse())
	 */
	private static void reverseArrayUsingBuiltInFun() {
		int[] array = new int[] { 1, 2, 3, 4, 5, 6 };

		Collections.reverse(Ints.asList(array));
		System.out.println(Arrays.toString(array));
	}

	// Output : [6, 5, 4, 3, 2, 1]
}
