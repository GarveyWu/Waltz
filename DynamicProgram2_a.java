package Training;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Hashtable;

import CtCILibrary.AssortedMethods;

public class DynamicProgram2_a {

	public static int size = 4;
	public static int[][] maze = new int[size][size];

	public static boolean isFree(int x, int y) {

		if (maze[x][y] == 0) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean getPath(int x, int y, ArrayList<Point> path,
			Hashtable<Point, Boolean> cache) {
		/* If out of bounds or not available, return false. */
		if (y < 0 || x < 0 || !isFree(x, y)) {
			return false;
		}
		/* If we've already visited this cell, return directly. */
		Point p = new Point(x, y);
		if (cache.containsKey(p)) {
			System.out.print(" " + (int) p.getX() + " ");
			System.out.print((int) p.getY() + " ");
			System.out.println(cache.get(p));
			return cache.get(p);
		}
		boolean isAtOrigin = (x == 0) && (y == 0);
		boolean success = false;
		/*
		 * If there's a path from the start to my current location, add the
		 * path.
		 */
		if (isAtOrigin || getPath(x, y - 1, path, cache)
				|| getPath(x - 1, y, path, cache)) {
			path.add(p);
			success = true;
		}
		/* put to the cache */
		cache.put(p, success);
		System.out.print((int) p.getX() + " ");
		System.out.print((int) p.getY() + " ");
		System.out.println(cache.get(p));
		return success;
	}

	public static void main(String[] args) {

		maze = AssortedMethods.randomMatrix(size, size, 0, 5);
		AssortedMethods.printMatrix(maze);
		ArrayList<Point> path = new ArrayList<Point>();
		Hashtable<Point, Boolean> cache = new Hashtable<Point, Boolean>();
		boolean success = getPath(size - 1, size - 1, path, cache);
		if (success) {
			String s = AssortedMethods.listOfPointsToString(path);
			System.out.println("Path: " + " " + s);
		} else {
			System.out.println("No path exists.");
		}
		// for (Point elem : path) {
		// System.out.print((int) elem.getX() + " ");
		// System.out.print((int) elem.getY() + " ");
		// System.out.println(cache.get(elem));
		// }
		// System.out.println();
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				Point p = new Point(i, j);
				System.out.print((int) p.getX() + " ");
				System.out.print((int) p.getY() + " ");
				System.out.println(cache.get(p));
			}
		}
	}
}