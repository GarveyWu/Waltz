package Training;

import java.util.HashSet;
import CtCILibrary.LinkedListNode;

public class LinkedList6_a {

	public static LinkedListNode findBeginning(LinkedListNode head) {

		LinkedListNode fast = head;
		LinkedListNode slow = head;
		while (fast != null && fast.next != null) {

			slow = slow.next;
			fast = fast.next.next;
			if (fast == slow) {
				break;
			}
		}
		// error check: no meeting point
		if (fast == null || fast.next == null) {
			return null;
		}
		slow = head;
		while (slow != fast) {
			slow = slow.next;
			fast = fast.next;
		}
		return fast;
	}

	public static void printLoopForward(LinkedListNode head) {

		HashSet<Integer> set = new HashSet<Integer>();// duplicate checking
		while (head != null) {
			System.out.print(head.data + "->");
			if (set.contains(head.data)) {
				return;
			} else {
				set.add(head.data);
			}
			head = head.next;
		}
	}

	public static void main(String[] args) {

		int list_length = 20;
		int k = 5;
		LinkedListNode[] nodes = new LinkedListNode[list_length];
		for (int i = 0; i < list_length; i++) {
			nodes[i] = new LinkedListNode(i, null, i > 0 ? nodes[i - 1] : null);
		}
		System.out.println(nodes[0].printForward());
		// create loop
		nodes[list_length - 1].next = nodes[list_length - k];
		// print the entire loop
		printLoopForward(nodes[0]);
		System.out.println();
		LinkedListNode loop = findBeginning(nodes[0]);
		if (loop == null) {
			System.out.println("No Cycle");
		} else {
			System.out.println(loop.data);
		}
		printLoopForward(loop);
	}
}
