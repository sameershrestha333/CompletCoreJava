package javaconceptoftheday;

import java.util.Arrays;

public class RemoveDuplicatesJavaExample {

	public static void removeDuplicates(int[] arrayWD) {

		int size = arrayWD.length;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (arrayWD[i] == arrayWD[j]) {
					arrayWD[j] = arrayWD[size - 1];
					size--;
					j--;
				}
				
			}
		}

		int[] arrayMOD = Arrays.copyOf(arrayWD, size);
		// System.out.println(arrayMOD);
		for (int i = 0; i < arrayMOD.length; i++) {
			System.out.println(arrayMOD[i]);
		}
	}
	String str = "sdf";
	str.index
	

	public static void main(String args[]) {
		removeDuplicates(new int[] { 4, 3, 2, 4, 9, 2 });

		// removeDuplicates(new int[] {1, 2, 1, 2, 1, 2});

		// removeDuplicates(new int[] {15, 21, 11, 21, 51, 21, 11});

		// removeDuplicates(new int[] {7, 3, 21, 7, 34, 18, 3, 21});
	}
}