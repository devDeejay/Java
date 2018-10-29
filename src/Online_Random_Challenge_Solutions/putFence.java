package programs;

import java.util.Scanner;

public class putFence {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int m = input.nextInt();
		int n = input.nextInt();
		char[][] land = new char[m][n];
		for (int i = 0; i < land.length; i++) {
			for (int j = 0; j <= land.length; j++) {
				land[i][j] = input.next().charAt(0);
			}
		}
		for (int i = 0; i < land.length; i++) {
			for (int j = 0; j <= land.length; j++) {
				System.out.print(land[i][j]);
			}
			System.out.println();
		}
		
		
	}

}
