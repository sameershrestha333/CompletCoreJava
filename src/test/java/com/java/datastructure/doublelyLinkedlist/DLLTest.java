package com.java.datastructure.doublelyLinkedlist;

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
		dll.push(3);
		dll.push(2);
		dll.push(1);
		dll.print();
	}

}
