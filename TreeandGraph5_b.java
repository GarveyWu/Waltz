package Training;

import CtCILibrary.TreeNode;

public class TreeandGraph5_b {

	public static Integer last_printed = null;

	public static boolean checkBST(TreeNode n) {

		if (n == null) {
			return true;
		}
		if (!checkBST(n.left)) {
			return false;
		}
		if ((last_printed != null) && (n.data <= last_printed)) {
			return false;
		}
		last_printed = n.data;
		if (!checkBST(n.right)) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6, 7 };
		TreeNode node = TreeNode.createMinimalBST(array);
		System.out.println(checkBST(node));
	}
}