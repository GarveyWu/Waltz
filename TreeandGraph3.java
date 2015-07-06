package Training;

import CtCILibrary.TreeNode;

public class TreeandGraph3 {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		TreeNode MinimalBST = TreeNode.createMinimalBST(array);
		
		System.out.println("Root? " + MinimalBST.data);
		System.out.println("Height? " + MinimalBST.height());
		System.out.println(MinimalBST.left.right.right.data);
		System.out.println("Create BST? " + MinimalBST.isBST());
	}
}