package MultiThreading;

public class PrintChar implements Runnable {
	private char CharToPrint;
	private int times;
	
	public PrintChar(char c, int n){
		this.CharToPrint = c;
		this.times = n;
	}

	public void run(){
		for (int i = 0; i < times; i++) {
			System.out.print(CharToPrint); 
		}
	}
}