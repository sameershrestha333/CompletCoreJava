package interviewquestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicatesInArrays {
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

	public static void main(String[] args) {
		String[] strArray = { "abc", "def", "mno", "xyz", "pqr", "xyz", "def" };
		isDuplicate(strArray);

	}

}
