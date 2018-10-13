package com.java.datastructure.linkedlist;

public class Test {

	public static void main(String[] args) {
		MyLinkedList linkedList = new MyLinkedList();
		linkedList.prepend(1);
		linkedList.prepend(2);
		linkedList.prepend(3);
		linkedList.print();
		
		linkedList.delete(2);
		linkedList.print();
	}

}
