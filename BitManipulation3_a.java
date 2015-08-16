package Training;

public class BitManipulation3_a {

	public static int countOnes(int i) {

		int count = 0;
		while (i > 0) {
			if ((i & 1) == 1) {
				count++;
			}
			i = i >> 1;
		}
		return count;
	}

	public static boolean hasValidPrev(int i) {

		while ((i & 1) == 1) {
			i >>= 1;
		}
		if (i == 0) {
			return false;
		}
		return true;
	}

	// e.x. '111' has not the previous one
	public static int getPrevSlow(int i) {

		if (!hasValidPrev(i)) {
			return -1;
		}
		int num_ones = countOnes(i);
		i--;
		while (countOnes(i) != num_ones) {
			i--;
		}
		return i;
	}

	// '2147483647' is the max number, which has 31's '1', as '1111....0000',
	// if we fix the digit numbers, we also cannot find the next one
	public static boolean hasValidNext(int i) {

		if (i == 0) {
			return false;
		}
		int count = 0;
		while ((i & 1) == 0) {
			i >>= 1;
			count++;
		}
		while ((i & 1) == 1) {
			i >>= 1;
			count++;
		}
		if (count == 31) {
			return false;
		}
		return true;
	}

	public static int getNextSlow(int i) {

		if (!hasValidNext(i)) {
			return -1;
		}
		int num_ones = countOnes(i);
		i++;
		while (countOnes(i) != num_ones) {
			i++;
		}
		return i;
	}

	public static void main(String[] args) {

		int num = 6;
		System.out.println(Integer.toBinaryString(num));
		System.out.println(Integer.toBinaryString(getPrevSlow(num)));
		System.out.println(Integer.toBinaryString(getNextSlow(num)));
	}
}
