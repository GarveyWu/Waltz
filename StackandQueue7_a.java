package Training;

public class StackandQueue7_a {

	public static void main(String[] args) {

		AnimalQueue animals = new AnimalQueue();

		animals.enqueue(new Cat("Iverson"));
		animals.enqueue(new Cat("Tracy"));
		animals.enqueue(new Dog("Kobe"));
		animals.enqueue(new Dog("Garnett"));
		animals.enqueue(new Cat("Jordan"));
		animals.enqueue(new Dog("Exo"));
		animals.enqueue(new Dog("Korea"));
		animals.enqueue(new Cat("Kitty"));

		/*
		 * System.out.println(animals.dequeueAny().name);
		 * System.out.println(animals.dequeueAny().name);
		 * System.out.println(animals.dequeueAny().name);
		 */

		animals.enqueue(new Dog("Zhazha"));
		animals.enqueue(new Cat("Cute"));

		for (int i = 0; i < 5; i++) {
			System.out.println(animals.dequeueCats().name);
		}
	}
}
