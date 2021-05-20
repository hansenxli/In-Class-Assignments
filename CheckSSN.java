/**
 * @author Hansen Li
 * June 4, 2019
 */
public class CheckSSN {

	public CheckSSN(String text) {
		
		if (text.length() != 11) {
			System.out.printf("%s is an invalid social security number.", text);
			System.exit(1);
		}
		
		if (Character.isDigit(text.charAt(0)) == false) {
			System.out.printf("%s is an invalid social security number.", text);
			System.exit(1);
		}
		
		if (Character.isDigit(text.charAt(1)) == false) {
			System.out.printf("%s is an invalid social security number.", text);
			System.exit(1);
		}
		
		if (Character.isDigit(text.charAt(2)) == false) {
			System.out.printf("%s is an invalid social security number.", text);
			System.exit(1);
		}
		
		if (text.charAt(3) != '-') {
			System.out.printf("%s is an invalid social security number.", text);
			System.exit(1);
		}
		
		if (Character.isDigit(text.charAt(4)) == false) {
			System.out.printf("%s is an invalid social security number.", text);
			System.exit(1);
		}
		
		if (Character.isDigit(text.charAt(5)) == false) {
			System.out.printf("%s is an invalid social security number.", text);
			System.exit(1);
		}
		
		if (text.charAt(6) != '-') {
			System.out.printf("%s is an invalid social security number.", text);
			System.exit(1);
		}
		
		if (Character.isDigit(text.charAt(7)) == false) {
			System.out.printf("%s is an invalid social security number.", text);
			System.exit(1);
		}
		
		if (Character.isDigit(text.charAt(8)) == false) {
			System.out.printf("%s is an invalid social security number.", text);
			System.exit(1);
		}
		
		if (Character.isDigit(text.charAt(9)) == false) {
			System.out.printf("%s is an invalid social security number.", text);
			System.exit(1);
		}
		
		if (Character.isDigit(text.charAt(10)) == false) {
			System.out.printf("%s is an invalid social security number.", text);
			System.exit(1);
		}
		
		System.out.printf("%s is a valid social security number.", text);

		
		
//		// tests length of string; quits if SSN length isn't matched
//		if (text.length() != 11) {
//			System.out.printf("%s is an invalid social security number. Failed Length", text);
//			System.exit(1);
//		}
//		else
//			//creates for loop to parse through input
//			for (int i = 0; i < text.length(); i++) {
//				
//				//checks dashes at correct locations
//				if (i == 3 || i == 6) {
//					
//					if (text.charAt(i) != '-') {
//						System.out.printf("%s is an invalid social security number. Failed - test", text);
//						System.exit(1);
//					}
//					
//				if ((i != 3 && i != 6) && (text.charAt(i) <= 57 && text.charAt(i) >= 48) == false) {
//					System.out.println(text.charAt(i));
//					System.out.printf("%s is an invalid social security number. Failed num check", text);
//					System.exit(1);
//				}
//					
//			}
//		}
//	
//		System.out.printf("%s is a valid social security number.", text);

	}
		
}
