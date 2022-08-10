package string_programs;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class PositionOfCharacter {

	public static void main(String[] args) {
		
		String s = "testyantra"; // Op: t= 1 e = 2 s = 3

//		LinkedHashSet<Character> hs = new LinkedHashSet<Character>();
//
//		for (int i = 0; i < s.length(); i++) {
//
//			hs.add(s.charAt(i));
//		}

	
		
			for (int i = 0; i < s.length(); i++) {
				
					System.out.println(s.charAt(i)+ " position is "+ i);		
			}		
	}

  }
