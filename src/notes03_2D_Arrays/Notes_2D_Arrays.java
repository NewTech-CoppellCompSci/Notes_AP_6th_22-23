package notes03_2D_Arrays;

/*
 * 2D Arrays Notes
 *    How to create and manipulate multi-dementional lists
 *
 * 
 * 
 * Note:
 * 
 *   You can think of these like (x, y) coordinates
 *   
 *   BUT, that's NOT what's actually happening
 *   
 *   
 *    
 *    
 *    
 */

public class Notes_2D_Arrays {

	public static void main(String[] args) {
		

		//creating 2D arrays
		int[] nums1 = new int[6]; //1D array with 6 elements
		int[][] nums2 = new int[6][4];  //2d array with 6 rows and 4 columns
		int[][][] nums3 = new int[6][4][2];  //3D array with 6 rows and 4 columns and 2 height
		
		//create one with specific values
		int[] manual1 = {1, 2, 3, 4, 5};
		int[][] manual2 = {{1, 2, 3, 4, 5}, 
				           {6, 7, 8, 9, 10},
				           {4,3}}; //note, they're not all the same size
		
		
		
		//traversing a 2D array
		for (int i = 0; i < nums2.length; i++) {  //cycle through all the rows
			for (int j = 0; j < nums2[i].length; j++) {  //cycle through all the columns on a given row
				
				nums2[i][j] = i + j;  //setting the elements in the array
				
			}
			
		}
		
		
		/*
		 * Printing a 2D array.
		 * 
		 * Just like traversing, but you print the elements
		 */
		//printing nums2
		for (int i = 0; i < nums2.length; i++) {
			for (int j = 0; j < nums2[i].length; j++) {
				
				System.out.print(nums2[i][j] + " ");  //prints 1 row
				
			}
			System.out.println();  //move cursor to next row
		}

		System.out.println();

		
		
		//printing manual2
		for (int i = 0; i < manual2.length; i++) {
			for (int j = 0; j < manual2[i].length; j++) {
				
				System.out.print(manual2[i][j] + " ");
				
			}
			
			System.out.println();
			
		}

	}

}
