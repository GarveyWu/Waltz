package Training;

import CtCILibrary.AssortedMethods;
import CtCILibrary.TreeNode;

public class TreeandGraph1 {

	public static boolean isBalanced(TreeNode root) {

		if (root.left == null || root.right == null) {
			if (root.height() <= 2) {
				return true;
			} else {
				return false;
			}
		}
		if ((root.left.height() - root.right.height() <= 1)
				|| (root.right.height() - root.left.height() <= 1)) {
			return (isBalanced(root.left) && isBalanced(root.right));
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// using static method to create an object (balanced tree)
		TreeNode root = TreeNode.createMinimalBST(array);
		System.out.println("Root? " + root.data);
		System.out.println("Is balanced? " + isBalanced(root));
		// unbalanced tree
		TreeNode unbalanced = new TreeNode(10);
		for (int i = 0; i < 10; i++) {
			unbalanced.insertInOrder(AssortedMethods.randomIntInRange(0, 100));
		}
		System.out.println("Root? " + unbalanced.data);
		System.out.println("Is balanced? " + isBalanced(unbalanced));
	}
}
