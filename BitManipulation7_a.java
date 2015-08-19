package Training;

import java.util.ArrayList;
import java.util.Random;

public class BitManipulation7_a {

	public static ArrayList<BitInteger> initialize(int n, int missing) {

		BitInteger.INTEGER_SIZE = Integer.toBinaryString(n).length();
		ArrayList<BitInteger> array = new ArrayList<BitInteger>();
		for (int i = 1; i <= n; i++) {
			array.add(new BitInteger(i == missing ? 0 : i));
		}
		for (int i = 0; i < n; i++) {
			int rand = i + (int) (Math.random() * (n - i));
			array.get(i).swapValues(array.get(rand));
		}
		return array;
	}

	public static int findMissing(ArrayList<BitInteger> array) {

		return findMissing(array, BitInteger.INTEGER_SIZE - 1);
	}

	public static int findMissing(ArrayList<BitInteger> input, int column) {

		if (column < 0) {
			return 0;
		}
		ArrayList<BitInteger> oneBits = new ArrayList<BitInteger>(
				input.size() / 2);
		ArrayList<BitInteger> zeroBits = new ArrayList<BitInteger>(
				input.size() / 2);
		for (BitInteger t : input) {
			if (t.fetch(column) == 0) {
				zeroBits.add(t);
			} else {
				oneBits.add(t);
			}
		}
		// originally, count(0) <= count(1)
		if (zeroBits.size() <= oneBits.size()) {
			int v = findMissing(zeroBits, column - 1);
			System.out.println("+0");
			return (v << 1) | 0;
		} else {
			int v = findMissing(oneBits, column - 1);
			System.out.println("+1");
			return (v << 1) | 1;
		}
	}

	public static void main(String[] args) {

		Random rand = new Random();
		int n = rand.nextInt(10) + 1; // [1, 300000]
		int missing = rand.nextInt(n + 1);// [0, n]
		System.out.println("The array contains all numbers but one from 1 to "
				+ n + ", except for " + missing);
		ArrayList<BitInteger> array = initialize(n, missing);
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i).toInt());
		}
		int result = findMissing(array);
		if (result != missing) {
			System.out.println("Error in the algorithm!\n"
					+ "The missing number is " + missing
					+ ", but the algorithm reported ");
		} else {
			System.out.println("The missing number is " + result);
		}
	}
}