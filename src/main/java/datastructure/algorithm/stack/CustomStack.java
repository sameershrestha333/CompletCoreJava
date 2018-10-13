package datastructure.algorithm.stack;

import java.util.EmptyStackException;

public class CustomStack {
	private int top;
	private int size;
	private int[] stackArray;

	public CustomStack() {
		top = -1;
		size = 100;
		stackArray = new int[50];
	}

	public CustomStack(int size) {
		top = -1;
		this.size = size;
		stackArray = new int[this.size];
	}

	public boolean push(int value) {
		if (!isFull()) {
			stackArray[++top] = value;
			size--;
			return true;
		} else
			return false;
	}

	public int pop() {
		int popValue;
		if (empty()) {
			throw new EmptyStackException();
		} else {
			popValue = stackArray[top--];
			size++;
			return popValue;
		}
	}

	public int peek() {
		int popValue;
		if (empty()) {
			throw new EmptyStackException();
		} else {
			popValue = stackArray[top];
			return popValue;
		}
	}

	public boolean empty() {
		return top <= 0;
	}

	public int search(int value) {
		for (int i = 0; i < stackArray.length; i++) {
			if (stackArray[i] == value) {
				return i;
			}
		}
		return -1;
	}

	private boolean isFull() {
		return (top == stackArray.length - 1);
	}

}
