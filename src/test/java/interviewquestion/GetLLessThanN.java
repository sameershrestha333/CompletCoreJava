package interviewquestion;

/**
 * Write a java program to find the largest number ‘L’ less than a given number
 * ‘N’ which should not contain a given digit ‘D’. For example, If 145 is the
 * given number and 4 is the given digit, then you should find the largest
 * number less than 145 such that it should not contain 4 in it. In this case,
 * 139 will be the answer.
 * 
 * @author sameer
 *
 */
public class GetLLessThanN {

	public static void main(String[] args) {
		System.out.println(getNUsingForLoop(145, 4));
	}

	public static int getN(int N, int D) {
		while (N != 0) {
			N = N - 1;
			char charD = (char) (D + '0');
			// char charD = Integer.toString(D).charAt(0);
			String strN = String.valueOf(N);
			if (strN.indexOf(charD) == -1) {
				return N;
			}
		}

		return -1;
	}

	public static int getNUsingForLoop(int N, int D) {
		char charD = (char) (D + '0');
		for (int i = N; i > 0; --i) {
			String strN = String.valueOf(i);
			if (strN.indexOf(charD) == -1) {
				return i;
			}
		}

		return -1;
	}

}
