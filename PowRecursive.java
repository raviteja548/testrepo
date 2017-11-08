package questions;

//PowRecursive autor .mulukuri
public class PowRecursive {
	// main method execution being done
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
	
	// TBD
	// creae metohds
}
