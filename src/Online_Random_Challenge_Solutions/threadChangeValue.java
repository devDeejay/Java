package binaryIO;

public class threadChangeValue extends threadArray implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 0;
			System.out.println("Changing Value");
		}
	}

}
