/**
 * @author Hansen Li
 *
 * @date Jun 18, 2019
 */
public class Q9_7 {

	public static void main(String[] args) {
		Account test = new Account(1122, 20000);
		test.setAnnualInterestRate(4.5);
		test.withdraw(2500);
		test.deposit(3000);
		System.out.printf("The current balance is $%.2f\n", test.getBalance());
		System.out.printf("The current monthly interest is $%.2f\n", test.getMonthlyInterest());
		System.out.println("The date of creation was " + test.getDateCreated());
	}
	
}
