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

	public Object getLength() {
		int count = 0;
		if (isEmpty()) {
			return count;
		}
		Node current = head;
		while (current.next != null) {
			count++;
			current = current.next;
		}
		// adding last element as well
		return ++count;
	}

	public boolean search(int i) {
		Node current = head;
		while (current.next != null) {
			if (current.data == i) {
				return true;
			}
			current = current.next;
		}

		if (current.data == i) {
			return true;
		}
		return false;
	}

	public Object getNthElement(int nthItem) {
		int count = 0;
		Node current = head;
		while (current.next != null) {
			count++;
			if (count == nthItem) {
				return current.data;
			}
			current = current.next;
		}
		if (++count == nthItem) {
			return current.data;
		}
		return 0;
	}

	public Object getEndElement() {
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		return current.data;
	}

	public Object getMiddleElement() {
		Node frontCount = head;
		Node endCount = head;
		while (endCount != null && endCount.next != null) {
			frontCount = frontCount.next;
			endCount = endCount.next.next;
		}

		return frontCount.data;
	}

	public Object countGivenElement(int i) {
		int count = 0;
		Node current = head;
		while (current.next != null) {
			if (current.data == i) {
				count++;
			}
			current = current.next;
		}
		if (current.data == i) {
			count++;
		}
		return count;
	}

	public void addAtGivenPosition(int position, int data) {
		Node newNode = new Node(data);
		int count = 0;
		Node current = head;
		while (current.next != null) {
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

	public void deleteGivenData(int data) {
		Node current = head;
		if (head.data == data) {
			deleteAtFront();
			return;
		}

		while (current.next != null) {
			if (current.next.data == data) {
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}
	}

	public Object GetNth(int i) {
		Node nodeA = head;
		Node nodeB = head;
		int count = 1;
		while (count != i) {
			count++;
			nodeB = nodeB.next;
		}
		while (nodeB.next != null) {
			nodeA = nodeA.next;
			nodeB = nodeB.next;
		}

		return nodeA.data;
	}

	public boolean detectLoop() {
		Node nodeA = head;
		Node nodeB = head;
		while (nodeB != null && nodeB.next != null) {
			nodeA = nodeA.next;
			nodeB = nodeB.next.next;
			if (nodeA == nodeB) {
				return true;
			}
		}

		return false;
	}

	public Object countNodesinLoop() {
		Node nodeA = head;
		Node nodeB = head;
		while (nodeB != null && nodeB.next != null) {
			nodeA = nodeA.next;
			nodeB = nodeB.next.next;
			int count = 1;
			if (nodeA == nodeB) {
				nodeB = nodeB.next;
				while (nodeA != nodeB) {
					count++;
					nodeB = nodeB.next;

				}
				return count;

			}
		}
		return 0;
	}

}
