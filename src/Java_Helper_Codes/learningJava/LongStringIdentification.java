package learningJava;

import java.util.Scanner;

public class LongStringIdentification {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String userInput = input.nextLine();
		String a[] = userInput.split(" ");
		int len = a.length;
		int nums[] = new int[len];
		for (int i = 0; i < a.length; i++) {
			String string = a[i];
			int num = identify(string);
			nums[i] = num;
		}
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
	
	public static int identify(String s){
		s.toLowerCase();
		String inputString = s;
		switch(inputString){
			case "one":
				return 1;
			
			case "two":
				return 2;
			
			case "three":
				return 3;
			
			case "four":
				return 4;
			
			case "five":
				return 5;
				
			case "six":
				return 6;
				
			case "seven":
				return 7;
				
			case "eight":
				return 8;
				
			case "nine":
				return 9;
				
			case "zero":
				return 0;
				
			default:
				System.out.println("Enter a valid String");
		}
		return 404;
	}
}