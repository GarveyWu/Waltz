package Training;

public class ArrayString6 {

	public static void rotate(int[][] matrix, int n) {

		for (int layer = 0; layer < n / 2; layer++) {
			int first = layer;
			int last = n - 1 - layer;
			for (int i = first; i < last; i++) {
				int offset = i - first;
				// save top
				int top = matrix[first][i];
				//left -> top
				matrix[first][i] = matrix[last - offset][first];
				//bottom -> left
				matrix[last - offset][first] = matrix[last][last - offset];
				//right -> bottom
				matrix[last][last - offset] = matrix[i][last];
				//top -> right
				matrix[i][last] = top;
			}
		}
	}

	public static int[][] simpleMatrix(int di) {

		int[][] matrix = new int[di][di];
		for (int i = 0; i < di; i++) {
			for (int j = 0; j < di; j++) {
				matrix[i][j] = j;
			}
		}
		return matrix;
	}

	public static void printMatrix(int[][] matrix, int di) {

		for (int i = 0; i < di; i++) {
			for (int j = 0; j < di; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		//before
		int[][] matrix = simpleMatrix(8);
		printMatrix(matrix, 8);

		System.out.println();
		//after
		rotate(matrix, 8);
		printMatrix(matrix, 8);
	}
}