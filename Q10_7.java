/**
 * @author Hansen Li
 *
 * @date Jun 21, 2019
 */
import java.util.Scanner;
public class Q10_7 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char id = 'a';
		int intID;
		int choice = 4;
		boolean menuLoop = true;
		Account[] accountList = new Account[10];
		
		// intializes all accounts to $100
		for (int i = 0; i < 10; i++) {
			accountList[i] = new Account(i,100);
		}
		
		// creates permanent loop for choice
		while (choice == 4) {
			System.out.println("Please enter an account ID from 0 to 9");
			id = input.next().charAt(0);

			// creates a while loop to catch non valid entries
			while (id < 48 || id > 57) {
				System.out.println("Error: Non-valid entry input.");
				System.out.println("Please enter an account ID from 0 to 9");
				id = input.next().charAt(0);
			}
			
			// updates int variable from char value
			intID = id - 48;
			
			// sets menuloop to true
			menuLoop = true;
			
			// doesn't exit menu loop until option 4 is chosen
			while(menuLoop) {
			
				displayMenu();
				choice = input.nextInt();
				System.out.println(choice);
			
				// switch for user input menu choice
				switch (choice) {
				case 1:
					System.out.printf("Account %d has a balance of $%.2f\n", intID, accountList[intID].getBalance());
					break;
				case 2:
					System.out.println("Withdraw how much?");
					accountList[intID].withdraw(input.nextDouble());
					break;
				case 3:
					System.out.println("Deposit how much?");
					accountList[intID].deposit(input.nextDouble());
					System.out.println("Deposit has been made.");
					break;
				case 4:
					System.out.println("Exiting.");
					menuLoop = false;
					break;
				default:
					System.out.println("Invalid Entry");
				}
			}
		}
	}
	
	// prints display menu
	public static void displayMenu() {
		System.out.println("Account Menu");
		System.out.println("1: View Current Balance");
		System.out.println("2: Withdraw Money");
		System.out.println("3: Deposit Money");
		System.out.println("4: Exit Main Menu");		
	}
	
}
