package commandLineArguments;

import java.util.StringTokenizer;

public class CommandLineArguments {

	public static void main(String[] args) {
		String one = "Hello World";
		String two = "This is a Java Program";
		
		System.out.println(one.equals(two));
		System.out.println(one == two);
		System.out.println(one.compareTo(two));
		
		//Tokenizer
		StringTokenizer s0 = new StringTokenizer("Hello This is a Java String"," ");  
	     while (s0.hasMoreTokens()) {  
	         System.out.println(s0.nextToken());  
		}
	    
	     String s1="Sachin";  
	     String s2="SACHIN";  
	    
	     //String Comparision Methods
	     System.out.println(s1.equals(s2));//false  
	     System.out.println(s1.equalsIgnoreCase(s2));//true
	     System.out.println(one.substring(2, 5));
	     
	     //Replace String Method
	     s1="Java is a programming language. Java is a platform. Java is an Island.";    
	     String replaceString=s1.replace("Java","Kava");    
	     System.out.println(replaceString);    
	     
	     
	     //String Buffer
	     StringBuffer st = new StringBuffer("Hello ");  
	     st.insert(5," Java");
	     System.out.println(st);
	     
	     
	     //StringBuilder
	     StringBuilder sb = new StringBuilder("Prograaming");  
	     sb.append(" in Java");
	     System.out.println(sb);
	} 
}