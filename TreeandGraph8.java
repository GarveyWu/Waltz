package Training;

import CtCILibrary.AssortedMethods;
import CtCILibrary.TreeNode;

public class TreeandGraph8 {

	public static boolean checkTree(TreeNode t1, TreeNode t2) {

		if (t1.data != t2.data) {
			return false;
		}
		if (t1.left != null && t2.left != null) {
			if (!checkTree(t1.left, t2.left)) {
				return false;
			}
		} else if (t2.left != null && t1.left == null) {
			return false;
		}
		if (t1.right != null && t2.right != null) {
			if (!checkTree(t1.right, t2.right)) {
				return false;
			}
		} else if (t2.right != null && t1.right == null) {
			return false;
		}
		return true;
	}

	public static void containsTree(TreeNode t1, TreeNode t2) {

		if (t1 == null) {
			return;
		}
		containsTree(t1.left, t2);
		if (t1.data == t2.data) {
			if (checkTree(t1, t2)) {
				System.out.println("t2 is a subtree of t1");
			}
		}
		containsTree(t1.right, t2);
	}

	public static void main(String[] args) {

		int[] array1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
		int[] array2 = { 2, 4, 5, 8, 9, 10, 11 };
		TreeNode t1 = AssortedMethods.createTreeFromArray(array1);
		TreeNode t2 = AssortedMethods.createTreeFromArray(array2);
		t1.print();
		t2.print();
		containsTree(t1, t2);
	}
}
