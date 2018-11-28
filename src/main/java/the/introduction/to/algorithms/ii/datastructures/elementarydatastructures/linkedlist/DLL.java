package the.introduction.to.algorithms.ii.datastructures.elementarydatastructures.linkedlist;

public class DLL {
	Node head;

	class Node {
		int data;
		Node pre;
		Node next;

		public Node(int data) {
			this.data = data;
		}

	}

	public void push(int data) {
		Node newNode = new Node(data);

		if (isEmpty()) {
			head = newNode;
		} else {
			newNode.next = head;
			head.pre = newNode;
			head = newNode;
		}

	}

	private boolean isEmpty() {
		return head == null;
	}

	public void print() {
		Node current = head;
		while (current.next != null && current != null) {
			System.out.println(current.data);
			current = current.next;
		}
		System.out.println(current.data);

	}

	public void InsertAfter(Node preNode, int data) {
		Node newNode = new Node(data);
		newNode.next = preNode.next;
		preNode.next.pre = newNode;
		preNode.next = newNode;
		newNode.pre = preNode;
	}

	public void append(int data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			head = newNode;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
			newNode.pre = current;
		}
	}

	public void InsertBefore(Node preNode, int data) {
		Node newNode = new Node(data);

		newNode.pre = preNode.pre;
		preNode.pre.next = newNode;
		preNode.pre = newNode;
		newNode.next = preNode;

	}

}
