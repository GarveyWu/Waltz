package Training;

public class BitManipulation2 {

	public static String printBinary(double d){
		
		String s = "0.";
		for (int i = 0; i<32; i++){
			d = d * 2;
			double df = Math.floor(d);
			int j = (int)df;
			s = s + Integer.toString(j);
			if (d - df == 0){
				return s;
			}
			if (d >= 1){
				d = d - 1;
			}
		}
		return null;
	}

	public static void main(String[] args) {

		double d = 0.625;
		String s = printBinary(d);
		System.out.println(s);
	}
}