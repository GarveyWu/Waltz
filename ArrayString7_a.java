package Training;

public class ArrayString7_a {

	public static void setZeros(int[][] matrix) {

		boolean[] row = new boolean[matrix.length];
		boolean[] column = new boolean[matrix[0].length];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					row[i] = true;
					column[j] = true;
				}
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (row[i] || column[j]) {
					matrix[i][j] = 0;
				}
			}
		}
	}

	public static int[][] simpleMatrix(int row, int column) {

		int[][] matrix = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrix[i][j] = 1;
			}
		}
		return matrix;
	}

	public static void printMatrix(int[][] matrix, int row, int column) {

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// original
		int[][] matrix = simpleMatrix(3, 6);
		printMatrix(matrix, 3, 6);

		System.out.println();
		// set some elements to be '0'
		matrix[0][0] = 0;
		matrix[0][3] = 0;
		matrix[0][3] = 0;
		matrix[2][0] = 0;
		matrix[2][3] = 0;
		printMatrix(matrix, 3, 6);

		System.out.println();
		// after process
		setZeros(matrix);
	    printMatrix(matrix, 3, 6);
	}
}