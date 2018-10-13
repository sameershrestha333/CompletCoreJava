package com.java.datastructure.algorithm.stack;

import java.util.EmptyStackException;

public class CustomStack {
	private int top = 0;
	private int size = 100;
	private int[] array;

	public CustomStack() {
		array = new int[size];
	}

	public void push(int value) {
		if (empty()) {
			array[top] = value;

		} else {
			array[top + 1] = value;
		}
		top++;
	}

	public int pop() {
		int popValue;
		if (empty()) {
			throw new EmptyStackException();
		} else {
			popValue = array[top];
			top--;
			return popValue;
		}
	}

	public int peek() {
		int popValue;
		if (empty()) {
			throw new EmptyStackException();
		} else {
			popValue = array[top];
			return popValue;
		}
	}

	public boolean empty() {
		return top == 0;
	}
	
	public int search(int value) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				return i;
			}
		}
		return -1;
	}

}
