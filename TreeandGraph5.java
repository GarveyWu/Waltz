package Training;

import CtCILibrary.TreeNode;

public class TreeandGraph5 {

	public static boolean checkBST(TreeNode node) {

		if ((node.left == null) && (node.right == null)) {
			return true;
		} else if ((node.left == null) && (node.data <= node.right.data)
				&& (checkRightBST(node.right, node))) {
			return true;
		} else if ((node.right == null) && (node.data > node.left.data)
				&& (checkLeftBST(node.left, node))) {
			return true;
		} else {
			return ((node.data <= node.right.data)
					&& (node.data > node.left.data)
					&& (checkRightBST(node.right, node)) && (checkLeftBST(
						node.left, node)));
		}
	}

	public static boolean checkRightBST(TreeNode node, TreeNode father) {

		if ((node.left == null) && (node.right == null)) {
			return true;
		} else if ((node.left == null) && (node.data <= node.right.data)
				&& (checkRightBST(node.right, node))) {
			return true;
		} else if ((node.right == null) && (node.data > node.left.data)
				&& (node.left.data >= father.data)
				&& (checkLeftBST(node.left, node))) {
			return true;
		} else {
			return ((node.data <= node.right.data)
					&& (node.data > node.left.data)
					&& (node.left.data >= father.data)
					&& (checkRightBST(node.right, node)) && (checkLeftBST(
						node.left, node)));
		}
	}

	public static boolean checkLeftBST(TreeNode node, TreeNode father) {

		if ((node.left == null) && (node.right == null)) {
			return true;
		} else if ((node.left == null) && (node.data <= node.right.data)
				&& (node.right.data < father.data)
				&& (checkRightBST(node.right, node))) {
			return true;
		} else if ((node.right == null) && (node.data > node.left.data)
				&& (checkLeftBST(node.left, node))) {
			return true;
		} else {
			return ((node.data <= node.right.data)
					&& (node.data > node.left.data)
					&& (node.right.data < father.data)
					&& (checkRightBST(node.right, node)) && (checkLeftBST(
						node.left, node)));
		}
	}

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6, 7 };
		TreeNode node = TreeNode.createMinimalBST(array);
		System.out.println(checkBST(node));
	}
}
