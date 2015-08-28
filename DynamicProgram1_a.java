package Training;

public class DynamicProgram1_a {

	public static int countWaysRecursive(int n){
		
		if (n < 0){
			return 0;
		}else if(n == 0){
			return 1;
		}else{
			return countWaysRecursive(n - 1) + countWaysRecursive(n - 2) + countWaysRecursive(n - 3);
		}
	}

	public static void main(String[] args) {

		System.out.println(countWaysRecursive(6));
	}
}