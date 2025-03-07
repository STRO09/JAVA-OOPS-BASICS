package stack;

import java.util.Stack;

public class Main {
public static void main(String[] args) {
	Stack<Integer> fibonacci = new Stack<Integer>();

	System.out.println(fibonacci.empty());
	fibonacci.push(0);
	fibonacci.push(1);
	fibonacci.push(1);
	fibonacci.push(2);
	fibonacci.push(3);
	fibonacci.push(5);
	System.out.println("Top element: ");
	System.out.println(fibonacci.peek());
	
	fibonacci.pop();
	
	System.out.println("Top element: ");
	System.out.println(fibonacci.peek());
	
	System.out.println(fibonacci.empty());
	System.out.println(fibonacci.search(1));
	
	System.out.println(fibonacci.search(6));
}
}
