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
		// linkedlist.print();
		linkedlist.addAtGivenPosition(4, 9);
		linkedlist.addAtFront(7);
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

	@Test
	public void lengthOfLinkedList() {
		linkedlist.addAtTail(5);
		linkedlist.addAtTail(4);
		linkedlist.addAtTail(3);
		assertEquals(3, linkedlist.getLength());
	}

	@Test
	public void getNthElement() {
		linkedlist.addAtTail(5);
		linkedlist.addAtTail(4);
		linkedlist.addAtTail(3);
		assertEquals(5, linkedlist.getNthElement(1));
		assertEquals(4, linkedlist.getNthElement(2));
		assertEquals(3, linkedlist.getNthElement(3));
	}

	@Test
	public void getEndElement() {
		linkedlist.addAtTail(5);
		linkedlist.addAtTail(4);
		linkedlist.addAtTail(3);
		assertEquals(3, linkedlist.getEndElement());
		linkedlist.addAtTail(2);
		assertEquals(2, linkedlist.getEndElement());
	}

	@Test
	public void searchElement() {
		linkedlist.addAtTail(5);
		linkedlist.addAtTail(4);
		linkedlist.addAtTail(3);
		assertTrue(linkedlist.search(5));
		assertTrue(linkedlist.search(4));
		assertTrue(linkedlist.search(3));
		assertFalse(linkedlist.search(2));
		assertFalse(linkedlist.search(1));
	}

	@Test
	public void searchMiddleElement() {
		linkedlist.addAtTail(5);
		linkedlist.addAtTail(4);
		linkedlist.addAtTail(3);
		linkedlist.addAtTail(2);
		assertEquals(3, linkedlist.getMiddleElement());

	}

	@Test
	public void GetNth() {
		linkedlist.addAtTail(1);
		linkedlist.addAtTail(10);
		linkedlist.addAtTail(30);
		linkedlist.addAtTail(40);
		assertEquals(30, linkedlist.GetNth(2));

	}

	@Test
	public void GetNthI() {
		linkedlist.addAtTail(1);
		linkedlist.addAtTail(10);
		linkedlist.addAtTail(30);
		linkedlist.addAtTail(4);
		linkedlist.addAtTail(45);
		linkedlist.addAtTail(41);
		linkedlist.addAtTail(46);
		assertEquals(41, linkedlist.GetNth(2));
		assertEquals(4, linkedlist.GetNth(4));

	}

	@Test
	public void detectLoopPostive() {
		linkedlist.addAtTail(20);
		linkedlist.addAtTail(4);
		linkedlist.addAtTail(15);
		linkedlist.addAtTail(10);
		/* Create loop for testing */
		linkedlist.head.next.next.next.next = linkedlist.head;
		assertTrue(linkedlist.detectLoop());

	}

	@Test
	public void countNodesinLoop() {
		linkedlist.addAtTail(20);
		linkedlist.addAtTail(4);
		linkedlist.addAtTail(15);
		linkedlist.addAtTail(10);
		/* Create loop for testing */
		linkedlist.head.next.next.next.next = linkedlist.head;
		assertEquals(4, linkedlist.countNodesinLoop());

	}

	@Test
	public void detectLoopNegative() {
		linkedlist.addAtTail(20);
		linkedlist.addAtTail(4);
		linkedlist.addAtTail(15);
		linkedlist.addAtTail(10);
		assertFalse(linkedlist.detectLoop());

	}

	@Test
	public void searchMiddleElementII() {
		linkedlist.addAtTail(5);
		linkedlist.addAtTail(4);
		assertEquals(4, linkedlist.getMiddleElement());

	}

	@Test
	public void searchMiddleElementI() {
		linkedlist.addAtTail(5);
		linkedlist.addAtTail(4);
		linkedlist.addAtTail(3);
		assertEquals(4, linkedlist.getMiddleElement());

	}

	@Test
	public void countGivenElement() {
		linkedlist.addAtTail(5);
		linkedlist.addAtTail(4);
		linkedlist.addAtTail(4);
		assertEquals(2, linkedlist.countGivenElement(4));

	}

}
