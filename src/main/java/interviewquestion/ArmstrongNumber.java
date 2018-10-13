package interviewquestion;

public class ArmstrongNumber {
	public static boolean checkArmstrongNumber(int num) {
		int numSize = Integer.toString(num).length();
		int copyOfNumber = num;
		int sum = 0;
		while (num != 0) {
			int temp = 1;
			int lastDigit = num % 10;
			for (int i = 0; i < numSize; i++) {
				temp = temp * lastDigit;
			}
			sum = temp + sum;
			num = num / 10;
		}
		return (copyOfNumber == sum);
	}

	public static void main(String[] args) {
		System.out.println(checkArmstrongNumber(153));

		System.out.println(checkArmstrongNumber(371));

		System.out.println(checkArmstrongNumber(9474));

		System.out.println(checkArmstrongNumber(54748));

		System.out.println(checkArmstrongNumber(407));

		System.out.println(checkArmstrongNumber(1674));

	}

}
