/**
 * @author Hansen Li
 *
 * @date Jun 20, 2019
 */
public class Q10_6 {
	
	public static void main(String[] args) {
		StackOfIntegers primeStack = new StackOfIntegers();
		
		// loops through values up to 120
		for (int i = 2; i <= 120; i++) {
			// calls the prime check method and adds value to the stack if it is
			if (isPrime(i)) {
				primeStack.push(i);
			}
		}
		
		// prints all values of the stack
		for (int j = primeStack.getSize(); j > 0; j--) {
			System.out.println(primeStack.pop() + " ");
		}
		
	}

	// checks for prime
	public static boolean isPrime(int num) {

		// loops through all possible divisors
		for (int i = num-1; i > 1; i--) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
	
}
