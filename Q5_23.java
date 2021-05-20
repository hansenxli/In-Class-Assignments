/**
 * @author Hansen Li
 * June 8, 2019
 */
	//pardon if this is a single class file; it looked too simple to need a second

public class Q5_23 {
	
	public static void main(String[] args) {
		
		double total = 0;
		System.out.println("n = 50000");
		
		for (int i = 1; i <= 50000; i++) {
			total += 1.0/i;
		}
		
		System.out.println("For right to left, total is " + total);
		
		total = 0;
		
		for (int i = 50000; i >= 1; i--) {
			total += 1.0/i;
		}
		
		System.out.println("For left to right, total is " + total);
		

	}
	
	
	
	
	
}
