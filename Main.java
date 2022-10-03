package org.practice2;

public class Main {

	public static void main(String[] args) {
		Service stack = new Service();
		
		stack.push(70);
		stack.push(30);
		stack.push(56);
		stack.peek();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.peek();
	
		stack.display();
	}

}
