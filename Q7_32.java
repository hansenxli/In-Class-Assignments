/**
 * @author Hansen Li
 *
 * @date Jun 15, 2019
 */

import java.util.Scanner;
public class Q7_32 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter List: ");
		
		// first int is the number of elements, uses that for list size
		int[] list = new int[input.nextInt()];
		
		// creates loop to create list for following ints
		for (int i = 0; i < list.length; i++)
			list[i] = input.nextInt();
		
		int location = PartitionList.partition(list);
		
		System.out.println("\n Pivot location index is at " + location);
		
		
	}
	

	
}
