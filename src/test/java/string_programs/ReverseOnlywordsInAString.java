package string_programs;

public class ReverseOnlywordsInAString {

	public static void main(String[] args) {

		// Reverse the Given String String

		// o/p: matahk at at eyb eyb

		String s = "khatam ta ta bye bye";

		String[] str = s.split(" ");
		
	
		for (String string : str) {
			
			String rev = "";
			
			for (int i = string.length()-1; i >= 0; i--) {
				
				rev = rev + string.charAt(i);  
			}
			
			System.out.print(rev+ " ");
		
	  }
   }
}
