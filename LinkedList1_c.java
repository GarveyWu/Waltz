package Training;

import CtCILibrary.LinkedListNode;

public class LinkedList1_c{

	public static void deleteDups(LinkedListNode head){
		
		if(head == null){
			return;
		}
		
		LinkedListNode current = head;
		
		while(current != null){
			LinkedListNode runner = current;
			while(runner.next != null){
				if (runner.next.data == current.data){
					runner.next = runner.next.next;
				}else {
					runner = runner.next;
				}
			}	
			current = current.next;
		}
	}
	
	public static void main(String[] args){
	
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
