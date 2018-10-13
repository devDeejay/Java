package Java_Helper_Codes.Stack;

public class Stack {
	private int[] object;
	private int top;
	private int stackSize;
	
	public Stack(){
		stackSize = 1;
		top = -1;
		object = new int[stackSize];
	}
	public void push(int item){
		if(top>=stackSize - 1){
			resize();
			object[++top] = item; 
		}
	}
	
	public Integer pop(){
		if(top < 0)
			return null;
		return object[top--];
	}
	
	private void resize() {
		int[] temp = object;
		stackSize = stackSize * 2;
		object = new int[stackSize];
		
		for (int i = 0; i < top; i++) {
			object[i] = temp[i];
		}
	}
	
}
