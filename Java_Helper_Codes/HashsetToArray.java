package programs;

import java.util.HashSet;
import java.util.*;
public class HashsetToArray {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(6);
		set.add(7);
		
		Integer[] array = set.toArray(new Integer[set.size()]);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
