package Training;

import java.awt.Point;
import java.util.ArrayList;

import CtCILibrary.AssortedMethods;

public class DynamicProgram2_b {

	public static int size = 5;
	public static int[][] maze = new int[size][size];

	public static boolean isFree(int x, int y) {

		if (maze[x][y] == 0) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean getPath(int x, int y, ArrayList<Point> path) {

		if (x < 0 || y < 0 || !isFree(x, y)) {
			return false;
		}
		boolean isAtOrigin = (x == 0) && (y == 0);
		if (isAtOrigin || getPath(x, y - 1, path) || getPath(x - 1, y, path)) {
			Point p = new Point(x, y);
			path.add(p);
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		maze = AssortedMethods.randomMatrix(size, size, 0, 5);
		AssortedMethods.printMatrix(maze);
		ArrayList<Point> path = new ArrayList<Point>();
		boolean success = getPath(size - 1, size - 1, path);
		if (success) {
			String s = AssortedMethods.listOfPointsToString(path);
			System.out.println(s);
		} else {
			System.out.println("No path found.");
		}
	}
}