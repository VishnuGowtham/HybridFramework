package patten_Programs;

public class ReverseTriangle {

	public static void main(String[] args) {

		int row = 4 , col = 4;
		int space = 0;

		for (int i = 1; i <= row; i++) {
			
			for (int j = 0; j < space ; j++) {
                System.out.print(" ");
			}
			for (int k = col; k > 0; k--) {
				System.out.print("* ");
			}
			

			System.out.println("");
			space++;
			col--;
		}

	}
}

