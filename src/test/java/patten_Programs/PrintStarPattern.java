package patten_Programs;
import java.awt.*;

public class PrintStarPattern {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		int row = 5;
		int col = 5;
		
		for (int i = 1; i <= row; i++) {
		
			for (int j = 1; j <= col; j++) {
				
	            System.out.print("* ");
				
			}
			System.out.println();
		}
		
		
		
		
		//o/p:
		//* * * * * * 
		//* * * * * * 
		//* * * * * * 
		//* * * * * * 
		//* * * * * * 
		
		
		Robot robot = new Robot();
		
		
		
		
		
	}

}
