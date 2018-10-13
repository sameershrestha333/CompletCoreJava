package interviewquestion;

/**
 * Java Program to print prime numbers from 1 to 100
 * 
 * @author sameer
 *
 */

public class PrimeNumberGenerator {

	public static void print(int n) {
		// since 1 is not prime number.
		for (int i = 2; i <= n; i++) {
			if (isPrime(i)) {
				System.out.print(i + "\n");
			}
		}

	}

	public static boolean isPrime(int num) {
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		print(10);
	}

}
