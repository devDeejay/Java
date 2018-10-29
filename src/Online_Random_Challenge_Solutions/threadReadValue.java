package binaryIO;

public class threadReadValue extends threadArray implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
