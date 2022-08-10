package string_programs;

public class VowelsWithArray {

	public static void main(String[] args) {
		// Array with duplicate op as hi = 1 , hello = 2, india = 3

		String atr[] = { "hi", "hello", "india" };

		
		for (String string : atr) {
			int count = 0;
			for (int i = 0; i < string.length(); i++) {

				if (string.charAt(i) == 'a' || string.charAt(i) == 'e' ||

						string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u') {

					count++;

				}

			}
			System.out.println(string+" "+count);
		}

	}

}
