package interest;

import java.util.Scanner;

public class simpleInterest {
	int principleAmount;
	int time;
	float rateOfInterest;
	public simpleInterest() {
		System.out.println("Enter P,T,R:");
		Scanner s=new Scanner(System.in);
		principleAmount = s.nextInt();
		time = s.nextInt();
		rateOfInterest = s.nextFloat();
	}
	public void display() {
		float result = (principleAmount*time*rateOfInterest)/100;
		System.out.println("Your Interest is : "+ result);
	}

}
