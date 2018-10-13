package the.introduction.to.algorithms.ii.datastructures.elementarydatastructures.stacksandqueus;

import java.util.Arrays;

public class MyQueue {

	private static final int DEFAULT_VALUE = 2;
	int[] arrays;
	int head = 0;
	int tail = 0;

	public MyQueue() {
		arrays = new int[DEFAULT_VALUE];
	}

	public boolean EmptyQueue() {
		return (head == tail);
	}

	public void Enqueue(int i) {
		if (EmptyQueue()) {
			arrays[head] = i;
			tail++;
		} else {
			if (isFull()) {
				incrementSize();
			}
			arrays[tail++] = i;
		}

	}

	private void incrementSize() {
		int newSize = arrays.length * 2;
		arrays = Arrays.copyOf(arrays, newSize);
	}

	public boolean isFull() {
		return tail == arrays.length;
	}

	public int size() {
		return tail - head;
	}

	public int Dequeue() {
		int value = arrays[head];
		head = head + 1;
		return value;
	}
}
