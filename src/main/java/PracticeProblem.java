public class PracticeProblem {
	public static void main(String args[]) {

	}

	public static int calculate(int a, int b, char c) {
		switch (c) {
			case ('+'): return a + b;
			case ('-'): return a - b;
			case ('*'): return a * b;
			case ('/'): return a / b;
			case ('%'): return a % b;
			case ('^'): return (int)Math.pow(a, b);
			default: return -1;
		}
	}

	public static boolean totalWordsChecker(String a) {
		return a.split(" ").length <= 10 ? true : false;
	}

	public static String minString(String a, String b, String c) {
		a = a.toLowerCase();
		b = b.toLowerCase();
		c = c.toLowerCase();
		if (a.compareTo(b) < 0 && a.compareTo(c) < 0) {
			return a;
		} else if (b.compareTo(a) < 0 && b.compareTo(c) < 0) {
			return b;
		} else {
			return c;
		}

	}
}
