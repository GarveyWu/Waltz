package Training;

public class ArrayString1_b {

	public static boolean isUnique(String s) {

		int checker = 0;
		for (int i = 0; i < s.length(); i++) {
			int val = s.charAt(i) - 'a';// generate integer from 0 ~ 25
			if ((checker & (1 << val)) > 0) {
				return false;
			}
			checker = checker | (1 << val);
		}
		return true;
	}

	public static void main(String[] args) {

		String s = "like";

		System.out.println(isUnique(s));

	}
}