package Training;

import CtCILibrary.AssortedMethods;

public class BitManipulation5_b {

	public static int bitSwapRequired2(int a, int b) {

		int count = 0;
		for (int c = a ^ b; c != 0; c = c & (c - 1)) {
			count++;
		}
		return count;
	}

	public static void main(String[] args) {

		int a = 4;
		int b = 31;
		System.out.println(a + ": " + AssortedMethods.toFullBinaryString(a));
		System.out.println(b + ": " + AssortedMethods.toFullBinaryString(b));
		int nbits2 = bitSwapRequired2(a, b);
		System.out.println("Required number of bits: " + nbits2);
	}
}