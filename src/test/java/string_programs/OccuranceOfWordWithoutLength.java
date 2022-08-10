package string_programs;

import java.util.HashSet;

public class OccuranceOfWordWithoutLength {

	public static void main(String[] args) {

		//Occurrence without length variable/length method
		String s = "khatam ta ta bye bye";

		String[] str = s.split(" ");

		int count = 0;

		for (String string : str) {
			count++;
		}

		HashSet<String> hs = new HashSet<String>();

		for (int i = 0; i < count; i++) {
			hs.add(str[i]);
		}

		for (String string : hs) {

			int occurance = 0;

			for (int i = 0; i < count; i++) {

				if (string.equals(str[i])) {
					occurance++;
				}

			}

			System.out.println(string + " No of Occurance is " + occurance);
		}

	}

}
