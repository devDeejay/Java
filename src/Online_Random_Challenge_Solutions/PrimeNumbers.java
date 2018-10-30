package programs;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int count = 0;
		for (int i = num1; i < num2; i++) {
			for (int j = 2; j < i; j++) {
				if (i%j == 0){
					break;
				}
				else if(j == i-1)
					count+=1;
			}
		}
		if(num1 == 1)
			count += 1;
		System.out.println(count);

	}

}
