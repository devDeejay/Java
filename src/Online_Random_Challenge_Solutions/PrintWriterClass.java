package binaryIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PrintWriterClass {

	public static void main(String[] args) throws FileNotFoundException {
		//Taking User Inputs
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please Enter the date you want to Save to the file.");
		
		//Writing to the file
		String data = userInput.nextLine();
		PrintWriter output;
		output = new PrintWriter("temp.txt");
		output.print(data); // Writes to a file
		output.close();
		
		//Reading from the file
		System.out.println("You have entered:");
		Scanner input = new Scanner(new File("temp.txt"));
		System.out.println(input.nextLine());
	}

}
