package Training;

import CtCILibrary.AssortedMethods;
import CtCILibrary.LinkedListNode;

public class LinkedList2_b {

	public static LinkedListNode nthToLast(LinkedListNode head, int n, IntWrapper i) {
		if (head == null) {
			return null;
		}
		LinkedListNode node = nthToLast(head.next, n, i);
		i.value = i.value + 1;
		if (i.value == n) {
			return head;
		} 
		return node;
	}

	public static void main(String[] args) {

		LinkedListNode head = AssortedMethods.randomLinkedList(10, 0, 10);
		System.out.println(head.printForward());
		int nth = 5;
		IntWrapper wr = new IntWrapper();
		LinkedListNode result = nthToLast(head, nth, wr);
		System.out.println(result.printForward());
	}
}