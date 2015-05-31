package Training;

import CtCILibrary.AssortedMethods;

public class StackandQueue2 {

	static int stackSize = 20;
	static int[] buffer = new int[stackSize];
	static int stackPointer = -1;
	
	static int[] minBuffer = new int[stackSize];
	static int minPointer = -1;

	static void push(int value) throws Exception {

		if (stackPointer + 1 >= stackSize) {
			throw new Exception("Out of space.");
		}
		stackPointer++;
		if (minPointer == -1) {
			minPointer++;
			minBuffer[minPointer] = Integer.MAX_VALUE;
		}
		if (value <= minBuffer[minPointer]) {
			minPointer++;
			minBuffer[minPointer] = value;
		}
		buffer[stackPointer] = value;
	}

	static int pop() throws Exception {

		if (stackPointer == -1) {
			throw new Exception("Trying to pop an empty stack.");
		}
		int value = buffer[stackPointer];// get top
		if (value == minBuffer[minPointer]) {
			minBuffer[minPointer] = 0;
			minPointer--;
		}
		buffer[stackPointer] = 0;
		stackPointer--;
		return value;
	}

	static int peek() {

		int index = stackPointer;
		return buffer[index];
	}

	static int min() {

		return minBuffer[minPointer];
	}

	public static void main(String[] args) throws Exception {

		for (int i = 0; i < 10; i++) {
			int value = AssortedMethods.randomIntInRange(0, 100);
			push(value);
			System.out.print(value + ", ");
		}
		System.out.println("\n");
		for (int i = 0; i < 10; i++) {
			System.out.println("Popped " + pop());
			System.out.println("New min is " + min());
		}
	}
}