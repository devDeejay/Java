package Java_Helper_Codes;

public class Link{
	public int iData;
	public double dData;
	public Link next;
	public Link(int id, double dd){
		iData = id;
		dData = dd;
	}
	public void displayLink(){
		System.out.println("{"+iData+", "+dData + " } ");
	}
}
