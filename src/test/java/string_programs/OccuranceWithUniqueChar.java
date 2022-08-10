package string_programs;

import java.util.HashSet;

public class OccuranceWithUniqueChar {

	public static void main(String[] args) {

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
			if (count == 1)

		    System.out.println(ch + " is occuring only one time  " + count);

		}

	}

}
