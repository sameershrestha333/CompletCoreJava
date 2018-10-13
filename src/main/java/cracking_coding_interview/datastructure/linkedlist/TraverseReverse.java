package cracking_coding_interview.datastructure.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * 1) Given an element, how do you find out whether that element exist in a
 * LinkedList or not. If it exist retrieve the position of that element?
 * 
 * @author sameer
 *
 */
public class TraverseReverse {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();

		// Adding elements at the end of the list

		list.add("JAVA");

		list.add("J2EE");

		list.add("JSP");

		list.add("SERVLETS");

		list.add("JDBC");

		// Printing the elements of list

		System.out.println(list); // Output : [JAVA, J2EE, JSP, SERVLETS, JDBC]

		Iterator<String> di = list.descendingIterator();
		while (di.hasNext()) {
			System.out.println(di.next());
		}
	}

}
