public class Main {

	public static void main(String[] args) {

		int n1 = 1;
		int n2 = 20;
		int count = 0;
		for (int i = n1 + 1; i < n2; i++) {
			String binary = convertBinary(i);
			String mirrorBinary = sort(binary);
			int decimal = convertDecimal(mirrorBinary);
			if (i == decimal) {
				count++;
			}
		}
		System.out.print(count);
	}

	private static String convertBinary(int n) {
		String ret = "";
		while (1 < n) {
			int rest = n % 2;
			ret = rest + ret;
			n = n / 2;
		}
		ret = n + ret;
		return ret;
	}

	private static int convertDecimal(String binary) {
		int ret = 0;

		for (int i = 0; i < binary.length(); i++) {
			int n = Integer.valueOf(binary.substring(i, i + 1));
			int n2 = (int) Math.pow(2, (binary.length() - (i + 1)));
			ret = ret + (n * n2);
		}
		return ret;
	}

	private static String sort(String str) {
		String ret = "";
		for (int i = 0; i < str.length(); i++) {
			ret = str.charAt(i) + ret;
		}
		return ret;
	}

}
