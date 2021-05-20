/**
 * @author Hansen Li
 *
 */
import java.util.Scanner;
public class Q6_31 {
	
	public static void main(String[] args) {
		String credNumber;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a credit card number as a String: ");
		credNumber = input.nextLine();
	
		CredNumCheck checker = new CredNumCheck(credNumber);
		
		input.close();
		
	}

}
