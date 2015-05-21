package Training;

public class ArrayString4_a {

	public static void replaceSpaces(char[] str, int length) {

		int spaceCount = 0;
		int index;

		for (int i = 0; i < length; i++) {
			if (str[i] == ' ') {
				spaceCount++;
			}
		}

		index = length + spaceCount * 2;
		str[index] = '\0';
		for (int i = length - 1; i >= 0; i--) {
			if (str[i] == ' ') {
				str[index - 1] = '0';
				str[index - 2] = '2';
				str[index - 3] = '%';
				index -= 3;
			} else {
				str[index - 1] = str[i];
				index --;
			}
		}
	}

	public static void main(String[] args) {

		String str = "abc d e f";
		char[] arr = new char[144];
		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}

		replaceSpaces(arr, str.length());
		System.out.println(new String(arr));
	}
}