/**
 * @author Hansen Li
 * June 8, 2019
 */
public class LoanInterest {
	
	public LoanInterest(int amount, int years) {
		
		//formats columns
		System.out.printf("%-20s %-20s %-20s \n\n", "Interest Rate", "Monthly Payment", "Total Payment");
		
		//creates loop using interest rates with 0.250 intervals
		for (double i = 5.000; i <= 8; i += 0.250) {
			double monthlyRate = i / 1200;
			//calculates payments using the formula
			double monthlyPayment = amount * monthlyRate / (1 - 1/Math.pow(1 + monthlyRate,  years*12));
			double totalPayment = monthlyPayment * years * 12;
			//converts double to string for format output
			String x = String.format ("%.3f%%", i);		
			//outputs columns with values
			System.out.printf("%-20s %-20.2f %-20.2f \n", x, monthlyPayment, totalPayment);
	
		}
	}
}
