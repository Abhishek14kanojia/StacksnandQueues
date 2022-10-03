package org.practice2;

public class Service1 {
		static Node head = null;
		static Node tail = null;
		
		public boolean isEmpty () {
			return head == null & tail == null;
			
		}
		public void enqueu(int data) {
			Node newNode = new Node(data);
			if (tail == null) {
				tail = newNode;
				head = newNode;
				return;
				
			} tail.next = newNode;
			tail = newNode;
		}
		public int dequeue() {
			if (isEmpty()) {
				System.out.println("empty");
				return -1;
			}
			int front = head.data;
			
			if (head == tail) {
				tail = null;
				
			} head = head.next;
			return front;
		}
		public int peak() {
	        if (isEmpty()) {
	            return -1;
	        }
	        return head.data;
	    }
		public void display() {
	        if(head == null) {
	            System.out.println("Queue is empty");
	            return;
	        }
	        System.out.println("Data in the queue is: ");
	        Node currNode = head;
	        while(currNode!= null) {
	            System.out.println(currNode.data);
	           currNode = currNode.next;
	        }
	    }
}		
