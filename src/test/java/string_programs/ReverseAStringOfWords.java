package string_programs;


public class ReverseAStringOfWords {

	public static void main(String[] args) {
		
		// Reverse the Given String String
		//o/p: bye bye ta ta khatam
		
		String s = "khatam ta ta bye bye";

		String[] str = s.split(" ");

			for (int i = str.length-1; i >= 0 ; i--) {

				System.out.print(str[i]+ " ");

			}
			
		}

	}
