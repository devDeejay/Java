package Serialisibilty;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class mainClass {

	public static void main(String[] args){
		Students s1 = new Students(73,"Dhananjay");
		
		try{
			FileOutputStream fout = new FileOutputStream("f.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);

			out.writeObject(s1);
			out.flush();
			System.out.println("Serialized!");
			
			FileReader fr = new FileReader("f.txt");    
	        BufferedReader br = new BufferedReader(fr);    

	        int i;
	        while((i = br.read())!=-1){  
	        	System.out.print((char)i);  
	        }
	        br.close();    
	        fr.close();    
		}
		
		catch(Exception e){
			System.out.println("Some error Occured!");
		}	}
}