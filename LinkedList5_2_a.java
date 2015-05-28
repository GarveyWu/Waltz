package Training;

import CtCILibrary.LinkedListNode;

public class LinkedList5_2_a {

	public static int length(LinkedListNode l) {
		if (l == null) {
			return 0;
		} else {
			return 1 + length(l.next);
		}
	}

	public static LinkedListNode padList(LinkedListNode l, int padding) {

		LinkedListNode head = l;
		for (int i = 0; i < padding; i++) {
			LinkedListNode n = new LinkedListNode(0, null, null);
			head.prev = n;
			n.next = head;
			head = n;
		}
		return head;
	}

	public static PartialSum addListsHelper(LinkedListNode l1, LinkedListNode l2) {

		if (l1 == null && l2 == null) {
			PartialSum sum = new PartialSum();
			return sum;
		}
		PartialSum sum = addListsHelper(l1.next, l2.next);// add smaller digits
															// recursively
		int val = sum.carry + l1.data + l2.data;
		LinkedListNode full_result = insertBefore(sum.sum, val % 10);
		sum.sum = full_result;
		sum.carry = val / 10;
		return sum;
	}

	public static LinkedListNode insertBefore(LinkedListNode list, int data) {

		LinkedListNode node = new LinkedListNode(data, null, null);
		if (list != null) {
			list.prev = node;
			node.next = list;
		}
		return node;
	}

	public static LinkedListNode addLists(LinkedListNode l1, LinkedListNode l2) {

		int len1 = length(l1);
		int len2 = length(l2);
		if (len1 < len2) {
			l1 = padList(l1, len2 - len1);
		} else {
			l2 = padList(l2, len1 - len2);
		}
		PartialSum sum = addListsHelper(l1, l2);
		if (sum.carry == 0) {
			return sum.sum;
		} else {
			LinkedListNode result = insertBefore(sum.sum, sum.carry);
			return result;
		}
	}

	public static void main(String[] args) {

		LinkedListNode a1 = new LinkedListNode(6, null, null);
		LinkedListNode a2 = new LinkedListNode(1, null, a1);
		LinkedListNode a3 = new LinkedListNode(7, null, a2);
		System.out.println(a1.printForward());
		LinkedListNode b1 = new LinkedListNode(2, null, null);
		LinkedListNode b2 = new LinkedListNode(9, null, b1);
		LinkedListNode b3 = new LinkedListNode(5, null, b2);
		System.out.println(b1.printForward());
		LinkedListNode result = addLists(a1, b1);
		System.out.println(result.printForward());
	}
}