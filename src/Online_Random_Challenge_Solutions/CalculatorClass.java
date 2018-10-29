package binaryIO;
public class CalculatorClass {
	double n1, n2;
	
	public void setValue(double a, double b){
		n1 = a;
		n2 = b;
	}
	public String getValue(){
		return n1 + " " + n2;
	}
	public CalculatorClass(){
		n1 = 0;
		n2 = 0;
	}
	private double add(){
		return n1 + n2;
	}
	private double subtract(){
		return n1 - n2;
	}	
	private double multiply(){
		return n1 * n2;
	}	
	private double divide(){
		return n1 / n2;
	}	
	private double modulo(){
		return n1 % n2;
	}	
	private double square(){
		return Math.pow(n1,n2);
	}	
	private String squareRoot(){
		return "First Num: " + Math.sqrt(n1) + " Second Number " + Math.sqrt(n2);
	}
}