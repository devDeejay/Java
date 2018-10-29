package learningJava;
import java.util.*;
public class ArrayLists {
	
	public static void main(String[] args) {
		ArrayList names = new ArrayList();
	
		names.add("Dhananjay");
		names.add("Divya");
		names.add("Dhaman");
		names.add("Dhiraj");
		names.remove(3);
		names.set(0, "Replaced");
		System.out.println(names.isEmpty());
		System.out.println(names.size());
		System.out.println(names.get(0));
		
		System.out.println();
		
		Iterator<String> namesIterator = names.iterator();  
		  while(namesIterator.hasNext()){  
			  System.out.println(namesIterator.next()); 
		  }
		  
		System.out.println();
		  
		ArrayList<String> text=new ArrayList<String>();
		  text.add("Hello");  
		  text.add("World");  
		  text.add("This");  
		  text.add("is");  
		  text.add("Dhananjay");  
		  
		  Iterator<String> iterator = text.iterator();  
		  while(iterator.hasNext()){  
			  System.out.println(iterator.next()); 
		  }
	}
}
