package programs;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class ArraysClassMethods {

	public static void main(String[] args) {
		//Day 2 Seventh Program
		Integer[] numbers = { 1,2,3,1,2,3,1,2,3,4,5,6,6};
		
		 List<Integer> list = Arrays.asList(numbers);
		
		 System.out.println("Sorting");
		 Arrays.sort(numbers);
		 for(int i = 0; i < numbers.length; i++) {
				System.out.println(numbers[i]);
		 }
		 
		 System.out.println("Binary Seaching ");
		 
		 System.out.println(Arrays.binarySearch(numbers, 3));
	
		 Arrays.copyOf(numbers, 1);
		 for(int i = 0; i < numbers.length; i++) {
				System.out.println(numbers[i]);
		 }
		 
		 Arrays.copyOfRange(numbers, 1,5);
		 for(int i = 0; i < numbers.length; i++) {
				System.out.println(numbers[i]);
		 }
		 
		 Arrays.fill(numbers, 5);
		 for(int i = 0; i < numbers.length; i++) {
				System.out.println(numbers[i]);
		 }
	}
}
