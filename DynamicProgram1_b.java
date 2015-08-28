package Training;

public class DynamicProgram1_b {

	public static int countWaysDP(int n, int[] map) {

		if (n < 0) {
			return 0;
		} else if (n == 0) {
			return 1;
		} else if (map[n] > -1) {
			return map[n];
		} else {
			map[n] = countWaysDP(n - 1, map) + countWaysDP(n - 2, map)
					+ countWaysDP(n - 3, map);
			return map[n];
		}
	}

	public static void main(String[] args) {

		int num = 4;
		int[] map = new int[num + 1];
		for (int j = 0; j < map.length; j++) {
			map[j] = -1;
		}
		System.out.println(countWaysDP(num, map));
	}
}