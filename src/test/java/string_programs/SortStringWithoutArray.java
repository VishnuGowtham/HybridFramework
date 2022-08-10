package string_programs;


import java.util.LinkedHashSet;

public class SortStringWithoutArray {

	public static void main(String[] args) {
		
		String s = "abcdabcdabcd";

		LinkedHashSet<Character> hs = new LinkedHashSet<Character>();

		for (int i = 0; i < s.length(); i++) {

			hs.add(s.charAt(i));
		}

		for (Character ch : hs) {

			for (int i = 0; i < s.length(); i++) {
				
				if (ch.equals(s.charAt(i))) {
					
					System.out.print(ch);
				}
			}

			System.out.println(" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
