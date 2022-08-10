package string_programs;

public class KeyArray {

	public static void main(String[] args) {
		
		int a[] = {1, 2, 3, 4, 5};
		
		int key = 2;
 		
		for (int i = 0; i < key; i++) {
	    
		  int temp = a[0];
		  
		      for (int j = 1; j < a.length; j++) {
			
			       a[j-1] = a[j];
		      }
		      
		      a[a.length-1] = temp;
		      
		}
		 
		    for (int i = 0; i < a.length; i++) {
		    	
				System.out.println(a[i]+ " ");
				
			}
		}	
	}
