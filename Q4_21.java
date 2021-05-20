/**
 * @author Hansen Li
 * June 4, 2019
 */
import java.util.Scanner;

public class Q4_21 {
	
	public static void main(String[] args) {
		String ssnCheck;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a SSN:");
		
		ssnCheck = input.nextLine();
		
		CheckSSN check = new CheckSSN(ssnCheck);
		
		input.close();
	}

}
