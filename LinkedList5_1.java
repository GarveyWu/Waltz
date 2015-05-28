package Training;

import CtCILibrary.LinkedListNode;

public class LinkedList5_1 {

	public static LinkedListNode addLists(LinkedListNode a1, LinkedListNode b1) {

		LinkedListNode sum = null;
		int carry = 0;
		if ((a1 != null) && (b1 != null)) {
			if ((a1.data + b1.data) >= 10) {
				sum = new LinkedListNode(a1.data + b1.data - 10, null, null);
				carry = 1;
			} else {
				sum = new LinkedListNode(a1.data + b1.data, null, null);
			}
		}
		LinkedListNode current = sum;
		while (true) {
			if ((a1.next != null) && (b1.next != null)) {
				a1 = a1.next;
				b1 = b1.next;
				if ((a1.data + b1.data + carry) >= 10) {
					current = new LinkedListNode(
							a1.data + b1.data + carry - 10, null, current);
					carry = 1;
				} else {
					current = new LinkedListNode(a1.data + b1.data + carry,
							null, current);
					carry = 0;
				}
			} else if ((a1.next == null) && (b1.next != null)) {
				b1 = b1.next;
				current = new LinkedListNode(b1.data, null, current);
			} else if ((a1.next != null) && (b1.next == null)) {
				a1 = a1.next;
				current = new LinkedListNode(a1.data, null, current);
			} else {
				break;
			}
		}
		if (carry == 1) {
			current = new LinkedListNode(1, null, current);
		}
		return sum;
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
