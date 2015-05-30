package Training;

public class StackandQueue3_a {

	public static void main(String[] args) throws Exception {

		int capacity_per_subStack = 5;
		SetOfStacks set = new SetOfStacks (capacity_per_subStack);
		for (int i = 0; i < 34; i++){
			set.push(i);
		}
		for (int i = 0; i < 34; i++){
			System.out.println("Popped " + set.pop());
		}
	}
}
