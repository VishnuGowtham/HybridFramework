package string_programs;

import java.util.HashSet;

public class OccOfletterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "i am in anekal";
		s = s.replace(" ", "");

		HashSet<Character> hs = new HashSet<Character>();
		
		for (int i = 0; i < s.length(); i++) {
			hs.add(s.charAt(i));
		}
		// String[] str = s.split(" ");

		for (Character ch: hs) {
			
	    int count = 0;
			for (int j = 0; j < s.length(); j++) {
				if (ch.equals(s.charAt(j))) {
					count++;
				}

			}
			System.out.println(ch + " is occuring " + count);
		}
	}
}
