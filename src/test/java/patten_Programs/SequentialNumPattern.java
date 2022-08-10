package patten_Programs;

public class SequentialNumPattern {

	public static void main(String[] args) {

		int row = 5;
		int count = 1;
		
		for (int i = 0; i < row; i++) {
			
		 for (int j = 0; j <= i ; j++) {
			 System.out.print(count+ " ");
			 if (count>=9) {
	              count=0;			
			}
			 count++;			 
		}	
		 
		 System.out.println();	
		}

	}

}
