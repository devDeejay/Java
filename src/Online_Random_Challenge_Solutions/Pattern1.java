package programs;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		for(int i = 1; i <= n; i++){
			int temp = n - i;
			for (int j = 0; j < i ; j++) {
				while(temp!= 0){
					System.out.print(" ");
					temp--;
				}
				System.out.print(i);
			}
			System.out.println();
		}
	}
}