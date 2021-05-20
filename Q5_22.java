/**
 * @author Hansen Li
 * June 8, 2019
 */
import java.util.Scanner;

public class Q5_22 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Loan Amount:");
		int amount = input.nextInt();
		System.out.println("Number of Years:");
		int years = input.nextInt();
		System.out.println("Annual Interest Rate:");
		double interestRate = input.nextDouble();
		
		PaymentSchedule calculate = new PaymentSchedule(amount, years, interestRate);
		
		input.close();
	}
}
