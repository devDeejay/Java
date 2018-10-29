package programs;

import java.util.ArrayList;
import java.util.Scanner;

public class primeNumberSeriesUnderN {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n,p;
		n = s.nextInt();
		int Num = n;
		
		//Add All Integers To Array list
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 2 ; i <= n ; i++){ 
			p = 0;
			for( int j = 2 ; j < i ; j++){
				if(i % j == 0)
				p = 1;
			}
			if(p == 0)
				list.add(i);
		}
		
		Integer[] a = list.toArray(new Integer[list.size()]);
		n = a.length;
		int checkSum = 0,count = 0;
		for(int i =  0; i < n; i++){
			checkSum += a[i];
			if(isPrime(checkSum) && checkSum < Num){
				System.out.println(checkSum);
				count++;
			}
		}
		System.out.println(count);
		//For each integer in List, Check the sum of series
		s.close();
	}

	private static boolean isPrime(int checkSum){
		boolean flag = false;
		for(int i = 2 ; i < checkSum ; i++){ 
			if(checkSum % i == 0){
				return flag;
			}
		}
		flag = true;
		return flag;
	}
}
