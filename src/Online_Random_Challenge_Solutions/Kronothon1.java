package binaryIO;

import java.util.Scanner;

public class Kronothon1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s1 = "hello & & & & friends my name is";
		int count = 0,reduce = 0;
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			if(ch == ' '){
				count += 1;
			}
		}
		String ans = "";
		System.out.println(s1.length()- count);
		char[] ch = {'a','b','c'};
		for (int i = 0; i < ch.length; i++) {
			char che = ch[i];
			ans += che;
		}
		System.out.println(ans);
		String ans4 = "";
		String s4 = "The big brown fox jumps shit over";
		for (int i = 4; i < 17; i++) {
			char ch4 = s4.charAt(i);
			ans4 += ch4;
		}
		System.out.println(ans4);
	}
}