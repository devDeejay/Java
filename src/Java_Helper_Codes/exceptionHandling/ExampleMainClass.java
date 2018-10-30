package exceptionHandling;

import java.io.IOException;
import java.util.Scanner;

public class ExampleMainClass {

	public static void main(String[] args) {
		//General Exception
		try{
			new ExampleClassA().sum();
		}
		catch(Exception e){e.printStackTrace();}
		
		//ArrayIndexOutOfBounds
		
		int[] nums = new int[10];
		
		try{
			System.out.println(nums[11]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}
		
		//NullPointerException
		String s = null;
		try{
			System.out.println(s.length());	
		}
		catch(NullPointerException e){
			e.printStackTrace();
		}
		
		try{
			test(15);
		}
		catch(ArithmeticException e){
			e.printStackTrace();
		}
		
		try {
			takeInput();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void takeInput()throws IOException{
		throw new IOException();
	}

	private static void test(int i) {
		if(i<20){
			throw new ArithmeticException("Less than 15");
		}
	}
}
