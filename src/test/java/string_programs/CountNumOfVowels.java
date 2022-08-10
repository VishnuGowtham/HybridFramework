package string_programs;

import java.util.LinkedHashSet;

public class CountNumOfVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "india";
		// op india = 2 => vowels without duplicate
		
		int count = 0;
		LinkedHashSet<Character> lhs = new LinkedHashSet<Character>();

		// Adding character to LinkedHashSet => lhs
		
		for (int i = 0; i < s.length(); i++) {

			lhs.add(s.charAt(i));
		}
			
			for (Character character : lhs) {
				
				if (character == 'a' || character == 'e' || character == 'i' || character == 'o'
						|| character == 'u') {

					count++;
								
			}
				
		}
		System.out.println(s + "=" + count);
	}

}
