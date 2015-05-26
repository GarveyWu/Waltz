package Training;

import CtCILibrary.LinkedListNode;
import CtCILibrary.AssortedMethods;

public class LinkedList3_a {

	public static boolean deleteNode(LinkedListNode middle){
		
		if (middle == null || middle.next == null){
			return false;
		}
		LinkedListNode next = middle.next;
		middle.data = next.data;
		middle.next = next.next;
		return true;
	}

	public static void main(String[] args) {

		LinkedListNode head = AssortedMethods.randomLinkedList(5, 0, 10);
		System.out.println(head.printForward());
		deleteNode(head.next.next);
		System.out.println(head.printForward());
	}
}
