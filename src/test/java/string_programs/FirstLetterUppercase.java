package string_programs;

public class FirstLetterUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "sangeeta neminath patil";
	
		String[] str = s.split(" ");
	
		String s1 = "";

		for (String string : str) {
			for (int i = 0; i < string.length(); i++) {
				
				if(string.indexOf(string.charAt(i) , i) == (string.indexOf(string.charAt(0) , 0)))
				{
					s1 = s1 + string.toUpperCase().charAt(i);
					
				}else if (string.charAt(i)>0) {
					s1 = s1 + string.toLowerCase().charAt(i);					
				}else 
					
			       break;   
			}

		s1= s1 + " ";
		}
		System.out.println(s1);
	}

}
