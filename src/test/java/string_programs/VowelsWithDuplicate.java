package string_programs;

public class VowelsWithDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "india";
		// op india = 3 => vowels with duplicate

		int count = 0;
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' ||

					s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {

				count++;

			}

		}
		
		System.out.println(s+ "="+ count);

	}

}
