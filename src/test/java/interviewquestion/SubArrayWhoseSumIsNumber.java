package interviewquestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubArrayWhoseSumIsNumber {

	private static void findSubArray(int[] is, int N) {
		System.out.println("Continuous sub array of " + Arrays.toString(is) + " whose sum is " + N + " is ");
		List<Integer> arry = new ArrayList<>(is.length);
		for (int i = 0; i < is.length; i++) {
			int tempI = is[i];
			arry.add(tempI);
			for (int j = i + 1; j < is.length; j++) {
				if (tempI + is[j] == N) {
					arry.add(is[j]);
					System.out.println(arry);
					
				} else if (tempI + is[j] < N) {
					arry.add(is[j]);
					tempI = tempI + is[j];
				} else {
					arry.clear();
					break;
				}
			}
		}
		
	}
	public static void main(String[] args) {
		findSubArray(new int[] { 42, 15, 12, 8, 6, 32 }, 26);

		findSubArray(new int[] { 12, 5, 31, 13, 21, 8 }, 49);

		findSubArray(new int[] { 15, 51, 7, 81, 5, 11, 25 }, 41);
	}


}
