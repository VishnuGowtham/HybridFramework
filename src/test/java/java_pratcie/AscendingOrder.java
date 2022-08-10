package java_pratcie;

public class AscendingOrder {

	public static void main(String[] args) {

		int[] a = { 3, 5, 6, 4, 1};

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] < a[j]) { //if Descending order "a[i] < a[j]"

					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("First min num " +a[0]);  //fmax
		System.out.println("Second min num " +a[1]); //Smax

	}
}
