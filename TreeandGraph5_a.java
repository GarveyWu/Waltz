package Training;

import CtCILibrary.TreeNode;

public class TreeandGraph5_a {

	public static boolean checkBST(TreeNode root) {

		int[] array = new int[7];
		copyBST(root, array);
		for (int i = 1; i < 7; i++) {
			if (array[i] < array[i - 1])
				return false;
		}
		return true;
	}

	public static int index = 0;

	public static void copyBST(TreeNode root, int[] array) {

		if (root == null)
			return;
		copyBST(root.left, array);
		array[index] = root.data;
		index++;
		copyBST(root.right, array);
	}

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6, 7 };
		TreeNode node = TreeNode.createMinimalBST(array);
		System.out.println(checkBST(node));
	}
}
