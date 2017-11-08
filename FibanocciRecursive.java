package questions;

public class FibanocciRecursive {
	public static void main(String[] args) {
		long index = 0;
		while (true) {

			System.out.println(new FibanocciRecursive().fib(index));
			index++;
		}
	}

	public long fib(long n) {
		if (n == 0)
			return 0;
		if (n <= 2)
			return 1;

		long fib = fib(n - 1) + fib(n - 2);
		return fib;
	}

}
