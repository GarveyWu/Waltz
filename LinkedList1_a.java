package Training;

import java.util.Hashtable;
import CtCILibrary.LinkedListNode;

public class LinkedList1_a {

	public static void deleteDups(LinkedListNode n) {
		Hashtable table = new Hashtable();
		LinkedListNode previous = null;
		while (n != null) {
			if (table.containsKey(n.data)) {
				previous.next = n.next;
			} else {
				table.put(n.data, true);
				previous = n;
			}
			n = n.next;
		}
	}

	public static void main(String[] args) {

		LinkedListNode first = new LinkedListNode(0, null, null);
		LinkedListNode head = first;
		LinkedListNode second = first;

		for (int i = 1; i < 8; i++) {
			second = new LinkedListNode(i % 2, null, null);
			first.setNext(second);
			second.setPrevious(first);
			first = second;
		}
		System.out.println(head.printForward());
		deleteDups(head);
		System.out.println(head.printForward());
	}
}