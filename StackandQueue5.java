package Training;

import java.util.LinkedList;
import java.util.Queue;
import CtCILibrary.AssortedMethods;

public class StackandQueue5 {

	public static void main(String[] args) {

		MyQueue mq = new MyQueue();
		Queue<Integer> test = new LinkedList<Integer>();

		for (int i = 0; i < 100; i++) {
			int choice = AssortedMethods.randomIntInRange(0, 10);
			if (choice <= 5) {// enqueue
				int element = AssortedMethods.randomIntInRange(1, 10);
				test.add(element);
				mq.enqueue(element);
				System.out.println("Enqueue " + element);
			} else if (test.size() > 0) {
				int top1 = test.remove();
				int top2 = mq.dequeue();
				if (top1 != top2) {// check for error
					System.out.println("******* FAILUARE - DIFFERENT TOPS: "
							+ top1 + ", " + top2);
				}
				System.out.println("Dequeue " + top1);
			}
		}
	}
}