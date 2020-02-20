import java.util.Scanner;

public class cost {
	String material;
	float area;
	String option;
	double totalCost;
	public cost() {
		System.out.println("Enter standard / above standard / high standard of material:");
		Scanner s = new Scanner(System.in);
		material = s.nextLine();
		System.out.println("Enter the total area in square meters:");
		area = s.nextFloat();
		s.nextLine();
		System.out.println("Do you want fully automated Home (Y/N) :");
		option = s.nextLine();
		
	}
	public void calculate() {
		if(material.equalsIgnoreCase("high standard") && option.equals("Y")) {
			totalCost = (2500*area);
		}
		else if(material.equalsIgnoreCase("high standard") ) {
			totalCost = (1800*area);
		}
		else if (material.equalsIgnoreCase("above standard")) {
			totalCost = (1500*area);
		}
		else {
			totalCost = (1200*area);
		}
		System.out.println("The cost for construction is :"+totalCost);
	}

}
