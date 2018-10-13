package the.introduction.to.algorithms.i.insertion_sort;

import java.util.Arrays;

public class InsertionSort {

	static void sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int current = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > current) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = current;

		}
	}

	static void anti_sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int current = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] < current) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = current;

		}
	}

	public static void main(String[] args) {
		int[] data = { 31, 41, 59, 26, 41, 58 };
		sort(data);
		System.out.println(Arrays.toString(data));
		anti_sort(data);
		System.out.println(Arrays.toString(data));
	}

}
