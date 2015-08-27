package Training;

public class DynamicProgram0 {

	public static int fibonacci(int num) {

		if (num == 0) {
			return 0;
		}
		if (num == 1) {
			return 1;
		}
		int[] fib = new int[num + 1];
		fib[0] = 0;
		fib[1] = 1;
		for (int i = 2; i < fib.length; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
		}
		return fib[num];
	}

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println(fibonacci(i));
		}
	}
}
