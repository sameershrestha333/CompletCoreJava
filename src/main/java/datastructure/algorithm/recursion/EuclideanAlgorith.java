package datastructure.algorithm.recursion;

public class EuclideanAlgorith {

	public int getGCD(int num1, int num2) {
		while (num2 != 0) {
			int temp = num2;
			num2 = num1 % num2;
			num1 = temp;
		}
		return num1;
	}

	public Object getGCDRecursively(int num1, int num2) {
		if (num2 == 0)
			return num1;

		return getGCDRecursively(num2, num1 % num2);
	}

}
