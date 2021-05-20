/**
 * @author Hansen Li
 *
 * @date Jun 20, 2019
 */
import java.util.Scanner;
public class Q9_10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double first, second, third;
		
		System.out.println("Please enter in three doubles for your coefficients for a quadratic equation: ");
		first = input.nextDouble();
		second = input.nextDouble();
		third = input.nextDouble();
		
		QuadraticEquation test = new QuadraticEquation(first, second, third);
		
		if (test.getDiscriminant() < 0)
			System.out.println("The equation has no roots.");
		else if (test.getDiscriminant() == 0)
			System.out.printf("The single root is %f", test.getRoot1());
		else
			System.out.printf("The first root is %f and the second root is %f", test.getRoot1(), test.getRoot2());
		
		input.close();
	}
	
}
