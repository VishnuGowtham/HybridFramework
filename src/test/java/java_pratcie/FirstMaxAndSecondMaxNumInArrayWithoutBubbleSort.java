package java_pratcie;

public class FirstMaxAndSecondMaxNumInArrayWithoutBubbleSort {

	public static void main(String[] args) {

		int[] a = { 5, 6, 7, 8, 9};

		int fmax = a[0];
		int smax = a[0];

		for (int i = 0; i < a.length; i++) {
			
			if (a[i] > fmax) { //for fmin change "<" operator
				
				smax = fmax;
				fmax = a[i];
				
			} else if (a[i] > smax) { //for fmin change "<" operator

				smax = a[i];
			}
		}

		System.out.println("This is first max number: " + fmax + 
				"\n" + "This is second max num: " + smax);
	}
}
