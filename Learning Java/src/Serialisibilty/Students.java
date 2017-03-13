package Serialisibilty;

import java.io.Serializable;

public class Students implements Serializable {
	int rollNumber;
	String name;
	public Students(int rollNumber,String name){
		this.rollNumber = rollNumber;
		this.name = name;
	}
}
