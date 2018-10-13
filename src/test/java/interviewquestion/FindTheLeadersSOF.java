package interviewquestion;

import java.util.LinkedList;
import java.util.List;

public class FindTheLeadersSOF {

	static void findTheLeaders() {
		int[] inputArray = new int[] { 12, 9, 7, 14, 8, 6, 3 };
		List<Integer> leaderArray = new LinkedList<>();

		int inputArrayLength = inputArray.length;

		int max = inputArray[inputArrayLength - 1];
		leaderArray.add(max);

		// Traversing the remaining elements from right to left
		for (int i = inputArray.length - 2; i >= 0; i--) {

			if (inputArray[i] > max) {
				max = inputArray[i];
				leaderArray.add(max);
			}
		}
		System.out.println(leaderArray);
	}

	public static void main(String[] args) {
		findTheLeaders();

	}

}
