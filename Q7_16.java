/**
 * @author Hansen Li
 *
 * @date Jun 16, 2019
 */
import java.util.Random;
public class Q7_16 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] numList = new int[100000];
		int searchResult;

		// generates list of 100000 random ints
		for (int i = 0; i < numList.length; i++) {
			numList[i] = rand.nextInt();
		}
		
		// generates a search key
		int key = rand.nextInt();
	
		
		System.out.println("The key value is: " + key);
		
		//takes time before linear search
		long startTime = System.currentTimeMillis();
		
		//calls linear search
		searchResult = LinearSearch.linearSearch(numList, key);
		
		//gets time after linear search
		long endTime = System.currentTimeMillis();
		
		//calculates difference in time and prints
		long executionTime = endTime - startTime;
		System.out.println("Execution time for linear search in milliseconds was: " + executionTime);
		
		
		//uses selection sort to sort list
		int[] sortedList = SelectionSort.selectionSort(numList);
		
		//takes time before binary search
		startTime = System.currentTimeMillis();
				
		//calls binary search
		searchResult = BinarySearch.binarySearch(sortedList, key);
		
		//gets time after binary search
		endTime = System.currentTimeMillis();
		
		//calculates difference in time and prints
		executionTime = endTime - startTime;
		System.out.println("Execution time for binary search in milliseconds was: " + executionTime);
			
		
		
		
	}
	
	
}
