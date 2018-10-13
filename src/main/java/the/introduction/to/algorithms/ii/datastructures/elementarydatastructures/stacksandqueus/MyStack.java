package the.introduction.to.algorithms.ii.datastructures.elementarydatastructures.stacksandqueus;

import java.util.Arrays;
import java.util.EmptyStackException;

public class MyStack {
	int top = -1;
	private static final int DEFAULT_CAPACITY = 2;
	int[] arrays;

	public MyStack() {
		arrays = new int[DEFAULT_CAPACITY];
	}

	public boolean STACK_EMPTY() {
		return top == -1;
	}

	public void push(int i) {
		if (top + 1 == arrays.length)
			incrementArray();
		arrays[++top] = i;
	}

	private void incrementArray() {
		int newSize = arrays.length * 2;
		arrays = Arrays.copyOf(arrays, newSize);
	}

	public int pop() {
		if (STACK_EMPTY()) {
			throw new EmptyStackException();
		}
		int data = arrays[top--];

		return data;
	}

}
