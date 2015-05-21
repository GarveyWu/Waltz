package Training;

public class ArrayString5 {

	public static String strCompress(String s) {

		char[] str = s.toCharArray();
		int length = s.length();
		char[] arr = new char[length * 2 + 1];// create an output

		arr[0] = str[0];
		int index = 2;
		int count = 1;
		for (int i = 1; i < length; i++) {
			if (str[i] == str[i - 1]) {
				if (i == length - 1) {
					count++;
					arr[index - 1] = (char) (count + 48);
					if ((index - 1) > (length - 1)) {
						return s;
					}
				}
				count++;
			} else {
				arr[index] = str[i];
				arr[index - 1] = (char) (count + 48);
				index += 2;
				count = 1;
				if (i == length - 1) {
					arr[index - 1] = (char) (count + 48);
					if ((index - 1) > (length - 1)) {
						return s;
					}
				}
			}
		}
		return new String(arr);
	}

	public static void main(String[] args) {

		String s = "abcccdddaceeeeeeee";
		System.out.println(strCompress(s));
	}
}