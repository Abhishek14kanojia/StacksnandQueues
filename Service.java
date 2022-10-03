package org.practice2;

public class Service {
	
	public static Node head;
	
	public boolean isEmpty() {
		return head == null;
		
	}
	public void push(int data) {
		Node newNode = new Node(data);
		if(isEmpty()) {
			head = newNode;
			return;
			
		}newNode.next = head;
		head = newNode;
		
	}
	public int pop () {
		if (isEmpty()) {
			return -1;
			
		} int top = head.data;
			head = head.next;
			return top;
			 
	} 
	public int peek () {
		if (isEmpty()) {
			return -1;
			
		}return head.data;
	}
	public void display () {
		while (!isEmpty()) {
			System.out.println(peek());
			pop();
		}
	}
}
