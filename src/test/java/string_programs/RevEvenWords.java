package string_programs;

public class RevEvenWords {

	public static void main(String[] args) {

		String s = "try to reverse it";
		

		String[] str = s.split(" ");

		//String rem = "";
	     
         
		for (int i = 0; i < str.length; i++) {
			
			if(i%2 == 1) {
					
					char[] ch = str[i].toCharArray();
					for (int j = 0; j < ch.length; j++) {
						System.out.print(ch[ch.length-1-j]);
					}
					System.out.print(" ");
				}else {
				System.out.print(str[i]+ " ");
			}
			
		}
	
	}

}
