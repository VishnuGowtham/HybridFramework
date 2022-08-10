package string_programs;

import java.util.HashSet;

public class OccuranceOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "testyantra";

		HashSet<Character> hs = new HashSet<Character>();

		for (int i = 0; i < s.length(); i++) {

			hs.add(s.charAt(i));
		}

		for (Character ch : hs) {
			int count = 0;

			for (int i = 0; i < s.length(); i++) {
				
				if (ch.equals(s.charAt(i))) {
					count++;
				}
			}

			System.out.println(ch + " is occuring " + count);
		}

	}

}
