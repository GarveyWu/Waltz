package Training;

import CtCILibrary.AssortedMethods;

public class BitManipulation1_a {

	public static int updateBits(int n, int m, int i, int j) {

		if (i >= 32 || j < i) {
			return 0;
		}
		int allOnes = ~0;
		int left = allOnes << (j + 1);
		int right = ((1 << i) - 1);
		int mask = left | right;
		int n_cleared = n & mask;
		int m_shifted = m << i;
		return n_cleared | m_shifted;
	}

	public static void main(String[] args) {

		int a = 1024;
		System.out.println(AssortedMethods.toFullBinaryString(a));
		int b = 19;
		System.out.println(AssortedMethods.toFullBinaryString(b));
		int c = updateBits(a, b, 2, 6);
		System.out.println(AssortedMethods.toFullBinaryString(c));
	}
}