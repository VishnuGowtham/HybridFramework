package java_pratcie;

public class OccuranceOfZeroInArray {

	public static void main(String[] args) {
		
		int[] a= {0,1,2,3,0,4,0,5};
		
		int count = 0;
		
		for (int i = 0; i < a.length; i++) {
		
			if (a[i] == 0) {
				count++;
				//break;
			}
		}
		
		System.out.println("No of occurance Of Zero are " + count);
		
	}
}
