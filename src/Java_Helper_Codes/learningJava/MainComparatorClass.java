package learningJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class MainComparatorClass {

	public static void main(String[] args) {
		ArrayList<Student> MyArrayList = new ArrayList<Student>();
		
		Student s1 = new Student(73,"Dhananjay Trivedi",20);
		Student s2 = new Student(75,"Divya Verma",21);
		Student s3 = new Student(70,"Rahul Kumar",14);
	
		MyArrayList.add(s3);
		MyArrayList.add(s2);
		MyArrayList.add(s1);
		
		
		Collections.sort(MyArrayList,new AgeComparatorClass()); 
		for(Student s: MyArrayList){  
			System.out.println(s.rollNumber+" "+s.name+" "+s.age);  
		}  
	}

}
