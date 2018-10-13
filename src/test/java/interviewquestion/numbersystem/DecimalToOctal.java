package interviewquestion.numbersystem;

public class DecimalToOctal {
	public static void main(String[] args) {
		System.out.println(decimalToOctal(1000));
	}

	private static int decimalToOctal(int N) {
		StringBuilder builder = new StringBuilder();
		while (N != 0) {
			int reminder = N % 8;
			builder.append(reminder);
			N = N / 8;
		}
		return Integer.parseInt(builder.reverse().toString());
	}
}
