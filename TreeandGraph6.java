package Training;

import CtCILibrary.TreeNode;

public class TreeandGraph6 {

	public static TreeNode inorderSucc(TreeNode node) {

		if (node.right != null) {
			node = node.right;
			TreeNode next = node.left != null ? searchLeft(node.left) : node;
			return next;
		}
		;
		int data = node.data;
		if (node.parent != null) {
			node = node.parent;
			TreeNode next = node.data >= data ? node : searchParent(node, data);
			return next;
		}
		return null;
	}

	public static TreeNode searchLeft(TreeNode node) {

		TreeNode next = node.left != null ? searchLeft(node.left) : node;
		return next;
	}

	public static TreeNode searchParent(TreeNode node, int data) {

		if (node.parent != null) {
			node = node.parent;
			TreeNode next = node.data >= data ? node : searchParent(node, data);
			return next;
		}
		return null;
	}

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
		TreeNode root = TreeNode.createMinimalBST(array);
		root.print();
		for (int i = 0; i < array.length; i++) {
			TreeNode node = root.find(array[i]);
			TreeNode next = inorderSucc(node);
			if (next != null) {
				System.out.println(node.data + "->" + next.data);
			} else {
				System.out.println(node.data + "->" + null);
			}
		}
	}
}