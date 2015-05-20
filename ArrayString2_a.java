package Training;

public class ArrayString2_a {

	public static char[] reverse(String s) {

		char[] ch = s.toCharArray();
		int l = s.length();
		char[] re = new char[l];
		
		for (int i = l-1; i>=0; i--){
			re[l-1-i] = ch[i];
		}
		return re;
	}
	
	public static void main(String[] args) {

		String s = "invincible";

		System.out.println(reverse(s));

	}
}