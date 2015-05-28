package Training;

import CtCILibrary.LinkedListNode;

public class LinkedList5_1_a {

	public static LinkedListNode addLists(LinkedListNode a1, LinkedListNode b1,
			int carry) {

		if ((a1 == null) && (b1 == null) && (carry == 0)) {
			return null;
		}
		LinkedListNode result = new LinkedListNode(carry, null, null);
		int value = carry;
		if (a1 != null) {
			value += a1.data;
		}
		if (b1 != null) {
			value += b1.data;
		}
		result.data = value % 10;
		if (a1 != null || b1 != null) {
			LinkedListNode more = addLists(a1 == null ? null : a1.next,
					b1 == null ? null : b1.next, value >= 10 ? 1 : 0);
			result.setNext(more);
		}
		return result;
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
		LinkedListNode result = addLists(a1, b1, 0);
		System.out.println(result.printForward());
	}
}
