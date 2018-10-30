package programs;
import java.util.Scanner;
public class hackerearthFizzBuzz {
	public static void main(String[] args) {
		String[] number = {"1","2","3","4","5","6"};
	      String phoneN = "123456";
	      String[] another = {"","","","","",""};
	      for(int i=0;i<another.length;i++){
	          another[i] = phoneN.split("")[i]; 
	      }
	  
	      for (int i = 0; i < another.length; i++) {
	    	  if(another[i].equals(number[i])){
		          System.out.println("The same value.");
		      }
		      if(another[i].getClass().getName() == number[i].getClass().getName()){
		          System.out.println("The same type.");
		      }
		}
	      
	}
}
