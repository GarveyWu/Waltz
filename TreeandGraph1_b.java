package Training;

import CtCILibrary.TreeNode;

public class TreeandGraph1_b {

	public static int checkHeight(TreeNode root) {

		if (root == null) {
			return 0;
		}
		int leftHeight = checkHeight(root.left);
		if (leftHeight == -1) {
			return -1;
		}
		int rightHeight = checkHeight(root.right);
		if (rightHeight == -1) {
			return -1;
		}
		int heightDiff = leftHeight - rightHeight;
		if (Math.abs(heightDiff) > 1) {
			return -1;
		} else {
			return Math.max(leftHeight, rightHeight) + 1;
		}
	}

	public static boolean isBalanced(TreeNode root) {

		if (checkHeight(root) == -1) {
			return false;
		} else {
			return true;
		}
	}

	public static void main(String[] args) {
		// create a balanced tree
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		TreeNode root = TreeNode.createMinimalBST(array);
		System.out.println("Root? " + root.data);
		System.out.println("Is balanced? " + isBalanced(root));
		root.insertInOrder(4);// add 4 to make it unbalanced
		System.out.println("Root? " + root.data);
		System.out.println("Is balanced? " + isBalanced(root));
	}
}