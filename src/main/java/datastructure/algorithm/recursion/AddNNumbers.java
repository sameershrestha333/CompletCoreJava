package datastructure.algorithm.recursion;

public class AddNNumbers {

	public int findTotalIteratively(int N) {
		int result = 0;
		for (int i = 1; i <= N; i++)
			result += i;
		
		return result;
	}

	public int findTotalRecursively(int N) {
		if (N == 1)
			return 1;
		else
			return N + findTotalIteratively(N - 1);

	}

	public static void main(String[] args) {

	}

}
