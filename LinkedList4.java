package Training;

import CtCILibrary.LinkedListNode;

public class LinkedList4 {

	public static LinkedListNode partition(LinkedListNode head, int x) {

		LinkedListNode head2 = head.clone();// do two loops to parse the
											// elements
		LinkedListNode ref = new LinkedListNode(x, null, null);// fix a starter
		LinkedListNode first = ref;// run after
		LinkedListNode second = ref;// run in front
		while (head != null) {
			if (head.data < x) {
				second = new LinkedListNode(head.data, null, null);
				first.setNext(second);
				first = second;
			}
			head = head.next;
		}
		while (head2 != null) {
			if (head2.data >= x) {
				second = new LinkedListNode(head2.data, null, null);
				first.setNext(second);
				first = second;
			}
			head2 = head2.next;
		}
		return ref.next;
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
