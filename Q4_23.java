/**
 * @author Hansen Li
 * June 4, 2019
 */
import java.util.Scanner;

public class Q4_23 {
	
	public static void main(String[] args) {
		String name;
		Double hours, payrate, fedTax, stateTax;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter employee's name:");
		name = input.nextLine();
		
		System.out.println("Enter number of hours worked in a week:");
		hours = input.nextDouble();
		
		System.out.println("Enter hourly pay rate:");
		payrate = input.nextDouble();
		
		System.out.println("Enter federal tax witholding rate:");
		fedTax = input.nextDouble();
		
		System.out.println("Enter state tax witholding rate:");
		stateTax = input.nextDouble();
		
		NetPayCalc calculate = new NetPayCalc(name, hours, payrate, fedTax, stateTax);

		input.close();
		
	}

}
