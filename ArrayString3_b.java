package Training;

public class ArrayString3_b {

	public static boolean isPermutation(String s1, String s2){
		
		if (s1.length() != s2.length()){
			return false;
		}
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		
		int[] check_set = new int[256];
		
		for (char c: ch1){
			check_set[c]++;
		}
		for (int i = 0; i<s2.length(); i++){
			
			int c = (int)s2.charAt(i);
			if(--check_set[c] < 0){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		String s1 = "a b c";
		String s2 = "abc  ";

		System.out.println(isPermutation(s1, s2));
	}
}