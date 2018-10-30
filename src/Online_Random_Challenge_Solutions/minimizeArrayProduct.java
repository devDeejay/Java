package programs;

import java.util.Scanner;

public class minimizeArrayProduct {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int numberOfOperations = input.nextInt();
		int[] arr1 = new int[size];
		int[] arr2p = new int[size];
		int[] arr2 = new int[size];
		
		//Input Array 1
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = input.nextInt();
		}
		
		//Input Array 2
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = input.nextInt();
		}

		//Making all numbers positive to find the largest Magnitude
		for (int i = 0; i < arr2.length; i++) {
			if(arr2[i] < 0)
				arr2p[i] = arr2[i] * (-1);
			else
				arr2p[i] = arr2[i];
		}
		
		int pos = max(arr2p);
		if((arr1[pos] < 0) && (arr2[pos] < 0)){
			arr1[pos] += numberOfOperations * (2);
		}
		else if((arr1[pos] > 0) && (arr2[pos] > 0)){
			arr1[pos] += numberOfOperations * (-2);

		}
		else if((arr1[pos] < 0) && (arr2[pos] > 0)){
			arr1[pos] += numberOfOperations * (-2);
		}
		else if((arr1[pos] > 0) && (arr2[pos] < 0)){
			arr1[pos] += numberOfOperations * (2);
		}
		
		//Multiply
		
		int product = 0;
		for (int i = 0; i < arr2.length; i++) {
			product += arr1[i] * arr2[i];
		}
		System.out.println(product);
	}
	
	public static int max(int[] a){	
		int i;
		int max = a[0];
	    
		for(i = 0; i < a.length; i++){
	        if(max < a[i]){
	            max = a[i];
	        }
	    }
	    int j;
	    for (j = 0; j < a.length; j++) {
			if(a[j] == max)
				break;
		}
	    return j;
    }
}
