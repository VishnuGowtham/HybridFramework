package java_pratcie;

public class LastThreeSum {

	public static void main(String[] args) {

		int[] a = { 7, 3, 2, 4, 6, 1 };

		for (int i = 0; i < a.length; i++) {

			for (int j = i+1; j < a.length; j++) {

				if (a[i] < a[j]) { //to get first three min values a[i] ">" a[j]

					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
			  int sum = 0;
			  
			  for (int i = 0; i < 3; i++) { 
				  sum = sum + a[i]; 
			  }
			  System.out.println("Last 3 no sum is "+sum);
			 
		
	}

}
