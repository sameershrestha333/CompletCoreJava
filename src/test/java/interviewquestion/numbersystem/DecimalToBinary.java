package interviewquestion.numbersystem;

public class DecimalToBinary {
	public static void main(String[] args) {
		System.out.println(decToBinary(50));
	}

	private static int decToBinary(int N) {
		StringBuilder builder = new StringBuilder();
		int base = 2;
		while (N != 0) {
			int reminder = N % base;
			builder.append(reminder);
			N = N / base;

		}
		return Integer.parseInt(builder.reverse().toString());
	}
}
