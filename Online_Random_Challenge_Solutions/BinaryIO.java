package binaryIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryIO {

	public static void main(String[] args) throws IOException {
		FileOutputStream output = new FileOutputStream("BinaryIO.dat");
		for (int i = 1; i <= 10; i++) {
			output.write(i);
		}
		
		FileInputStream input = new FileInputStream("BinaryIO.dat");
		int value;
		while((value = input.read())!= -1){
			System.out.print(value + " ");
		}
		
		//The above printed data can be viewed by the program but not the Text Editor
	}

}
