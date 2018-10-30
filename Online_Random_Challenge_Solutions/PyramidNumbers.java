package programs;
import java.util.Arrays;
import java.util.Scanner;
public class PyramidNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int num;
		int N = n * ( n + 1 ) / 2;
		String formattedNumber = "";
		int[] arr = new int[N];
		String[] str = new String[N];
		//Input the int values in an array
		for (int i = 0; i < arr.length; i++) {
			num = input.nextInt();
			arr[i] = num;
		}
		
		//sorting the array
		Arrays.sort(arr);
		
		//formatting the int values into string values.
		for (int i = 0; i < arr.length; i++) {
			String number = String.valueOf(arr[i]);
			int length = 5 - number.length();
			formattedNumber = "";
			while(length != 0){
				formattedNumber += "0";
				length--;
			}
			formattedNumber += number;
			str[i] = formattedNumber;
		}
		//Output
		int spaceCount = n-1;
		int number = 1;
		for(int i=1; i <= n; i++){
			int space = 0;
			while(space != spaceCount){
				System.out.print(" ");
				space++;
			}
			
			for(int j = 1; j <= i; ++j){
	            System.out.print(str[number-1]);
	            ++number;
	            System.out.print(" ");
	        }
	        System.out.println();
	        spaceCount--;
		}
		input.close();
	}
}
