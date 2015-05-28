package Training;

import CtCILibrary.LinkedListNode;

public class LinkedList5_2 {

	public static LinkedListNode addLists(LinkedListNode a1, LinkedListNode b1) {

		while (a1.next != null) {
			a1 = a1.next;
		}
		while (b1.next != null) {
			b1 = b1.next;
		}
		LinkedListNode current = null;
		int carry = 0;//global variable
		if ((a1 != null) && (b1 != null)) {
			if ((a1.data + b1.data) >= 10) {
				current = new LinkedListNode(a1.data + b1.data - 10, null, null);
				carry = 1;
			} else {
				current = new LinkedListNode(a1.data + b1.data, null, null);
				carry = 0;
			}
		}
		while (true) {
			if ((a1.prev != null) && (b1.prev != null)) {
				a1 = a1.prev;
				b1 = b1.prev;
				if ((a1.data + b1.data + carry) >= 10) {
					current = new LinkedListNode(
							a1.data + b1.data + carry - 10, current, null);
					carry = 1;
				} else {
					current = new LinkedListNode(a1.data + b1.data + carry,
							current, null);
					carry = 0;
				}
			} else if ((a1.prev == null) && (b1.prev != null)) {
				b1 = b1.prev;
				if ((b1.data + carry) >= 10) {
					current = new LinkedListNode(
							b1.data + carry - 10, current, null);
					carry = 1;
				} else {
					current = new LinkedListNode(b1.data + carry,
							current, null);
					carry = 0;
				}
			} else if ((a1.next != null) && (b1.next == null)) {
				a1 = a1.next;
				if ((a1.data + carry) >= 10) {
					current = new LinkedListNode(
							a1.data + carry - 10, current, null);
					carry = 1;
				} else {
					current = new LinkedListNode(a1.data + carry,
							current, null);
					carry = 0;
				}
			} else {
				break;
			}
		}
		if (carry == 1) {
			current = new LinkedListNode(1, current, null);
		}
		return current;
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
