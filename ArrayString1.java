package Training;

public class ArrayString1 {

	public static boolean ifUnique(String s) {

		char[] ch = s.toCharArray();

		for (int i = 0; i < ch.length - 1; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {

					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {

		String s = "love";

		System.out.println(ifUnique(s));

	}
}