package Training;

public class ArrayString5_c {

	public static String compressAlternate(String str) {

		int size = countCompression(str);
		if (size >= str.length()) {
			return str;
		}
		char[] arr = new char[size];
		int index = 0;
		char last = str.charAt(0);
		int count = 1;
		for (int i = 1; i<str.length(); i++){
			if (str.charAt(i) == last){
				count++;
			}else{
				index = setChar(arr, last, index, count);
				last = str.charAt(i);
				count = 1;
			}
		}
		index = setChar(arr, last, index, count);
		return String.valueOf(arr);
	}

	public static int setChar(char[] arr, char last, int index, int count) {

		arr[index] = last;
		index++;
		char[] cnt = String.valueOf(count).toCharArray();
		for (char x: cnt){
			arr[index] = x;
			index++;
		}
		return index;
	}

	public static int countCompression(String str) {

		if ((str == null) || (str.isEmpty())) {
			return 0;
		}
		int size = 0;
		char last = str.charAt(0);
		int count = 1;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == last) {
				count++;
			} else {
				size += 1 + String.valueOf(count).length();
				last = str.charAt(i);
				count = 1;
			}
		}
		size += 1 + String.valueOf(count).length();
		return size;
	}

	public static void main(String[] args) {

		String str = "aaaaabbbbbccc";
		System.out.println(compressAlternate(str));

	}

}
