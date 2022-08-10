package string_programs;

public class ReverseStringWithStoringInThirdvariable {

	public static void main(String[] args) {
		
		
		String s = "VijaY";
		                    //s= s.toLowerCase();
		String reverse = "";
		
		
		for (int i = s.length()-1; i >=0; i--) {
			 
			reverse = reverse + s.charAt(i);
			
		}
  
		System.out.println(reverse);
	
	
	//to check for palindrome
	
	if(s.equalsIgnoreCase(reverse)) {
		System.out.println("Its a Palindrome");
	} else {
	System.out.println("Its not a Palindrome");
	
	}	
 }
}