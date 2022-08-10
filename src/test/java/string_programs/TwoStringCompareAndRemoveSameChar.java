package string_programs;

public class TwoStringCompareAndRemoveSameChar {

	public static void main(String[] args) {

		String s = "Rocky Bhai";
		s = s.toLowerCase();
		String s1 = "Amarendra Bahubali";
		s1 = s1.toLowerCase();
		
		for (int i = 0; i < s.length(); i++) {
		
			int count = 0;
			
			for (int j = 0; j < s1.length(); j++) {

				if (s.charAt(i) == s1.charAt(j)) {
					count++;
				}

			  }
			if (count == 0) {
				System.out.print(s.charAt(i));
			}
		}
	}
}
