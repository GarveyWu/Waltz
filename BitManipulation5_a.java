package Training;

import CtCILibrary.AssortedMethods;

public class BitManipulation5_a {

	public static int bitSwapRequired(int a, int b) {

		int count = 0;
		for (int c = a ^ b; c != 0; c = c >> 1) {
			count += c & 1;
		}
		return count;
	}

	public static void main(String[] args) {

		int a = 14;
		int b = 31;
		System.out.println(a + ": " + AssortedMethods.toFullBinaryString(a));
		System.out.println(b + ": " + AssortedMethods.toFullBinaryString(b));
		int nbits = bitSwapRequired(a, b);
		System.out.println("Required number of bits: " + nbits);
	}
}
