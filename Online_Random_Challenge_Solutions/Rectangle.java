package binaryIO;

public class Rectangle extends ShapeClass{
	public int getArea(){
		return length * breath;
	}
	
	public int getPerimeter(){
		return 2*(length + breath);
	}
	
	Rectangle(int l, int b){
		length = l;
		breath = b;
	}
	
	Rectangle(){
		length = breath = 0;
	}
}
