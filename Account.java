/**
 * @author Hansen Li
 *
 * @date Jun 20, 2019
 */
import java.util.Date;

public class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated; 
	
	public Account() {
		dateCreated = new Date();
	}
	
	public Account(int i, double initial) {
		setId(i);
		setBalance(initial);
		dateCreated = new Date();
	}
	
	public void setId(int i) {
		id = i;
	}
	
	public void setBalance(double b) {
		balance = b;
	}
	
	public void setAnnualInterestRate(double interest) {
		annualInterestRate = interest;
	}
	
	public int getId() {
		return id;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public String getDateCreated() {
		return dateCreated.toString();
	}
	
	public double getMonthlyInterestRate() {
		return annualInterestRate/12;
	}
	
	public double getMonthlyInterest() {
		return getMonthlyInterestRate()/100 * balance;
	}
	
	// subtracts withdrawal amount from account
	public double withdraw(double amount) {
		if (amount > balance) {
			System.out.println("Error: Not enough in balance");
			return 0;
		}
		else {
			balance -= amount;
			System.out.printf("You have withdrawn $%.2f\n", balance);
			return amount;
		}
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
}
