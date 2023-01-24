package notes09_Search_Sort;

public class Notes_Search {

	public static void main(String[] args) {
		
		/*
		 * Binary Search Notes
		 * 
		 */
		
		
		int[] nums = new int[1000];
		/*
		 * assume we populate and sort this list
		 */
		
		
		//basic values we need to track
		//min = lowest index
		//max = upper index
		//midpoint = average of min and max
		
		//loop
		//keep looping until min > max (they switch)
			
			//calculate midpoint
		
			//is midpoint < 'key'
				//min = mid + 1
				//keep looking
			
			//is midpoint > 'key'
				//max = mid - 1
				//keep looking
		
			//is midpoint == 'key'
				//WE FOUND IT
				//Do whatever you need to show you found it
		
		
		//This may or may mot be necessary
		//if min > max
			//indicate it wasn't found
		
		
		
		
		
		
		
	}
}
