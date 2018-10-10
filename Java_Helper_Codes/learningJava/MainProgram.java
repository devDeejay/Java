package learningJava;

import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {
		
		Students s1 = new Students();
		Students s2 = new Students("Divya",75,90,324);
		
		s1.setName("Dhananjay");
		s1.setMarks(80);
		s1.setNumber(74193);
		s1.setRollNumber(73);
		
		s1.getName();
		s1.getRollNumber();
		s1.getMarks();
		s1.getNumber();
		
		System.out.println("   ");
		
		s2.getName();
		s2.getMarks();
		s2.getNumber();
		s2.getRollNumber();
		
		s2.setMarks(95);
		s2.getMarks();
	}
	
}
