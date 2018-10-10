package programs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.*;
public class RemoveDuplicatesFromArray {
	public static void main(String[] args) {
		 Integer[] numbers = { 1,2,3,1,2,3,1,2,3,4,5,6,6};
		 System.out.println("Before");
		 for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		 }
		 System.out.println("After");
		 List<Integer> list = Arrays.asList(numbers);
		 Set<Integer> set = new HashSet<Integer>(list);
		 Iterator<Integer> iterator = set.iterator();
		 while (iterator.hasNext()){
			 System.out.print(iterator.next()+ " ");
		 }
	}
}