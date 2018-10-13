package interviewquestion;

import java.util.Arrays;

public class EqualityOfTwoArrays {

	public static boolean checkEqality(String[] arr1, String arr2[]) {

		if (arr1.length != arr2.length) {
			return false;
		} else {
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean checkEqalitySimpleWay(String[] arr1, String arr2[]) {

		Arrays.sort(arr1);
		Arrays.sort(arr2);
		return Arrays.equals(arr1, arr2);
	}

	public static void main(String[] args) {
		String[] s1 = { "java", "j2ee", "struts", "hibernate" };

		String[] s2 = { "jsp", "spring", "jdbc", "hibernate" };

		String[] s3 = { "java", "j2ee", "struts", "hibernate" };

		System.out.println(checkEqalitySimpleWay(s1, s2)); // Output : false

		System.out.println(checkEqalitySimpleWay(s1, s3)); // Output : true
	}

}
