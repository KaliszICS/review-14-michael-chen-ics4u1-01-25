import java.util.ArrayList;

public class PracticeProblem {
	public static void main(String args[]) {

	}

	final static int MAXIMUM = 10;

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

	public static boolean totalWordsChecker(String m) {
		String[] b = m.split("[^A-Za-z'_]");
		ArrayList<String> c = new ArrayList<String>();
		for (int i = 0; i < b.length; i++) {
			if (b[i].strip() != "") {
			    //System.out.println(b[i]);
				c.add(b[i]);
			}
		}
		return c.size() <= MAXIMUM ? true : false;
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
