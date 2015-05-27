package Training;

import CtCILibrary.LinkedListNode;

public class LinkedList4_a {

	public static LinkedListNode partition(LinkedListNode head, int x) {

		LinkedListNode beforeStart = null;
		LinkedListNode afterStart = null;
		//two different linked lists to store elements
		LinkedListNode beforeEnd = null;
		LinkedListNode afterEnd = null;

		while (head != null) {
			LinkedListNode next = head.next;//mark the next node for the next loop
			head.next = null;//remove the node and check which linked lists it belongs to
			if (head.data < x) {
				if (beforeStart == null) {
					beforeStart = head;
					beforeEnd = beforeStart;
				} else {
					beforeEnd.next = head;
					beforeEnd = head;
				}
			} else {
				if (afterStart == null) {
					afterStart = head;
					afterEnd = afterStart;
				} else {
					afterEnd.next = head;
					afterEnd = head;
				}
			}
			head = next;
		}
		//merge before list and after list
		beforeEnd.next = afterStart;
		return beforeStart;
	}

	public static void main(String[] args) {

		int[] vals = { 1, 3, 8, 7, 5, 5, 2, 9, 4 };
		LinkedListNode head = new LinkedListNode(vals[0], null, null);
		LinkedListNode current = head;
		for (int i = 1; i < vals.length; i++) {
			current = new LinkedListNode(vals[i], null, current);
		}
		System.out.println(head.printForward());
		LinkedListNode result = partition(head, 5);
		System.out.println(result.printForward());
	}
}