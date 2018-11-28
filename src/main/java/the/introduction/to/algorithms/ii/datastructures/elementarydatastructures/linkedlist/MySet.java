package the.introduction.to.algorithms.ii.datastructures.elementarydatastructures.linkedlist;

import java.util.Arrays;

public class MySet {
	private static final int defautlLength = 2;
	private int[] arrays;
	int index = -1;

	public MySet() {
		arrays = new int[defautlLength];
	}

	public boolean isEmpty() {
		return index < 0;
	}

	public void add(int i) {
		if (!contains(i)) {
			if (arrays.length == getSize())
				incrementSize();
			arrays[++index] = i;
		}
	}

	private void incrementSize() {
		int newSize = getSize() * 2;
		arrays = Arrays.copyOf(arrays, newSize);
	}

	public int getSize() {
		return index + 1;
	}

	public boolean contains(int data) {

		for (int i = 0; i <= index; i++) {
			if (arrays[i] == data) {
				return true;
			}
		}
		return false;
	}

	public void remove(int data) {
		if (contains(data)) {
			int indexToBeDelete = getIndexOf(data);
			int lastIndex = getSize() - 1;
			arrays[indexToBeDelete] = arrays[lastIndex];
			index--;
		}
	}

	public int getIndexOf(int data) {
		for (int i = 0; i < arrays.length; i++) {
			if (arrays[i] == data) {
				return i;
			}
		}
		return -1;
	}

}
