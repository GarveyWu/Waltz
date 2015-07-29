package Training;

public class BitManipulation2_b {

	public static String printBinary(double num) {

		if (num >= 1 || num <= 0) {
			return "Error";
		}
		StringBuilder binary = new StringBuilder();
		double frac = 0.5;
		binary.append(".");
		while (num > 0) {
			if (binary.length() >= 32) {
				return "Error";
			}
			if (num >= frac) {
				binary.append(1);
				num -= frac;
			} else {
				binary.append(0);
			}
			frac /= 2;
		}
		return binary.toString();
	}

	public static void main(String[] args) {

		double d = 0.625;
		String s = printBinary(d);
		System.out.println(s);
	}
}