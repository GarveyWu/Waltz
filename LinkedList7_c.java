package Training;

import CtCILibrary.LinkedListNode;

public class LinkedList7_c {

	public static LinkedListNode clone(LinkedListNode head) {

		LinkedListNode next2 = null;
		if (head.next != null) {
			next2 = clone(head.next);
		}
		LinkedListNode head2 = new LinkedListNode(head.data, next2, null);
		return head2;
	}

	public static LinkedListNode reverse(LinkedListNode head) {

		LinkedListNode re = null;
		while (head != null) {
			LinkedListNode next = head.next;
			head.next = re;
			re = head;
			head = next;
		}
		return re;
	}

	public static boolean isPalindrome(LinkedListNode head) {

		LinkedListNode head2 = clone(head);
		LinkedListNode re = reverse(head2);
		while (head != null && re != null) {
			if (head.data != re.data) {
				return false;
			}
			head = head.next;
			re = re.next;
		}
		return true;
	}

	public static void main(String[] args) {

		int length = 9;
		LinkedListNode[] nodes = new LinkedListNode[length];
		for (int i = 0; i < length; i++) {
			nodes[i] = new LinkedListNode(i >= length / 2 ? length - i - 1 : i,
					null, null);
		}
		for (int i = 0; i < length; i++) {
			if (i < length - 1) {
				nodes[i].setNext(nodes[i + 1]);
			}
			if (i > 0) {
				nodes[i].setPrevious(nodes[i - 1]);
			}
		}
		LinkedListNode head = nodes[0];
		nodes[2].data = 3;
		System.out.println(head.printForward());
		System.out.println(isPalindrome(head));
	}
}