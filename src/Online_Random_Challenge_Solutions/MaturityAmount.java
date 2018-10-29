package binaryIO;
public class MaturityAmount {
	public static void main(String[] args) {
		int i = 0;
		double IP = 52.5,R = 3.6,T = 5; //annual rate 
		double t = 1/12;
		double A = 0;
		double P = 0;
		while(i<T){
			//For next month
			P = P + IP;
			A = A + P;
			A = Math.ceil(P * ( 1 + R * t));
			System.out.println(A);
			i++;
		}
		
	}

}
