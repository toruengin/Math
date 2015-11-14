public class PrimeNumberSeeker {
	public static void main(String args[]) {

		int n = 5;
		for (int i = 0; i < n; i++) {
			System.out.println("Number:" + i + " = " + isPrimeNumber(i));
		}
	}

	private static boolean isPrimeNumber(int n) {
		if (n == 1) {
			return false;
		} else if (n == 2) {
			return true;
		} else if ((n % 2) == 0) {
			return false;
		} else {
			for (int i = 3; i < n; i++) {
				if ((n % i) == 0) {
					return false;
				}
			}
		}
		return true;
	}
}
