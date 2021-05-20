/**
 * @author Hansen Li
 *
 * @date Jun 16, 2019
 */

import java.util.Scanner;
public class Q7_15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] list = new int[10];
		
		System.out.println("Enter ten numbers: ");
		
		for (int i = 0; i < 10; i++) {
			list[i] = input.nextInt();
		}
		
		System.out.print("The distinct numbers are: ");
	
		int[] newList = ListDuplicateRemover.eliminateDuplicates(list);
		
		for (int j = 0; j < newList.length; j++) {
			System.out.print(newList[j] + " ");
		}
		
	}

	
}
