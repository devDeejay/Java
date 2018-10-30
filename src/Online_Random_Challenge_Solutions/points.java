package binaryIO;

public final class points {

	double x;
	double y;
	
	public points(double a,double b){
		x = a;
		y = b;
	}
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
	public void setX(double a){
		x = (int)a;
	}
	public void setY(double a){
		y = (int)a;
	}
}
