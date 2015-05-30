package Training;

public class StackandQueue1_a {

	static int stackSize = 10;
	static int[] buffer = new int[stackSize * 3];
	static int[] stackPointer = { -1, -1, -1 };

	static void push(int stackNum, int value) throws Exception {
		// check if we have space
		if (stackPointer[stackNum] + 1 >= stackSize) {
			throw new Exception("Out of space.");
		}
		stackPointer[stackNum]++;
		buffer[absTopOfStack(stackNum)] = value;
	}

	static int pop(int stackNum) throws Exception {

		if (stackPointer[stackNum] == -1) {
			throw new Exception("Trying to pop an empty stack.");
		}
		int value = buffer[absTopOfStack(stackNum)];// get top
		buffer[absTopOfStack(stackNum)] = 0;
		stackPointer[stackNum]--;
		return value;
	}

	static int peek(int stackNum) {

		int index = absTopOfStack(stackNum);
		return buffer[index];
	}

	boolean isEmpty(int stackNum) {

		return stackPointer[stackNum] == -1;
	}

	static int absTopOfStack(int stackNum) {
		// combine stackNum and stackPointer, we can get the specific position
		// of the value in the buffer
		return stackNum * stackSize + stackPointer[stackNum];
	}

	public static void main(String[] args) throws Exception {

		push(2, 4);
		System.out.println("Peek 2: " + peek(2));
		push(0, 3);
		push(0, 7);
		push(0, 5);
		System.out.println("Peek 0: " + peek(0));
		pop(0);
		System.out.println("Peek 0: " + peek(0));
		pop(0);
		System.out.println("Peek 0: " + peek(0));
	}
}
