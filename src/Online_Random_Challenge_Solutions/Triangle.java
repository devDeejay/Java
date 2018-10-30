package binaryIO;

public class Triangle extends Rectangle{
	int base;
	int height;
	
	public void SetSides(int a, int b){
		base = a;
		height = b;
	}
	
	public Triangle(){
		base = 0;
		height = 0;
	}
	
	public Triangle(int b, int h){
		base = length;
		height = breath;
	}
	
	@Override
	public int getArea(){
		return (int) ((0.5) * base * height);
	}
}
