package the.introduction.to.algorithms.ii.datastructures.elementarydatastructures.linkedlist;

public class MyLinkedList {

	Node head;

	class Node {
		int data;
		Node next;

		public Node(int d) {
			data = d;
			next = null;
		}
	}

	public boolean isEmpty() {
		return head == null;
	}

	// add
	public void addAtFront(int i) {
		Node newNode = new Node(i);
		if (isEmpty())
			head = newNode;
		else {
			newNode.next = head;
			head = newNode;
		}

	}

	public void addAtTail(int i) {
		Node newNode = new Node(i);
		if (isEmpty()) {
			head = newNode;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}

	}

	public void addAtGivenPosition(int position, int data) {
		Node newNode = new Node(data);
		int count = 0;
		Node current = head;
		while (head.next != null) {
			count++;
			if (count == position) {
				newNode.next = current.next;
				current.next = newNode;
				break;
			} else {
				current = current.next;
			}
		}
	}

	public int getFront() {
		return head.data;
	}

	public Object getTail() {

		while (head.next != null) {
			head = head.next;
		}
		return head.data;
	}

	// Delete
	public void deleteAtTail() {
		if (head.next == null) {
			head = null;
		} else {
			Node current = head;
			while (current.next != null) {
				if (current.next.next == null) {
					current.next = null;
					break;
				}
				current = current.next;

			}
		}
	}

	public void deleteAtFront() {
		head = head.next;
	}

	public void deletAtGivenPosition(int i) {
		int count = 0;
		Node current = head;
		while (current.next != null) {
			count++;
			if (count == i - 1) {
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}
	}

	public void print() {
		while (head.next != null) {
			System.out.println(head.data);
			head = head.next;
		}
		System.out.println(head.data);
	}

	public void deleteGivenData(int i) {
		Node current = head;
		if (head.data == i) {
			deleteAtFront();
		}

		while (current.next != null) {
			if (current.next.data == i) {
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}
	}

}
