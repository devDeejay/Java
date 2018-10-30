package binaryIO;

import java.io.*;

public class FileEncryption {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("F:\\Java\\Java neon eclipse\\Java\\src\\binaryIO\\testFileForTCSEncryption"));
		String line1, line2;
		while((line1 = br.readLine()) != null && (line2 = br.readLine()) != null)
		{
		    doStuffWith(line1, line2);
		}
	}

	private static void doStuffWith(String line1, String line2) {
		String[] str1 = line1.split("");
	    String[] str2 = line2.split("");

	    boolean temp = true;
	    StringBuilder str = new StringBuilder();
	    int i = 0;
	    while(i<20) {
	      //Comparing for the first F in the First String, append |
	      if(str1[i].equals("F") && temp){
	        str.append("|");
	        temp = false;
	      }
	      //Else Comparing for the second F in the First String, else break
	      else if(str1[i].equals("F") && !temp){
	        break;
	      }//Else appending the letters
	      else
	        str.append(str1[i].toString());
	      
	      //Now onto the Second String
	      
	      //Comparing for the first F in the Second String, append |
	      if(str2[i].equals("F") && temp){
	        str.append("|");
	        temp = false;
	      }
	      //Else Comparing for the second F in the First String, else break
	      else if(str2[i].equals("F") && !temp){
	        break;
	      }//Else appending the letters
	      else
	        str.append(str2[i].toString());
	      i++;    
	    }
	    System.out.print(str);
	    System.out.println("");
	}
	
	
}
