package datastructure.algorithm.recursion;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(calculateFactorial(4));
	}

	private static int calculateFactorial(int N) {
		return factorial(1, N);
	}

	private static int factorial(int accumulator, int N) {
		if (N == 1)
			return accumulator;
		return factorial(accumulator * N, N - 1);
	}

}
