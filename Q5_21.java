/**
 * @author Hansen Li
 * June 8, 2019
 */
import java.util.Scanner;

public class Q5_21 {
	
	public static void main(String[] args) {
		int amount, years;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Loan Amount:");
		amount = input.nextInt();
		
		System.out.println("Number of Years:");
		years = input.nextInt();
		
		LoanInterest output = new LoanInterest(amount, years);
		
		input.close();
		
	}

}
