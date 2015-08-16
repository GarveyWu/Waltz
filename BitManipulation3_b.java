package Training;

public class BitManipulation3_b {

	public static int getNext(int n) {

		int c = n;
		int c0 = 0;
		int c1 = 0;
		// record the consecutive 0s
		while (((c & 1) == 0) && (c != 0)) {
			c0++;
			c >>= 1;
		}
		// then record the consecutive 1s
		while ((c & 1) == 1) {
			c1++;
			c >>= 1;
		}
		/*
		 * Error: if n == 11..1100...00, then there is no bigger number with the
		 * same number of 1s
		 */
		if (c0 + c1 == 31 || c0 + c1 == 0) {
			return -1;
		}
		int p = c0 + c1; // position of rightmost non-trailing zero
		n |= (1 << p);
		n &= ~((1 << p) - 1);
		n |= (1 << (c1 - 1)) - 1;
		return n;
	}
	
	public static int getPrev (int n){
		
		int temp = n;
		int c0 = 0;
		int c1 = 0;
		while(( temp & 1) == 1){
			c1++;
			temp >>= 1;
		}
		/* If temp is 0, then the number is a sequence of 0s followed by a sequence of 1s. This is already
		   the smallest number with c1 ones. Return -1 for an error.*/
		if (temp == 0){
			return -1;
		}
		while(((temp & 1) == 0) && (temp != 0)){
			c0++;
			temp >>= 1;
		}
		int p = c0 + c1; // position of right-most non-trailing one (where the right most bit is bit 0)
		n &= ((~0) << (p+1));
		int mask = (1 << (c1+1)) - 1;
		n |= mask << (c0 - 1);
		return n;
	}

	public static void main(String[] args) {

		int num = 10;
		System.out.println(Integer.toBinaryString(num));
		System.out.println(Integer.toBinaryString(getPrev(num)));
		System.out.println(Integer.toBinaryString(getNext(num)));
	}
}