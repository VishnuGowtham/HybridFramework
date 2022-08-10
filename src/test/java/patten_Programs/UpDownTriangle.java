package patten_Programs;

public class UpDownTriangle {
	public static void main(String[] args) {

		int row = 7;
		int space = 3;
		
		  int count = 1;
		for (int i = 0; i < row; i++) {
			 
			    
	
				for (int j = space; j > 0; j--) {
					System.out.print(" ");
				}

				for (int k = 0; k < count; k++) {
					System.out.print("* ");
				}
				System.out.println("");
				space--;
				count++;
			
                
			    
			if (count == 4) {
                   
				for (int j = 0; j <= space; j++) {
					System.out.print(" ");
				}
				
				for (int k = count; k > 0; k--) {
					System.out.print("* ");
				}

				System.out.println("");
				space++;
				count--;
			}

		}
	}
}
