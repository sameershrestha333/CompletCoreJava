package interviewquestion;

import java.util.HashSet;
import java.util.Set;

public class PairsOfElementsInArray {

	private static void findThePairs(int[] is, int i) {
		System.out.println("Pairs of elements whose sum is " + i + " are : ");
		Set<Integer> set = new HashSet<>(is.length);
		for (Integer value : is) {
			int target = i - value;
			if (!set.contains(target)) {
				set.add(value);
			} else {
				System.out.println("(" + value + ", " + target + ") = " + i);
			}
		}

	}

	public static void main(String[] args) {
		findThePairs(new int[] { 4, 6, 5, -10, 8, 5, 20 }, 10);

		findThePairs(new int[] { 4, -5, 9, 11, 25, 13, 12, 8 }, 20);

		findThePairs(new int[] { 12, 13, 40, 15, 8, 10, -15 }, 25);

		findThePairs(new int[] { 12, 23, 125, 41, -75, 38, 27, 11 }, 50);
	}

}
