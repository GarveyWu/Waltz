package Training;

import CtCILibrary.AssortedMethods;

public class BitManipulation1 {

	public static int updateBits(int a, int b, int start, int end) {
		// calculate the length of b
		String bb = Integer.toBinaryString(b);
		int bLength = bb.length();
		// put "0"s into a, to make a space
		int clear = 0;
		for (int i = 0; i < bLength; i++) {
			clear += Math.pow(2, i);
		}
		int mask = ~(clear << start);
		int a2 = a & mask;
		// use the b to update the a's space
		int b2 = b << start;
		return a2 ^ b2;
	}

	public static void main(String[] args) {

		int a = 1024;
		System.out.println(AssortedMethods.toFullBinaryString(a));
		int b = 19;
		System.out.println(AssortedMethods.toFullBinaryString(b));
		int start = 2;
		int end = 6;
		String bb = Integer.toBinaryString(b);
		System.out.println(bb);
		int bLength = bb.length();
		if ((end - start + 1) < bLength) {
			System.out.println("can not update!");
		} else {
			int c = updateBits(a, b, start, end);
			System.out.println(AssortedMethods.toFullBinaryString(c));
		}
	}
}