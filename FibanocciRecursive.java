package questions;

public class FibanocciRecursive {
	public static void main(String[] args) {
		long index = 0;
		while (true) {

			System.out.println(new FibanocciRecursive().fib(index));
			index++; //updating index by 1
		}
	}
// adding comments from user2
//change2
	public long fib(long n) {
		if (n == 0)
			return 0;
		if (n <= 2)
			return 1;

		long fib = fib(n - 1) + fib(n - 2); //recursive call user1 fib
		return fib;
	}

}
