package Training;

public class ArrayString5_b {

	public static String compressBetter(String str) {
		// check size
		int size = countCompression(str);
		if (size >= str.length()) {
			return str;
		}

		StringBuffer mystr = new StringBuffer();
		char last = str.charAt(0);
		int count = 1;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == last) {
				count++;
			} else {
				mystr.append(last);
				mystr.append(count);
				last = str.charAt(i);
				count = 1;
			}
		}
		mystr.append(last);
		mystr.append(count);
		return mystr.toString();
	}

	public static int countCompression(String str) {

		if ((str == null) || str.isEmpty()) {
			return 0;
		}
		int size = 0;
		int count = 1;
		char index = str.charAt(0);

		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == index) {
				count++;
			} else {
				index = str.charAt(i);
				size += 1 + String.valueOf(count).length();
				count = 1;
			}
		}
		return size + 1 + String.valueOf(count).length();
	}

	public static void main(String[] args) {

		String str = "aabcccddeefff";
		System.out.println(compressBetter(str));
	}
}