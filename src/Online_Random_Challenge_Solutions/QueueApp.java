package Java_Helper_Codes;

import java.util.Scanner;

public class QueueApp {

	public static void main(String[] args) {
		java.util.Scanner input = new Scanner(System.in);
		int maxSize = input.nextInt();
		CustomQueueClass myQueue = new CustomQueueClass(maxSize);
		
		myQueue.insert(12);
		myQueue.insert(253);
		myQueue.remove();
		System.out.println(myQueue.peekFront());
		System.out.println(myQueue.peekRear());
	}

}
