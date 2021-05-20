/**
 * @author Hansen Li
 *
 * @date Jun 15, 2019
 */

import java.util.Scanner;

public class Q7_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] numberList = new double[10];
		
		System.out.println("Enter ten numbers: ");
		
		for (int i = 0; i < 10; i++) {
			numberList[i] = input.nextDouble();
		}
		
		System.out.printf("The mean is %.2f\n" , MathFunctions.mean(numberList));
		System.out.printf("The standard deviation is %.5f\n" , MathFunctions.deviation(numberList));
		
	}
	

	
}
	

