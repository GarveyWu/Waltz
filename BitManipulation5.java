package Training;

public class BitManipulation5 {

	public static int bitSwapRequired(int a, int b) {

		int count = 0;
		while (a > 0) {
			if (((a & 1) == 1) && ((b & 1) == 0)) {
				count++;
			}
			if (((a & 1) == 0) && ((b & 1) == 1)) {
				count++;
			}
			a >>= 1;
			b >>= 1;
		}
		while (b > 0) {
			if ((b & 1) == 1) {
				count++;
			}
			b >>= 1;
		}
		return count;
	}

	public static void main(String[] args) {

		int a = 4;
		int b = 31;
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
		System.out.println(bitSwapRequired(a, b));
	}
}
