package questions;

public class FactorialRecursive {
	public static void main(String[] args) {
		int result = FactorialRecursive.factorial(5);
		System.out.println(result);
	}

	public static int factorial(int n) {
		if (n == 0)
			return 1;
		else
			return n * factorial(n - 1);

	}
}
