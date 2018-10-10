package learningJava;

import java.util.Scanner;

public class StringIdentification {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String s1 = input.next();
		int num1 = identify(s1);
		System.out.println(num1);
		String s2 = input.next();
		int num2 = identify(s2);
		System.out.println(num2);
		String s3 = input.next();
		int num3 = identify(s3);
		System.out.println(num3);
		
		int sum = num1 + num2 + num3;
		System.out.println("The sum of theses input numbers = "+sum);
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
