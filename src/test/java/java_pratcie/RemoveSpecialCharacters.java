package java_pratcie;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {

		String str = "V@#is*&h!n$u&%";
		
		for (int i = 0; i < str.length(); i++) {
			
			if (str.charAt(i)>= 'A' && str.charAt(i)<= 'Z' ||
					str.charAt(i)>= 'a' && str.charAt(i) <= 'z') {
			
				System.out.print(str.charAt(i) + "");
				
			}
			
		}
	}

}
