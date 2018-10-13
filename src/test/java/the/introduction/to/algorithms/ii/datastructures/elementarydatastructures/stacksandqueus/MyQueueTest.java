package the.introduction.to.algorithms.ii.datastructures.elementarydatastructures.stacksandqueus;

import static org.junit.Assert.*;


import org.junit.Test;

public class MyQueueTest {
	MyQueue queue = new MyQueue();

	@Test
	public void checkIsEmpty() {
		assertTrue(queue.EmptyQueue());
	}

	@Test
	public void checkIsEmptyAfterAddingElement() {
		queue.Enqueue(2);
		assertFalse(queue.EmptyQueue());
	}

	@Test
	public void checkSize() {
		queue.Enqueue(2);
		queue.Enqueue(3);
		assertEquals(2, queue.size());
	}

	@Test
	public void checkSizeWith3Elements() {
		queue.Enqueue(2);
		queue.Enqueue(3);
		queue.Enqueue(4);
		assertEquals(3, queue.size());
	}

	@Test
	public void checkDeque() {
		int dequeueData = queue.Dequeue();
		assertEquals(0, dequeueData);
	}

	@Test
	public void checkDequeAfterAddingValue() {
		queue.Enqueue(2);
		int dequeueData = queue.Dequeue();
		assertEquals(2, dequeueData);
	}

	@Test
	public void checkDequeAfterAddingFewValues() {
		queue.Enqueue(2);
		queue.Enqueue(3);
		queue.Enqueue(4);
		int dequeueData = queue.Dequeue();
		assertEquals(2, dequeueData);
	}

	@Test
	public void checkIsFull() {
		queue.Enqueue(2);
		queue.Enqueue(3);
		assertTrue(queue.isFull());
	}

	@Test
	public void checkEnqueAndDequewithSize() {
		queue.Enqueue(2);
		queue.Enqueue(3);
		queue.Enqueue(4);
		int dequeueData = queue.Dequeue();
		assertEquals(2, dequeueData);
		assertEquals(2, queue.size());
	}

	@Test
	public void checkEnqueAndDeque() {
		queue.Enqueue(2);
		queue.Enqueue(3);
		queue.Enqueue(4);
		int dequeueData = queue.Dequeue();
		assertEquals(2, dequeueData);

		int dequeueDataNew = queue.Dequeue();
		assertEquals(3, dequeueDataNew);
	}

}
