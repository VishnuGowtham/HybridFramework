package patten_Programs;

public class TriangleStarProg {

	public static void main(String[] args) {

		int row = 4;
		int space = 3;

		for (int i = 1; i <= row; i++) {

			for (int j = space; j > 0 ; j--) {
                 System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}

			System.out.println("");
			space--;
		}

	}
}




// O/P:
/* 
   * 
  * * 
 * * * 
* * * *
 */
