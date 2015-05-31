package Training;

import java.util.Stack;

public class MyQueue {

	Stack<Integer> left;
	Stack<Integer> right;

	public MyQueue() {

		left = new Stack<Integer>();
		right = new Stack<Integer>();
	}

	public void enqueue(int value) {

		left.push(value);
	}

	public int dequeue() {

		if (!right.isEmpty()) {
			return right.pop();
		}
		while (!left.isEmpty()) {
			int val = left.pop();
			right.push(val);
		}
		return right.pop();
	}
}
