/**
 * @author Hansen Li
 *
 */

public class CredNumCheck{
	
	// constructor calls isValid and prints appropriate statement
	public CredNumCheck(String credNumber) {
		
		if(isValid(credNumber))
			System.out.printf("%s is valid",credNumber);
		else
			System.out.printf("%s is invalid", credNumber);
	}
	
	// isValid determines boolean value of validity
	public static boolean isValid(String credNumber) {
		
		// checks size first
		if (getSize(credNumber) < 13 || getSize(credNumber) > 16) {
			return false;
		}
		
		// checks for proper prefix to see if number begins with any of the valid starts
		// might be a more efficient way for this part of the code
		else if ((prefixMatched(credNumber, 4)) == false && prefixMatched(credNumber, 5) == false && prefixMatched(credNumber, 37) == false && prefixMatched(credNumber, 6) == false) {
			return false;
		}

		// checks for modulus 
		else if((sumOfDoubleEvenPlace(credNumber) + sumOfOddPlace(credNumber)) % 10 != 0) {
			return false;
		}

		// passes all tests and returns true
		else
			return true;
	}
	
	// returns sum of doubled even location digits
	public static int sumOfDoubleEvenPlace(String credNumber) {
		
		int sum = 0;

		// creates loop to cover every even digit
		for (int i = getSize(credNumber) - 2; i >= 0; i -= 2) {
			// had CS mentor help with this line to convert string to int
			sum += getDigit(Integer.parseInt(credNumber.charAt(i) + "") * 2);
		}
		
		return sum;
	}
	
	// return this number if it is a single digit
	// otherwise return the sum of the two digits
	public static int getDigit(int digit) {
		
		//creates variables to store digit values if two
		int firstDigit;
		int secondDigit;
		
		if (digit < 10)
			return digit;
		
		else {
			firstDigit = digit / 10;
			secondDigit = digit % 10;
			return (firstDigit + secondDigit);
		}
		
	}
	
	// same function as sumOfDoubleEvenPlace but no doubling and with odd location digits
	public static int sumOfOddPlace(String credNumber) {
		
		int sum = 0;
		
		for (int i = getSize(credNumber) - 1; i >= 0; i -= 2) {
			sum += Integer.parseInt(credNumber.charAt(i) + "");
		}
		
		return sum;
	}
	
	//  returns boolean for whether credNumber begins with prefix 
	public static boolean prefixMatched(String credNumber, int d) {
		
		// calls getPrefix and returns that boolean value
		return getPrefix(credNumber, getSize(d + "")) == d;
	}
	
	// returns size of credNumber
	public static int getSize(String credNumber) {
		
		int length = credNumber.length();
		return length;
		}
	
	// returns the prefix value of credNumber
	public static long getPrefix(String credNumber, int k) {
		
		if (getSize(credNumber) > k)  {
			// had CS mentor help with substring line
			return Long.parseLong(credNumber.substring(0, k));
		}
		
		return Long.parseLong(credNumber);
	}
}
