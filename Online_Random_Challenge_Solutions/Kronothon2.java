package binaryIO;

import java.util.Scanner;

public class Kronothon2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int l = input.nextInt();
		int b = input.nextInt();
		int h = input.nextInt();

		String s = input.next();
		System.out.println(s.length());
		char [][] arr = new char[l][b];
		for(int i  = 1; i <= l ; i++){
			for (int j = 1; j <= b; j++) {
				char c = s.charAt(i*j);
				arr[i][j] = c;
			}
		}
		
		for(int i  = 1; i <= l ; i++){
			for (int j = 1; j <= b; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

}
