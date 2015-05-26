package Training;

import CtCILibrary.AssortedMethods;
import CtCILibrary.LinkedListNode;

public class LinkedList2_c {

	public static LinkedListNode nthToLast(LinkedListNode head, int nth) {

		if (nth <= 0) {
			return null;
		}
		LinkedListNode p1 = head;
		LinkedListNode p2 = head;
		/*for (int i = 1; i < nth; i++) {
			if ((p2 != null) && (p2.next != null)) {
				p2 = p2.next;
			} else {
				return null;
			}
		}*/
		for (int i = 0; i < nth - 1; i++) {
			if (p2 == null)
				return null;
			p2 = p2.next;
		}
		if (p2 == null)
			return null;
		while (p2.next != null) {
			p1 = p1.next;
			p2 = p2.next;
		}
		return p1;
	}

	public static void main(String[] args) {

		LinkedListNode head = AssortedMethods.randomLinkedList(10, 0, 10);
		System.out.println(head.printForward());
		int nth = 5;
		LinkedListNode result = nthToLast(head, nth);
		System.out.println(result.printForward());
	}
}
