package Training;

import CtCILibrary.AssortedMethods;

public class DynamicProgram2 {

	public static int xLength = 4;
	public static int yLength = 5;
	public static int[][] maze = new int[xLength][yLength];

	public static int[][] getPaths(int[][] maze, int xLength, int yLength) {

		// initialization
		for (int i = xLength - 1; i >= 0; i--) {
			if (maze[i][yLength - 1] == 2) {
				maze[i][yLength - 1] = 0;
			} else {
				maze[i][yLength - 1] = 1;
			}
			if (i < xLength - 1 && maze[i + 1][yLength - 1] == 0) {
				maze[i][yLength - 1] = 0;
			}
		}
		for (int j = yLength - 2; j >= 0; j--) {
			if (maze[xLength - 1][j] == 2 || maze[xLength - 1][j + 1] == 0) {
				maze[xLength - 1][j] = 0;
			} else {
				maze[xLength - 1][j] = 1;
			}
		}
		// creation
		for (int i = xLength - 2; i >= 0; i--) {
			for (int j = yLength - 2; j >= 0; j--) {
				if (maze[i][j] == 2) {
					maze[i][j] = 0;
				} else {
					maze[i][j] = maze[i + 1][j] + maze[i][j + 1];
				}
			}
		}
		return maze;
	}

	public static void main(String[] args) {

		for (int i = 0; i < xLength; i++) {
			for (int j = 0; j < yLength; j++) {
				if (Math.random() < 0.2) {
					maze[i][j] = 2;
				}
			}
		}
		AssortedMethods.printMatrix(maze);
		System.out.println();
		int[][] res = getPaths(maze, xLength, yLength);
		AssortedMethods.printMatrix(res);
	}
}