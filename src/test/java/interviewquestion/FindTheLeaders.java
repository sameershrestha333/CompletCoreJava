package interviewquestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindTheLeaders {

	static void findTheLeaders(int inputArray[]) {
		List<Integer> leaderArray = new ArrayList<>(inputArray.length);

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
		Collections.reverse(leaderArray);
		System.out.println(leaderArray);
	}

	public static void main(String[] args) {
		findTheLeaders(new int[] { 12, 9, 7, 14, 8, 6, 3 });

		findTheLeaders(new int[] { 8, 23, 19, 21, 15, 6, 11 });

		findTheLeaders(new int[] { 55, 67, 71, 57, 51, 63, 38 });

		findTheLeaders(new int[] { 21, 58, 44, 14, 51, 36, 23 });
	}

}
