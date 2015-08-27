package Training;

public class DynamicProgram0_a {

	public static int fibonacci(int i){
		
		if (i == 0){
			return 0;
		}
		if (i == 1){
			return 1;
		}
		return fibonacci(i - 1) + fibonacci(i - 2);
	}
	
	public static void main(String[] args){
	
//		int max = 35;
//		int trials = 10;
//		double[] times = new double[max];
//		
//		for(int j = 0; j < trials; j++){
//			for (int i = 0; i < max; i++){
//				long start = System.currentTimeMillis();
//				System.out.println(fibonacci(i));
//				long end = System.currentTimeMillis();
//				long time = end - start;
//				times[i] += time;
//			}
//		}
//		
//		for (int i = 0; i < max; i++){
//			System.out.println(i + ": " + times[i]/trials + "ms");
//		}
		
		for (int i = 0; i < 10; i++){
			System.out.println(fibonacci(i));
		}
	}
}