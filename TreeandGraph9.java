package Training;

import CtCILibrary.TreeNode;

public class TreeandGraph9 {

	public static void findSum(TreeNode node, int sum) {

		int height = treeDepth(node);
		int[] path = new int[height];
		findSum(node, sum, path, 0);
	}

	public static void findSum(TreeNode node, int sum, int[] path, int level) {

		if (node == null) {
			return;
		}
		path[level] = node.data;
		int t = 0;
		for (int i = level; i >= 0; i--) {
			t += path[i];
			if (t == sum) {
				pathPrint(path, i, level);
			}
		}
		// pre-order traversal
		findSum(node.left, sum, path, level + 1);
		findSum(node.right, sum, path, level + 1);

		path[level] = Integer.MIN_VALUE;
	}

	public static void pathPrint(int[] path, int start, int end) {

		for (int i = start; i <= end; i++) {
			System.out.print(path[i] + " ");
		}
		System.out.println();
	}

	public static int treeDepth(TreeNode node) {

		if (node == null) {
			return 0;
		} else {
			return 1 + Math.max(treeDepth(node.left), treeDepth(node.right));
		}
	}

	public static void main(String[] args) {

		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(3);
		root.right = new TreeNode(1);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(8);
		root.right.left = new TreeNode(2);
		root.right.right = new TreeNode(6);
		root.print();
		findSum(root, 8);
	}
}