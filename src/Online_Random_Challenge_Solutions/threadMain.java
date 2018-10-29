package binaryIO;

public class threadMain {

	public static void main(String[] args) {
		threadChangeValue changeThread = new threadChangeValue(); 
		changeThread.run();
		
		threadReadValue readThread = new threadReadValue();
		readThread.run();
	}

}