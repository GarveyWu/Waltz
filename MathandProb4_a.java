package Training;

public class MathandProb4_a {

	public static int randomInt(int n) {

		return (int) (Math.random() * n);
	}

	public static int negate(int a) {

		int neg = 0;
		int d = a < 0 ? 1 : -1;
		while (a != 0) {
			neg += d;
			a += d;
		}
		return neg;
	}

	public static int minus(int a, int b) {

		return a + negate(b);
	}

	public static int abs(int a) {

		if (a < 0) {
			return negate(a);
		} else {
			return a;
		}
	}

	public static int multiply(int a, int b) {

		if (a < b) {
			return multiply(b, a);
		}
		int sum = 0;
		for (int i = abs(b); i > 0; i--) {
			sum += a;
		}
		if (b < 0) {
			sum = negate(sum);
		}
		return sum;
	}

	public static int divide(int a, int b) throws Exception {

		if (b == 0) {
			throw new Exception("ERROR: Divide by zero.");
			// throw new ArithmeticException("ERROR: Divide by zero.");
		}
		int absa = abs(a);
		int absb = abs(b);
		int product = 0;
		int x = 0;
		while (product + absb <= absa) {
			product += absb;
			x++;
		}
		if ((a < 0 && b < 0) || (a > 0 && b > 0)) {
			return x;
		} else {
			return negate(x);
		}
	}

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			int a = randomInt(10);
			int b = randomInt(10);
			int ans = minus(a, b);
			if (ans != a - b) {
				System.out.println("ERROR");
			}
			System.out.println(a + " - " + b + " = " + ans);
		}

		for (int i = 0; i < 10; i++) {
			int a = randomInt(10);
			int b = randomInt(10);
			int ans = multiply(a, b);
			if (ans != a * b) {
				System.out.println("ERROR");
			}
			System.out.println(a + " * " + b + " = " + ans);
		}

		for (int i = 0; i < 10; i++) {
			int a = randomInt(10) + 1;
			int b = randomInt(10);
			// int ans = divide (a, b);
			try {
				int ans = divide(a, b);
				if (ans != a / b) {
					System.out.println("ERROR");
				}
				System.out.println(a + " / " + b + " = " + ans);
			} catch (Exception e) {
				System.out.print(a + " / " + b + " ");
				System.out.println(e.getMessage());
			}
		}
	}
}
