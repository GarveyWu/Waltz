package Training;

import CtCILibrary.AssortedMethods;

public class StackandQueue2_a {

	public static void main(String[] args) {

		StackWithMin stack = new StackWithMin();
		for (int i = 0; i < 15; i++) {
			int value = AssortedMethods.randomIntInRange(0, 100);
			stack.push(value);
			System.out.print(value + ",");
		}
		System.out.println("\n");
		for (int i = 0; i < 15; i++) {
			System.out.println("Popped " + stack.pop().value);
			System.out.println("New min is " + stack.min());
		}
	}
}
