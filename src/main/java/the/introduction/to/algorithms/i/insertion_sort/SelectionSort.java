package the.introduction.to.algorithms.i.insertion_sort;

import java.util.Arrays;

public class SelectionSort {

	static void sort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int smallest = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[smallest]) {
					smallest = j;
				}
			}
			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
		}
	}

	public static void main(String[] args) {
		int[] data = { 10, 2, 8, 6, 7, 3 };
		sort(data);
		System.out.println(Arrays.toString(data));

	}

}
