package Training;

public class DynamicProgram1 {

	public static int countWays(int num) {

		if (num == 1) {
			return 1;
		}
		if (num == 2) {
			return 2;
		}
		int[] ways = new int[num];
		ways[0] = 1;
		ways[1] = 2;
		ways[2] = 4;
		for (int i = 3; i < ways.length; i++) {
			ways[i] = ways[i - 1] + ways[i - 2] + ways[i - 3];
		}
		return ways[num - 1];
	}

	public static void main(String[] args) {

		System.out.println(countWays(9));
	}
}