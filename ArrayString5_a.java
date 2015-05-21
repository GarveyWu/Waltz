package Training;

public class ArrayString5_a {

	public static String compressBad(String str) {

		String mystr = "";
		char index = str.charAt(0);
		int count = 1;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == index) {
				count++;
			} else {
				mystr += "" + index + count;//bad time complexity
				index = str.charAt(i);
				count = 1;
			}

		}
		return mystr + index + count;
	}

	public static void main(String[] args) {

		String str = "aaaabbbccccuuuuuuuuuuuu";
		System.out.println(compressBad(str));
	}
}