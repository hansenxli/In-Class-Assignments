/**
 * @author Hansen Li
 *
 * @date Jun 15, 2019
 */
public class PartitionList {

	public static int partition(int[] list) {
		// creates new list based on original list's size
		int[] partedList = new int[list.length];
		int pivotVal = list[0];
		int pivotLocation = 0;
		
		// creates start, end, and current location variables
		int start = 0;
		int end = list.length - 1;
		int position = 1;
		
		while (start <= end) {
			
			// does preliminary check for list size and to set pivot value at proper location
			// must be done before other checks to avoid unneeded comparisons
			if (start == end) {
				partedList[start] = pivotVal;
				pivotLocation = start;
				start++;
				end--;
			}
			
			// checks if current int is less than or equal to pivot value
			else if (list[position] <= pivotVal) {
				// inserts current int in new list on start side
				partedList[start] = list[position];
				start++;
				position++;
			}
			
			// checks if current int is greater than pivot value
			//else if (list[position] > pivotVal) {
			else {
				// inserts current int in new list on end side
				partedList[end] = list[position];
				end--;
				position++;
			}
			
		}
		
		// uses loop to print output of list
		System.out.print("After the partition, the list is ");
		for (int i: partedList) {
			System.out.print(i + " ");
		}
		
		return pivotLocation;
	}
}
