/**
 * @author Hansen Li
 *
 * @date Jun 16, 2019
 */
public class ListDuplicateRemover {

	public static int[] eliminateDuplicates(int[] list) {
		
		int[] newList = new int[list.length];
		int position = 0;
		int count = list.length;
		
		// creates nested loop to iterate through list and check to see if value already exists in new list
		for (int i = 0; i < list.length; i++) {
			boolean exists = false;
			
			// count also keeps track of how many unique elements there are
			for (int j = 0; j <= position; j++) {
				if (list[i] == newList[j]) {
					exists = true;
					count--;
					break;
				}
			}
			
			// if the element is not in the new list, it adds it
			if (exists == false) {
				newList[position] = list[i];
				position++;
			}
		}
		
		// creates a final list with appropriate length
		int[] finalList = new int[count];
		
		for (int k = 0; k < count; k++) {
			finalList[k] = newList[k];
		}
		
		return finalList;
		
	}
}
