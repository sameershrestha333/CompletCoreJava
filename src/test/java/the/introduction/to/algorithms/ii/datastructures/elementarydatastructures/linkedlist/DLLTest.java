package the.introduction.to.algorithms.ii.datastructures.elementarydatastructures.linkedlist;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DLLTest {

	DLL dll;

	@Before
	public void setUp() throws Exception {
		dll = new DLL();
	}

	// Adding a node at the front of the list
	@Test
	public void addNodeAtFront() {
		System.out.println("Adding a node at the front of the list");
		dll.push(3);
		dll.push(2);
		dll.push(1);
		dll.print();
	}
	/* Given a node as prev_node, insert a new node after the given node */

	@Test
	public void addNodeAfterGiveNode() {
		System.out.println("Given a node as prev_node, insert a new node after the given node ");
		dll.push(4);
		dll.push(2);
		dll.push(1);
		dll.InsertAfter(dll.head.next, 3);
		dll.print();
	}

	/* Given a node as prev_node, insert a new node after the given node */

	@Test
	public void addNodeBeforeGiveNode() {
		System.out.println("Given a node as prev_node, insert a new node Before the given node ");
		dll.push(4);
		dll.push(3);
		dll.push(1);
		dll.InsertBefore(dll.head.next, 2);
		dll.print();
	}

	// Adding a node at the end of the list
	@Test
	public void addNodeAtEnd() {
		System.out.println("Adding a node at the End of the list");
		dll.append(1);
		dll.append(2);
		dll.append(3);
		dll.print();
	}
}
