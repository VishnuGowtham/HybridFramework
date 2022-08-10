package string_programs;

import java.util.HashSet;

public class OccuranceOfWords {

	public static void main(String[] args) {
	
		String s = "khatam ta ta bye bye";
		int slength = s.length();// for reference

		String[] str = s.split(" ");
		int strlength = str.length;// for reference

//		System.out.println(slength);
//		System.out.println(strlength);

		HashSet<String> hs = new HashSet<String>();

		for (int i = 0; i < str.length; i++) {
			hs.add(str[i]);
		}

		for (String string : hs) {

			int count = 0;

			for (int i = 0; i < str.length; i++) {

				
				if (string.equals(str[i])) {  //str[i]= str[i].toLowerCase();
					count++;
				}

			}
        
			System.out.println(string+ " No of Occurance is "+ count);
		}

	}

}
