package programs;

import java.util.Scanner;

public class Kronothon {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		int[] numberOfPointsInEachLine = new int[n+1];
		for (int i = 1; i < n+1; i++) {
			int temp = 2*i-1;
			numberOfPointsInEachLine[i] = temp;
		}
		
		int[] differenceOfPointsInEachLine = new int[n+1];
		for (int i = 1; i < n+1; i++) {
			int temp = numberOfPointsInEachLine[i];
			temp = temp - n;
			differenceOfPointsInEachLine[i] = temp;
		}
		int sum = 0;
		for (int i : differenceOfPointsInEachLine) {
			if(i>0)
				sum = sum + i;
		}
		System.out.println(sum);
	}
}
