package java_pratcie;

public class FirstThreeValueSum {

	public static void main(String[] args) {

		int[] a = { 9, 3, 8, 1, 6, 0 };

		for (int i = 0; i < a.length; i++) {

			for (int j = i+1; j < a.length; j++) {

				if (a[i] > a[j]) {

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
		System.out.println("First 3 no sum is "+sum);
		
	}
}
