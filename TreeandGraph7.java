package Training;

import java.util.LinkedList;
import CtCILibrary.TreeNode;

public class TreeandGraph7 {

	public static TreeNode commonAncestor(TreeNode p, TreeNode q) {

		if (p.height() >= q.height()) {
			while (p != null) {
				if (searchAncestor(p, q.data)) {
					return p;
				}
				p = p.parent;
			}
		} else {
			while (q != null) {
				if (searchAncestor(q, p.data)) {
					return q;
				}
				q = q.parent;
			}
		}
		return null;
	}

	public static boolean searchAncestor(TreeNode node, int data) {

		if (node.data == data) {
			return true;
		}
		LinkedList<TreeNode> q = new LinkedList<>();
		q.add(node);
		while (!q.isEmpty()) {
			TreeNode elem = q.removeFirst();
			if (elem.left != null && elem.left.data == data) {
				return true;
			} else if (elem.left != null) {
				q.add(elem.left);
			}
			if (elem.right != null && elem.right.data == data) {
				return true;
			} else if (elem.right != null) {
				q.add(elem.right);
			}
		}
		return false;
	}

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		TreeNode root = TreeNode.createMinimalBST(array);
		root.print();
		TreeNode n6 = root.find(6);
		TreeNode n9 = root.find(9);
		System.out.println(n6.data);
		System.out.println(n9.data);
		TreeNode ancestor = commonAncestor(n6, n9);
		System.out.println("The first common ancestor is " + ancestor.data);
	}
}