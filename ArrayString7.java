package Training;

public class ArrayString7 {

	public static void crossZero(int[][] matrix, int m, int n) {

		int[] row = new int[m];
		int[] column = new int[n];
		// check '0's
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == 0) {
					row[i] = 1;
					column[j] = 1;
				}
			}
		}
		// assign '0's to rows and columns
		for (int k = 0; k < m; k++) {
			if (row[k] == 1) {
				setRowZero(matrix, n, k);
			}
		}
		for (int k = 0; k < n; k++) {
			if (column[k] == 1) {
				setColumnZero(matrix, m, k);
			}
		}
	}

	public static void setRowZero(int[][] matrix, int n, int k) {

		for (int i = 0; i < n; i++) {
			matrix[k][i] = 0;
		}
	}

	public static void setColumnZero(int[][] matrix, int m, int k) {

		for (int i = 0; i < m; i++) {
			matrix[i][k] = 0;
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
		crossZero(matrix, 3, 6);
		printMatrix(matrix, 3, 6);
	}
}