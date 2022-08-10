package java_pratcie;

public class SumOfTwoArray {

	public static void main(String[] args) {

		int[] a = { 2, 4, 1, 6, 8};
		int[] b = { 1, 5, 7, 3 ,6, 2};
		// o/p : 3 9 8 9 8
		int count = a.length;

		if (a.length < b.length) {
			count = b.length;

		}
		for (int i = 0; i < count; i++) {
			try {
				System.out.println(a[i] + b[i]);
			} catch (Exception e) {
				if (a.length > b.length) {
					System.out.println(a[i]);
				} else {
					System.out.println(b[i]);
				}
			}
		}
	}
}
