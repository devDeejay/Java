package programs;

import java.lang.reflect.Array;
import java.util.*;

public class RemoveDuplicates {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(2);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		ar.add(4);
		ar.add(3);
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(5);
		System.out.println("Before");
		System.out.println(ar);
		System.out.println("After");
		Set<Integer> set = new HashSet<>(ar);
		System.out.println(set);
	}

}
