package org.practice2;

public class QueueMain {

	public static void main(String[] args) {
		Service1 queue = new Service1();
		queue.enqueu(56);
		queue.enqueu(30);
		queue.enqueu(70);
		
		
		
		queue.display();
		queue.dequeue();
		queue.display();
		queue.dequeue();
		queue.dequeue();
		queue.display();
		

	}

}
