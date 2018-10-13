package interviewquestion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {

	public static void main(String[] args) {
		ArrayList<String> listWithDuplicateElements = new ArrayList<String>();

		listWithDuplicateElements.add("JAVA");

		listWithDuplicateElements.add("J2EE");

		listWithDuplicateElements.add("JSP");

		listWithDuplicateElements.add("SERVLETS");

		listWithDuplicateElements.add("JAVA");

		listWithDuplicateElements.add("STRUTS");

		listWithDuplicateElements.add("JSP");
		removeDup(listWithDuplicateElements);
		// removeDupWithIndexOf(listWithDuplicateElements);

	}

	private static boolean isUniqueChar(String str) {
		if (str.length() > 128)
			return false;

		int[] char_set = new int[128];
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if (char_set[val] != 0) {// Already found this char in string
				return false;
			}
			char_set[val] = 1;
		}
		return true;
	}

	private static void removeDupWithIndexOf(ArrayList<String> listWithDuplicateElements) {
		System.out.println(" Original Duplicate List :" + listWithDuplicateElements);
		List<String> listWithoutDuplicateElements = new ArrayList<>(listWithDuplicateElements.size());

		for (String str : listWithDuplicateElements) {
			if (!listWithoutDuplicateElements.contains(str)) {
				listWithoutDuplicateElements.add(str);
			}
		}
		System.out.println(" Without Duplicate List :" + listWithoutDuplicateElements);

	}

	private static void removeDup(ArrayList<String> listWithDuplicateElements) {
		System.out.println("Original Duplicate List :" + listWithDuplicateElements);
		List<String> listWithoutDuplicateElements = new ArrayList<>(listWithDuplicateElements.size());

		
		listWithDuplicateElements.stream().forEach(str -> {
			if (listWithoutDuplicateElements.indexOf(str) == -1) {
				listWithoutDuplicateElements.add(str);
			}
		});
		System.out.println("Without Duplicate list :" + listWithoutDuplicateElements);

	}

	/*
	private static void removeDup(ArrayList<String> listWithDuplicateElements) {
		System.out.println(" Original Duplicate List :" + listWithDuplicateElements);
		List<String> listWithoutDuplicateElements = new ArrayList<>(listWithDuplicateElements.size());
		for (String str : listWithDuplicateElements) {
			if (listWithoutDuplicateElements.indexOf(str) == -1) {
				listWithoutDuplicateElements.add(str);
			}
		}

		System.out.println(" Without Duplicate List :" + listWithoutDuplicateElements);

	}
	 */

}
