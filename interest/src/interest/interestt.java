
package interest;
import java.util.*;

public class interestt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter si or ci:");
		Scanner s=new Scanner(System.in);
		String ch;
		ch=s.nextLine();
		if(ch.equals("si")) {
			simpleInterest ob = new simpleInterest();
		    ob.display();
		}
		else {
			compoundInterest ob = new compoundInterest();
			ob.display();
		}

	}

}
