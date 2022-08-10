package string_programs;

import java.util.ArrayList;


public class OccuranceOfWithDuplicates {

	public static void main(String[] args) {

		String s = "Khatam Ta ta Bye bye";

		String[] str = s.split(" ");

		ArrayList<String> hs = new ArrayList<String>();

		for (int i = 0; i < str.length; i++) {
			hs.add(str[i]);
		}

		for (String string : hs) {

			int count = 0;

			for (int i = 0; i < str.length; i++) {

				if (string.equalsIgnoreCase(str[i])) {
					count++;
				}

			}

			System.out.println(string + "==" + count);
		}

	}

}
