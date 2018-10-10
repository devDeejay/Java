package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 char c = 0;
		    BufferedReader br = new
		    BufferedReader(new InputStreamReader(System.in));
		    
		    System.out.print("Enter Text: ");
	        Scanner scan = new Scanner(System.in);
	        String text = scan.nextLine();
		    
		    FileWriter fWriter = null;
	        BufferedWriter writer = null;
	        try {
	          fWriter = new FileWriter("text.txt");
	          writer = new BufferedWriter(fWriter);
	          writer.write(text);
	          writer.newLine();
	          writer.close();
	          System.err.println("Your input of " + text.length() + " characters was saved.");
	        } catch (Exception e) {
	            System.out.println("Error!");
	        }
		}
}
