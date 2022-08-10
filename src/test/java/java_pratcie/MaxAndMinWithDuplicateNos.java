package java_pratcie;

public class MaxAndMinWithDuplicateNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {5, 10, 11, 20, 25, 25, 5};
		int fmax= a[0];
		int smax = a[0];
		
		for (int i = 0; i < a.length; i++) {
			
			if (a[i] < fmax) { // for First min and Sec min change the operater "<" 
				// fmin & smin)
				
				smax = fmax;
				fmax = a[i];
				
			} else if(smax==fmax) {

				smax = a[i];	
			}
		}
		System.out.println("Fmax: "+ fmax);
		System.out.println("Smax: "+ smax);		
	}
}
