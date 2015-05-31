package Training;

import java.util.Stack;
import CtCILibrary.AssortedMethods;

public class StackandQueue6_a {

	public static Stack<Integer> sort(Stack<Integer> s){
		
		Stack<Integer> r = new Stack<Integer>();
		while (!s.isEmpty()){
			int tmp = s.pop();
			while( (!r.isEmpty()) && r.peek() > tmp){
				s.push(r.pop());
			} 
			r.push(tmp);
		}
		return r;
	}
	
	public static void main(String[] args) {

		Stack<Integer> s = new Stack<Integer>();	
		for (int k = 0; k < 100; k++) {
			int i = AssortedMethods.randomIntInRange(1, 100);
			s.push(i);
		}
		Stack<Integer> r = sort(s);
		for (int k = 0; k < 100; k++) {
			System.out.println(r.pop());
		}
	}
}