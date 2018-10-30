package binaryIO;

import java.util.Scanner;

public class Radar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int R1 = input.nextInt();
		int R2 = input.nextInt();
		int Range = input.nextInt();
		int angle = input.nextInt();
		
		double area1 = 3.14*R1*R1;
		double area2 = 3.14*R2*R2;
		double CompleteArea1 = 360/angle*area1;
		double CompleteArea2 = 360/angle*area1;
		double distanceBetweenPoints = Math.sqrt((R1*R1) + (R2*R2) - (2*R1*R2*Math.cos(angle*(Math.PI/180))));
		System.out.println(distanceBetweenPoints);
		
		double s = (R1+R2+distanceBetweenPoints)/2;
		double t = (Range*Range)*angle*(0.5)*(Math.PI/180);
		double third = Math.sqrt(s*(s-R1)*(s-R2)*(s - distanceBetweenPoints));
		double areaNotCovered = third - t;
		System.out.println(areaNotCovered);
		
		
	}
}
