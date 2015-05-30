package Training;

import CtCILibrary.AssortedMethods;

public class StackandQueue2_b {

	public static void main(String[] args) {

		StackWithMin2 stack2 = new StackWithMin2();
		for (int i = 0; i<15; i++){
			int value = AssortedMethods.randomIntInRange(0, 100);
			stack2.push(value);
			System.out.print(value + ", ");
		}
		System.out.println("\n");
		for (int i = 0; i< 15; i++){
			System.out.println("Popped " + stack2.pop());
			System.out.println("New min is " + stack2.min());
		}
	}
}