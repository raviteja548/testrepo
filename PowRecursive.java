package questions;
//PowRecursive
public class PowRecursive {
<<<<<<< .mine
	// main method execution
=======
	//main method
>>>>>>> .theirs
	public static void main(String[] args) {
		int n = PowRecursive.pow(2, 6);
		System.out.println(n);
	}

	public static int pow(int num, int count) {
		if (count == 0)
			return 1;
		int result = num * pow(num, count - 1);
		return result;
	}
}
