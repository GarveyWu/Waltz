package Training;

import java.util.LinkedList;
import java.util.Queue;
import CtCILibrary.AssortedMethods;

public class StackandQueue5_a {

	public static void main(String[] args) {

		MyQueue_a<Integer> my_queue = new MyQueue_a<Integer>();
		// Class LinkedList implements Interface Queue
		Queue<Integer> test_queue = new LinkedList<Integer>();

		for (int i = 0; i < 100; i++) {
			int choice = AssortedMethods.randomIntInRange(0, 10);
			if (choice <= 5) {// enqueue
				int element = AssortedMethods.randomIntInRange(1, 10);
				test_queue.add(element);
				my_queue.add(element);
				System.out.println("Enqueue " + element);
			} else if (test_queue.size() > 0) {
				int top1 = test_queue.remove();
				int top2 = my_queue.remove();
				if (top1 != top2) {// check for error
					System.out.println("******* FAILUARE - DIFFERENT TOPS: "
							+ top1 + ", " + top2);
				}
				System.out.println("Dequeue " + top1);
			}
			if (test_queue.size() == my_queue.size()) {
				if (test_queue.size() > 0
						&& test_queue.peek() != my_queue.peek()) {
					System.out.println("******* FAILUARE - DIFFERENT TOPS: "
							+ test_queue.peek() + ", " + my_queue.peek());
				}
			} else {
				System.out.println("******* FAILUARE - DIFFERENT SIZES");
			}
		}
	}
}