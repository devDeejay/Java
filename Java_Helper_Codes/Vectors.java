package Java_Helper_Codes;

import java.util.Enumeration;
import java.util.Vector;

public class Vectors {

	public static void main(String[] args) {
		//Vectors are same as Arraylist, it just provides advanced methods for Synchronization
		//Used in MultiThreading and all.
		//ArrayList are more Efficient then Vectors.
		
		Vector<String> v = new Vector<String>();
		v.add("Dhananjay");
		v.addElement("Divya");
		v.addElement("Dhaman");  
		v.addElement("Dhiraj");		
		
		Enumeration e=v.elements();  
		while(e.hasMoreElements()){  
			System.out.println(e.nextElement());  
		}
		
		Stack s = new Stack();
		s.push(10);
		
		System.out.println(s);
		s.pop();
		System.out.println(s);
	}

}
