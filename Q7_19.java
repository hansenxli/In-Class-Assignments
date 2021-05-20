/**
 * @author Hansen Li
 *
 * @date Jun 16, 2019
 */
import java.util.Scanner;
public class Q7_19 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter list: ");
		
		// first int is the number of elements, uses that for list size
		int[] list = new int[input.nextInt()];

		// creates loop to create list for following ints
		for (int i = 0; i < list.length; i++)
			list[i] = input.nextInt();
		
		// calls isSorted for boolean value
		if (isSorted(list))
			System.out.println("The list is already sorted.");
		else
			System.out.println("The list is not sorted.");
		
	}
	
	public static boolean isSorted(int[] list) {
		int currVal;
		
		// creates loop and checks if current value is greater than following value
		for (int i = 0; i < list.length - 1; i++){
			currVal = list[i];
			 
			// if current value is greater than following value, returns false
			if (currVal > list[i+1])
				return false;			
		}
		
		// comparisons have no issues so returns true
		return true;
	}

}
