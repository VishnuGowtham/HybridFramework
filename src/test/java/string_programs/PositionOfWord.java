package string_programs;

import java.util.HashSet;

public class PositionOfWord {

	public static void main(String[] args) {

		String s = "khatam ta ta bye bye";

		String[] str = s.split(" ");

		HashSet<String> hs = new HashSet<String>();

		for (int i = 0; i < str.length; i++) {
			hs.add(str[i]);
		}

		for (String string : hs) {
			// int count = 0;
			for (int i = 0; i < str.length; i++) {

				if (string.equals(str[i])) {
					System.out.println(string + " position " + i);
				}
			}
		}
	}
}
