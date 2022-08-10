package string_programs;

import java.util.HashSet;

public class OccurrenceOfCharWithoutLengthMethod {

public static void main(String[] args) {
	// TODO Auto-generated method stub

	String s = "testyantra";
	
	char[]  character  =  s.toCharArray();
	
	int count = 0;

	for (char ch: character) {
		count++;
	}
        
	System.out.println(s+ " no of letters " +count);
	
	HashSet<Character> hs = new HashSet<Character>();

	for (int i = 0; i < count; i++) {

		hs.add(s.charAt(i));
	}

	for (Character ch : hs) {
		
		int occurrence = 0;

		for (int i = 0; i < count; i++) {
			if (ch.equals(s.charAt(i))) {
				occurrence++;
			}
		}

	System.out.println(ch + " is occuring " + occurrence);
  }

 }

}

