package programs;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateArrayList {

	public static void main(String[] args) {
		
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
		
		Iterator<Integer> iterator = ar.iterator();
		 while (iterator.hasNext()){
			 System.out.print(iterator.next()+ " ");
		 }
	}

}
