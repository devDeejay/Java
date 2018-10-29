package binaryIO;

import java.util.Scanner;

public class CeaserCipher {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.next();
		int key = input.nextInt();
		String output = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int index = c;
			index += key;
			char cNew = (char)index;
			output += cNew;
		}
		System.out.println(output);
	}

}
