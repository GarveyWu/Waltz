package Training;

public class ArrayString4 {

	public static String replaceSpace(String str, int length) {

		char[] arr = str.toCharArray();
		int spacecount = 0;
		for (int i = 0; i < length; i++) {
			if (arr[i] == ' ') {
				spacecount++;
			}
		}
		int newlength = length + spacecount * 2;
		char[] newarr = new char[newlength];

		int index = 0;
		for (int j = 0; j < length; j++) {
			if (arr[j] == ' ') {
				newarr[index] = '%';
				newarr[index + 1] = '2';
				newarr[index + 2] = '0';
				index += 3;
			} else {
				newarr[index] = arr[j];
				index++;
			}
		}

		return new String(newarr);
	}

	public static void main(String[] args) {

		String str = "I am beautifull? Yes ";
		System.out.println(replaceSpace(str, str.length()));
	}
}