package Training;

import CtCILibrary.TreeNode;

public class TreeandGraph7_b {

	public static TreeNode commonAncestorBad(TreeNode root, TreeNode p,
			TreeNode q) {

		if (root == null) {
			return null;
		}
		if (root == p && root == q) {
			return root;
		}
		TreeNode x = commonAncestorBad(root.left, p, q);
		if (x != null && x != p && x != q) {
			return x;
		}
		TreeNode y = commonAncestorBad(root.right, p, q);
		if (y != null && y != p && y != q) {
			return y;
		}
		if (x != null && y != null) {
			return root;
		} else if (root == p || root == q) {
			return root;
		} else {
			return x == null ? y : x;
		}
	}

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		TreeNode root = TreeNode.createMinimalBST(array);
		root.print();
		TreeNode n3 = root.find(3);
		TreeNode n4 = root.find(4);
		TreeNode ancestor = commonAncestorBad(root, n3, n4);
		if (ancestor != null) {
			System.out.println(ancestor.data);
		} else {
			System.out.println("null");
		}
	}
}