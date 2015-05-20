package Training;

import java.util.Arrays;

public class ArrayString3_a {
	
	public static String sort (String s){
		
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		return new String(ch);
	}
	
	public static boolean isPermutation (String s1, String s2){
		
		if (s1.length() != s2.length()){
			return false;
		}
		return sort(s1).equals(sort(s2));	
	} 
	
	public static void main(String[] args) {

		String s1 = "h gfdsa ";
		String s2 = "  asdfgh";

		System.out.println(isPermutation(s1,s2));
	}
}