package Training;

public class TestArrayList {

	public boolean ifUnique(String s) {

		char[] ch = s.toCharArray();
		boolean check = true;

		for (int i = 0; i < ch.length - 1; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {

					return check = false;
				}
			}
		}
		return check;

	}

	public static void main(String[] args) {

		String s = "&^&abcd";

		System.out.println(new TestArrayList().ifUnique(s));

	}
}