/**
 * @author Hansen Li
 * June 8, 2019
 */
public class PaymentSchedule {

	public PaymentSchedule(int amount, int years, double rate) {
		
		double monthlyRate = rate / 1200;
		//calculates payments using the formula
		double monthlyPayment = amount * monthlyRate / (1 - 1/Math.pow(1 + monthlyRate,  years*12));
		double totalPayment = monthlyPayment * years * 12;
		double balance = amount;
		//outputs payments
		System.out.printf("Monthly Payment: %.2f\n", monthlyPayment);
		System.out.printf("Total Payment: %.2f\n\n", totalPayment);
		
		//prints columns
		System.out.printf("%-20s %-20s %-20s %-20s\n", "Payment#", "Interest", "Principal", "Balance");
		
		//creates loop to calculate new interest, principal amount, and balance with columns
		for (int i = 1; i <= years * 12; i++) {
			double interest = monthlyRate * balance;
			double principal = monthlyPayment - interest;
			balance = balance - principal;
			System.out.printf("%-20d %-20.2f %-20.2f %-20.2f\n", i, interest, principal, balance);
		}
		
	}
	
}
