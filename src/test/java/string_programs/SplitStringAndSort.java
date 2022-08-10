package string_programs;

import java.util.Arrays;

public class SplitStringAndSort {

	public static void main(String[] args) {
		String s = "ccuuuddwwabaaabzzzzab";
		String[] split = s.split("ab");
		Arrays.sort(split);
		String res = "";
		for (int i = 0; i < split.length; i++) {
			res = res + split[i];

		}

		System.out.println(res);
	}

}
