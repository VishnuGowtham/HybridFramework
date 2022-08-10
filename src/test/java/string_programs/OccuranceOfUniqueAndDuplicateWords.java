package string_programs;

import java.util.HashSet;

public class OccuranceOfUniqueAndDuplicateWords {

	public static void main(String[] args) {
	
         //Check the Occurrence of Unique and duplicate
		String s = "khatam ta ta bye bye";

		String[] str = s.split(" ");

		HashSet<String> hs = new HashSet<String>();

		for (int i = 0; i < str.length; i++) {
			hs.add(str[i]);
		}

		for (String string : hs) {
			int count = 0;
			for (int i = 0; i < str.length; i++) {

				if (string.equals(str[i])) {
					count++;
				}

			}

			if (count == 1) {
				System.out.println(string + " Occurance is unique " + count);
			} else if (count > 1) {
				System.out.println(string + " Occurance is duplicate " + count);
			}

		}
	}
}
