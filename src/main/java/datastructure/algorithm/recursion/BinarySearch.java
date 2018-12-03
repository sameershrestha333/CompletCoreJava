package datastructure.algorithm.recursion;

import javax.print.attribute.ResolutionSyntax;

public class BinarySearch {
	private int[] array;

	public BinarySearch(int[] array) {
		this.array = array;
	}

	public int linearSearch(int item) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == item)
				return i;
		}

		return -1;
	}

	public int binarySearch(int item) {
		return binarySearch(0, array.length - 1, item);
	}

	private int binarySearch(int startIndex, int endIndex, int item) {
		if (endIndex < startIndex) {
			System.out.println("The item is not found...");
			return -1;
		}

		int middleIndex = (startIndex + endIndex) / 2;
		if (item == array[middleIndex])
			return middleIndex;
		else if (item < array[middleIndex]) {
			binarySearch(startIndex, middleIndex - 1, item);
		} else {
			binarySearch(middleIndex + 1, endIndex, item);
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arrays = { 1, 5, 3, 8, 9, 10, -3 };
		BinarySearch binarySearch = new BinarySearch(arrays);
		System.out.println(binarySearch.binarySearch(3));
		System.out.println(binarySearch.linearSearch(3));
	}

}
