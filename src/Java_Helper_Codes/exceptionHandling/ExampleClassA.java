package exceptionHandling;

public class ExampleClassA {
	//Arithmetic Exception
	public void sum(){
		try{
			System.out.println(22/0);
		}
		catch(ArithmeticException e){
			e.printStackTrace();;
		}
	}
	
	//StackOverFlow
	public void repeat(){
		try{
			System.out.println("Trying recalling the repeat() method");
			repeat();
		}
		catch(Exception e){
			e.printStackTrace();;
		}
	}
}
