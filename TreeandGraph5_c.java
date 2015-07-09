package Training;

import CtCILibrary.TreeNode;

public class TreeandGraph5_c {

	public static boolean checkBST(TreeNode root) {

		return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	public static boolean checkBST(TreeNode root, int min, int max) {

		if (root == null) {
			return true;
		}
		if (root.data <= min || root.data > max) {
			return false;
		}
		if (!checkBST(root.left, min, root.data)
				|| !checkBST(root.right, root.data, max)) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {

		int[] array = { 1, 3, 5, 6, 10, 13, 15, 20 };
		TreeNode node = TreeNode.createMinimalBST(array);
		node.print();
		System.out.println(checkBST(node));
	}
}