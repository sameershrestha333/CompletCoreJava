package com.java.datastructure.linkedlist;

public class MyLinkedList {
	Node head;

	void append(int item) {
		Node end = new Node(item);
		if (head == null) {
			head = end;
			return;
		}

		Node current = head;

		while (current.next != null) {
			current = current.next;
		}
		current.next = end;
	}

	void prepend(int item) {
		Node newHead = new Node(item);
		newHead.next = head;
		head = newHead;
	}

	public void delete(int item) {
		if (head == null)
			return;

		if (head.data == item) {
			head = head.next;
			return;
		}

		Node current = head;
		// Walk through until the last element
		while (current.next != null) {
			if (current.next.data == item) {
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}

	}

	public void print() {
		Node current = head;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
}
