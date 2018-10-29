package learningJava;

public class Students {
	
	String name;
	int rollNumber;
	int marks;
	long number;
	
	Students(String nam,int roll,int mark,int num){
		name = nam;
		rollNumber = roll;
		marks = mark;
		number = num;
	}
	Students(){
		//default constructor
	}
	
	public void setName(String s){
		name = s;
	}
	public String getName(){
		System.out.println(name);
		return name;
	}

	
	public void setMarks(int m){
		marks = m;
	}
	public int getMarks(){
		System.out.println(marks);
		return marks;
	}
	

	public void setNumber(long n){
		number = n;
	}
	public long getNumber(){
		System.out.println(number);
		return number;
	}
	
	
	public void setRollNumber(int a){
		rollNumber = a;
	}
	public int getRollNumber(){
		System.out.println(rollNumber);
		return rollNumber;
	}
}
