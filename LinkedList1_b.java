package Training;

import java.util.HashSet;
import CtCILibrary.LinkedListNode;

public class LinkedList1_b {

	public static void deleteDups(LinkedListNode n){
		
		HashSet<Integer> set = new HashSet<Integer>();
		LinkedListNode previous = null;
		while(n != null){
			if (set.contains(n.data)){
				previous.next = n.next;
			}else{
				set.add(n.data);
				previous = n;
			}
			n = n.next;
		}
	}

	public static void main(String[] args) {

		LinkedListNode first = new LinkedListNode(0, null, null);
		LinkedListNode head = first;
		LinkedListNode second = first;
		for (int i = 1; i < 10; i++) {
			second = new LinkedListNode(i % 3, null, null);
			second.setPrevious(first);
			first.setNext(second);
			first = second;
		}
		System.out.println(head.printForward());
		deleteDups(head);
		System.out.println(head.printForward());
	}
}