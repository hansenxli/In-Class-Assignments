/**
 * @author Hansen Li
 * June 4, 2019
 */
public class NetPayCalc {

	public NetPayCalc(String name, double hours, double payrate, double fedTax, double stateTax) {
		double grosspay = payrate*hours;
		
		System.out.printf("Employee Name: %s\n", name);
		System.out.printf("Hours Worked: %.2f\n", hours);
		System.out.printf("Pay Rate: $%.2f\n", payrate);
		System.out.printf("Gross Pay: $%.2f\n", grosspay);
		System.out.println("Deductions:");
		System.out.printf("\tFederal Withholding (%.2f%%): $%.2f\n", fedTax*100, grosspay*fedTax);
		System.out.printf("\tState Withholding (%.2f%%): $%.2f\n", stateTax*100, grosspay*stateTax);
		System.out.printf("\tTotal Deduction: $%.2f\n", (fedTax+stateTax)*grosspay);
		System.out.printf("Net Pay: $%.2f", (1-fedTax-stateTax)*grosspay);
		
	}
	
}
