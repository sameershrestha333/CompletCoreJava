package the.introduction.to.algorithms.ii.datastructures.elementarydatastructures.linkedlist;

import static org.junit.Assert.*;
import org.junit.Test;

public class MyLinkedListTest {

	MyLinkedList linkedlist = new MyLinkedList();

	/*
	 * @Test public void test() { assertTrue(linkedlist.isEmpty()); }
	 */

	@Test
	public void testAddAtFront() {
		linkedlist.addAtFront(5);
		linkedlist.addAtFront(4);
		linkedlist.addAtFront(3);
		linkedlist.addAtFront(2);
		assertEquals(2, linkedlist.getFront());
	}

	@Test
	public void testAddAtTail() {
		linkedlist.addAtTail(5);
		linkedlist.addAtTail(4);
		linkedlist.addAtTail(3);
		linkedlist.addAtTail(2);
		linkedlist.addAtTail(1);
		assertEquals(1, linkedlist.getTail());
	}

	@Test
	public void testAddAtGivenPosition() {
		linkedlist.addAtTail(6);
		linkedlist.addAtTail(5);
		linkedlist.addAtTail(3);
		linkedlist.addAtTail(2);
		linkedlist.addAtGivenPosition(2, 4);
		linkedlist.print();
	}

	@Test
	public void testDeleteAtGivenPosition() {
		linkedlist.addAtTail(6);
		linkedlist.addAtTail(5);
		linkedlist.addAtTail(4);
		linkedlist.addAtTail(3);
		linkedlist.deletAtGivenPosition(2);
		linkedlist.print();
	}

	@Test
	public void testDeletAtTail() {
		linkedlist.addAtTail(5);
		linkedlist.addAtTail(4);
		linkedlist.addAtTail(3);
		linkedlist.addAtTail(2);
		linkedlist.deleteAtTail();
		linkedlist.deleteAtTail();
		assertEquals(4, linkedlist.getTail());

	}

	@Test
	public void testDeletAtFront() {
		linkedlist.addAtTail(5);
		linkedlist.addAtTail(4);
		linkedlist.addAtTail(3);
		linkedlist.addAtTail(2);
		assertEquals(5, linkedlist.getFront());

		linkedlist.deleteAtFront();
		assertEquals(4, linkedlist.getFront());

	}

	@Test
	public void testDeletGivenData() {
		linkedlist.addAtTail(5);
		linkedlist.addAtTail(4);
		linkedlist.addAtTail(3);
		linkedlist.addAtTail(2);

		linkedlist.deleteGivenData(2);
		linkedlist.print();
	}

}
