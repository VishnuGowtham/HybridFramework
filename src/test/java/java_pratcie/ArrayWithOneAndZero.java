package java_pratcie;

public class ArrayWithOneAndZero {

	public static void main(String[] args) {

		int[] a = { 1, 0, 0, 1, 0, 1, 1, 0 };

		int[] b = new int[a.length]; // array of the same length
		
		int start = 0;
		int end = a.length - 1;
		

		for (int i = 0; i < b.length; i++) {
			if (a[i] == 0) {
				b[start] = a[i];
				start--;
			} else {
				b[end] = a[i];
				end++;
			}
		}

		for (int j = 0; j < b.length; j++) {
			System.out.println(b[j]);
		}

	}

}
