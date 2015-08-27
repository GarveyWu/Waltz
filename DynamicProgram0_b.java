package Training;

public class DynamicProgram0_b {

	public static int max = 100;

	public static int[] fib = new int[max];

	public static int fibonacci(int i) {

		if (i == 0) {
			return 0;
		}
		if (i == 1) {
			return 1;
		}
		if (fib[i] != 0) {
			return fib[i];
		}
		fib[i] = fibonacci(i - 1) + fibonacci(i - 2);
		return fib[i];
	}

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println(fibonacci(i));
		}
	}
}