package Training;

import CtCILibrary.LinkedListNode;

public class LinkedList7 {

	public static boolean isPalindrome(LinkedListNode head){
		
		LinkedListNode end = head;
		while(end.next != null){
			end = end.next;
		}
		while(true){
			
			if (head == null || end == null){
				break;
			}
			if (head.data != end.data){
				return false;
			}
			head = head.next;
			end = end.prev;
		}
		return true;
	}
	
	public static void main(String[] args) {

		int length = 9;
		LinkedListNode[] nodes = new LinkedListNode[length];
		for (int i = 0; i < length; i++) {
			nodes[i] = new LinkedListNode(i >= length / 2 ? length - i - 1 : i,
					null, null);
		}
		for (int i = 0; i<length; i++){
			if (i < length - 1){
				nodes[i].setNext(nodes[i+1]);
			}
			if (i > 0){
				nodes[i].setPrevious(nodes[i-1]);
			}
		}
		LinkedListNode head = nodes[0];
		System.out.println(head.printForward());
		nodes[2].data = 3;
		System.out.println(head.printForward());
		System.out.println(isPalindrome(head));
	}
}
