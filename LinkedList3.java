package Training;

import CtCILibrary.LinkedListNode;
import CtCILibrary.AssortedMethods;

public class LinkedList3 {

	public static void deleteNode(LinkedListNode middle){
		
		LinkedListNode prev = middle.prev;
		LinkedListNode next = middle.next;
		prev.setNext(next);
		next.setPrevious(prev);
	}
	
	public static void main(String[] args) {
		
		LinkedListNode head = AssortedMethods.randomLinkedList(5, 0, 10);
		System.out.println(head.printForward());
		deleteNode(head.next.next);
		System.out.println(head.printForward());
	}
}
