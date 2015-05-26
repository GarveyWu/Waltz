package Training;

import CtCILibrary.LinkedListNode;

public class LinkedList2 {

	public static void fromKth(LinkedListNode head, int k) {
		
		if (head == null){
			return;
		}
		for (int i = 1; i < k; i++) {
			if(head.next != null){
				head = head.next;
			}else{
				System.out.println("We have no " +k+ " elements.");
				return;
			}
		}
		System.out.println("We have " +k+ " elements.");
		int j = k;
		while (head != null){
			System.out.println("The "+j+"th element is "+head.data);
			j++;
			head = head.next;
		}
	}

	public static void main(String[] args) {

		LinkedListNode first = new LinkedListNode(1, null, null);
		LinkedListNode head = first;
		LinkedListNode second = first;
		for (int i = 2; i < 6; i++) {
			second = new LinkedListNode(i, null, null);
			first.setNext(second);
			second.setPrevious(first);
			first = second;
		}
		System.out.println(head.printForward());
		fromKth(head, 4);
	}
}
