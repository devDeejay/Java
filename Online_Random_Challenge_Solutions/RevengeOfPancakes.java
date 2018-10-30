package programs;

import java.util.*;
import java.util.Scanner;

public class RevengeOfPancakes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.next();
		int index = 0,start = 0,count = 0,i = 0;
		try{
			while(true){
				char a = s.charAt(start);
				while(s.charAt(i+1) == a){
					i++;
					index++;
				}
				count++;
				start = index + 1;
			}
		}
		catch(Exception e){
			if(s.charAt(s.length()-1) == '-')
				count++;
			System.out.println(count);
		}
	}//End of Method
}//End of Main Class