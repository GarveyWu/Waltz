package Training;

import CtCILibrary.AssortedMethods;
import CtCILibrary.LinkedListNode;

public class LinkedList2_a {

	public static int nthToLast(LinkedListNode head, int nth) {

		if (nth == 0 || head == null) {
			return 0;
		}
		int k = nthToLast(head.next, nth) + 1;
		if (k == nth){
			System.out.println(nth + "th to last node is " + head.data);
		}
		return k;
	}

	public static void main(String[] args) {

		LinkedListNode head = AssortedMethods.randomLinkedList(10, 0, 10);
		System.out.println(head.printForward());
		int nth = 5;
		nthToLast(head, nth);
	}
}