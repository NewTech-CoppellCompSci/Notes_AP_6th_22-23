package notes08_Recursion;

/*
 * Recursion
 * 
 * public static <DataType> recurssiveMethod(){
 * 
 * 		if (<Base Case>){
 * 
 * 			simplest form of this problem
 * 		}
 * 		else {
 * 
 * 			call recursiveMethod() one step 
 * 			closer to the simplest form
 * 		}
 * 
 * }
 * 
 * 
 * 
 */



public class Notes_Recursion {

	public static void main(String[] args) {
		
		System.out.println(addInts(5));
		System.out.println(addInts(10));
		System.out.println(addInts(100));
		
		System.out.println();
		System.out.println(factorial(5));
		System.out.printf("%,d\n", factorial(10));
		
		System.out.println();
		System.out.println(countVowels("happie"));
		System.out.println(countVowels("mIssissIppi"));
		System.out.println(countVowels("aasd;kjn d.afjbv;aoyhdjfkvz jhaerwbn;irbf aneihfj c,waeir;hnv aj,cwicuhmvlighmrpnv29"));
	}

	
	/*
	 * Add all integers <= the parameter
	 * parameter > 0
	 */
	public static int addInts(int num) {
		
		//simplest form of problem
		//Base Case
		if (num == 1) {
			return 1;
		}
		else {
			//if num == 5
			//return 5 + addInts(4)
			return num + addInts(num - 1);
		}
		
	}
	
	
	
	
	/*
	 * Factorial
	 */
	public static int factorial(int num) {
		
		if (num == 1) {
			return 1;
		}
		else {
			return num * factorial(num - 1);
		}
		
		
		
	}
	
	
	/*
	 * Counts all vowels in the string
	 */
	public static int countVowels(String str) {
		
		if (str.equals("")) {
			return 0;
		}
		else {
			//check front character
			//send the other chars to the next method
			
			//get first character
			char letter = str.toLowerCase().charAt(0);
			
			//check for a vowel
			switch (letter) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'y':
				
				return 1 + countVowels(str.substring(1));
				
			default:
				
				
				return countVowels(str.substring(1));
			}
			
			
			
		}
	}
	
	
	
	
	
	
	
	
}
