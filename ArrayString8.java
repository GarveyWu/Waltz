package Training;

public class ArrayString8 {

	public static boolean isRotation(String s2, String s1) {

		if (s2.length() != s1.length()) {
			return false;
		}
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == s2.charAt(0)) {
				String t = s1.substring(i);
				String h = s1.substring(0, i);
				String nStr = t + h;
				if (nStr.equals(s2)){
					return true;
				}else{
					continue;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {

		String s1 = "erbottlewat";
		String s2 = "waterbottle";
		System.out.println(isRotation(s2, s1));
	}
}