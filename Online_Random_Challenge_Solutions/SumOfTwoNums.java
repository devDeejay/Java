package programs;

import java.util.Scanner;

public class SumOfTwoNums {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int F = input.nextInt();
		int B = input.nextInt();
		int T = input.nextInt();
		int FD = input.nextInt();
		int BD = input.nextInt();
		
		if(F == B)
			System.out.println("Thank God");
		else if(F>B){
			
			int a = F - B;
			int temp1 = FD - F;
			int times = temp1/a;
			int distance = F + times * (FD + BD);
		}
		else if(B>F){
			int b = B - F;
			int temp2 = BD - B;
			int times = temp2/b;
			int distance = B + times * (FD + BD);
		}
	}
}
