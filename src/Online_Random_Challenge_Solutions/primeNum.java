package binaryIO;

public class primeNum {
	static int count = 1;
	public static void main(String[] args) {
	long startTime = System.currentTimeMillis();
		for (double i = 3; i <= 1000000; i += 2) {
			calculatePrime(i);
		}
	long endTime = System.currentTimeMillis();
	System.out.println("Time : " + (endTime-startTime));
	}

	private static void calculatePrime(double i) {
		boolean flag = true;
		for (double j = 3; j <= Math.sqrt(i); j+=2) {
			if(i % j == 0){
				flag = false;
				break;
			}
		}
		if(flag){
			count += 1;
			System.out.println(i);
		}
	}
}
