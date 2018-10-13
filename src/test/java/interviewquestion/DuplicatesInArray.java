package interviewquestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicatesInArray {
	private static void isDuplicate(String[] strArray) {
		List<String> strArrayList = Arrays.asList(strArray);
		List<String> tempArrayList = new ArrayList<>(strArrayList.size());

		for (String string : strArrayList) {
			if (tempArrayList.contains(string)) {
				System.out.println("Duplicate Value:" + string);
			} else {
				tempArrayList.add(string);
			}
		}
	}

	private static void isDuplicateUsingHashSet(String[] strArray) {
		List<String> strArrayList = Arrays.asList(strArray);
		Set<String> set = new HashSet<String>(strArrayList.size());

		for (String string : strArrayList) {
			if (!set.add(string)) {
				System.out.println("Duplicate Value:" + string);
			}
		}
	}

	private static void isDuplicateUsingJava8(String[] strArray) {
		List<String> strArrayList = Arrays.asList(strArray);
		Set<String> set = new HashSet<String>(strArrayList.size());
		Set<String> collect = strArrayList.stream().filter(str -> !set.add(str)).collect(Collectors.toSet());
		System.out.println(collect);
	}

	public static void main(String[] args) {
		String[] strArray = { "abc", "def", "mno", "xyz", "pqr", "xyz", "def" };
		isDuplicateUsingHashSet(strArray);
		System.out.println("java 8");
		isDuplicateUsingJava8(strArray);

	}

}
