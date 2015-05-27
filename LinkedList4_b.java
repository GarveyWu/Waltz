package Training;

import CtCILibrary.LinkedListNode;

public class LinkedList4_b {

	public static LinkedListNode partition(LinkedListNode head, int x) {

		LinkedListNode beforeStart = null;//ref variable is only a controller!!! It controls the Object at the right of the equal
		LinkedListNode afterStart = null;
		while (head != null){
			LinkedListNode next = head.next;
			if (head.data < 5){
				head.next = beforeStart;
				beforeStart = head;
			}else{
				head.next = afterStart;
				afterStart = head;
			}
			head = next;
		}
		if (beforeStart == null){
			return afterStart;
		}
		LinkedListNode result = beforeStart; 
		while(beforeStart.next != null){
			beforeStart = beforeStart.next;
		}
		beforeStart.next = afterStart;
		return result;
	}

	public static void main(String[] args) {

		int[] vals = { 1, 3, 8, 7, 5, 5, 2, 9, 4 };
		LinkedListNode head = new LinkedListNode(vals[0], null, null);
		LinkedListNode current = head;
		for (int i = 1; i < vals.length; i++) {
			current = new LinkedListNode(vals[i], null, current);
		}
		System.out.println(head.printForward());
		LinkedListNode result = partition(head, 5);
		System.out.println(result.printForward());
	}
}
