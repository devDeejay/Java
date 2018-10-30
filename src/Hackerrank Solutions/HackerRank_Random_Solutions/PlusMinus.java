import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		double pCount = 0,nCount = 0,zCount = 0;
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>0)
				pCount++;
			else if(arr[i] < 0)
				nCount++;
			else if(arr[i] == 0)
				zCount++;
		}
		
		System.out.printf("%.6f",(double)pCount/size);
		System.out.println();
		System.out.printf("%.6f",(double)nCount/size);
		System.out.println();
		System.out.printf("%.6f",(double)zCount/size);
		System.out.println();}
}
