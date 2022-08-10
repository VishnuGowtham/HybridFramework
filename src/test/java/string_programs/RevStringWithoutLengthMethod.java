package string_programs;

public class RevStringWithoutLengthMethod {

	public static void main(String[] args) {

		String s = "testyantra";
		char[] conChar = s.toCharArray();
		
		String rev = "";

		/*
		 * for (int i = c.length - 1; i >= 0; i--) {
		 * 
		 * rev = c[i] + rev; // System.out.print(c[i]); }
		 */
		/*
		 * for (int i = 0; i < c.length; i++) {
		 * 
		 * rev = c[i] + rev; // System.out.print(c[i]); }
		 * 
		 * System.out.println(rev);
		 */
		
		//without using length and length() and storing in third variable 
		int count = 0;
		
		for (char c : conChar) {
			count++;
		}
		
		System.out.println(count);

		for (int i = count-1; i >= 0; i--) {
			
			rev = rev + s.charAt(i);
			
			//System.out.print(s.charAt(i));
			//System.out.print(conChar[i]);
		}
		
           System.out.print(rev);	
	}
}
