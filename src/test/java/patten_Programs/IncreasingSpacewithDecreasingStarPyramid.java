package patten_Programs;

public class IncreasingSpacewithDecreasingStarPyramid {
	
	public static void main(String[] args) {

		int row = 5;
	
		int col = 5;
		int space = 1;

		for (int i = 1; i <= row; i++) {

			for (int j = 1; j < space; j++) {

				System.out.print("  ");
			}
			
			for (int k = i; k <= col ; k++) {
				System.out.print("* ");
			}
			
			System.out.println();
			space++;
			
		}
	}

}


/*
o/p: 
	
	*****
	 ****
	  ***
	   **
	    *	
*/