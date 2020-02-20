package interest;

import java.util.Scanner;
import java.lang.Math;

public class compoundInterest {
	int principleAmount;
	int time;
	float rateOfInterest;
	int n;
	public compoundInterest() {
		System.out.println("Enter P,T,R,N:");
		Scanner s=new Scanner(System.in);
		principleAmount = s.nextInt();
		time = s.nextInt();
		rateOfInterest = s.nextFloat();
		n = s.nextInt();
		
	}
	
	public void display() {
		float result = (float) (principleAmount * ( Math.pow( (1+(rateOfInterest/n) ),(time*n))));
		System.out.println("The interest is :"+result);
	}

}
