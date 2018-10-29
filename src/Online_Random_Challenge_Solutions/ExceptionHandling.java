package Java_Helper_Codes;

public class ExceptionHandling {

	public static void main(String[] args) {
		try{
			System.out.println(2/2);
		}
		catch(ArithmeticException e1){
			System.out.println("Hello");
		}
		catch(Exception e){
			System.out.println("Hello World");
		}
	}

}
