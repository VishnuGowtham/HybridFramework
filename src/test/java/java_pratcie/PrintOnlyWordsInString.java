package java_pratcie;

public class PrintOnlyWordsInString {

	public static void main(String[] args) {
		

		String s = "ABCD1EFG2HIJKL3MNOP4QRST5UVW6XYZ";
		
        int b =0, a;
        
        for (int i = 0; i < s.length(); i++) {
			
        	if (s.charAt(i)>=48 && s.charAt(i)<=57) {
        		a = i;
        		System.out.println(s.substring(b , a));
        		b = a+1;
			}
		}
        if (!(s.charAt(s.length()-1)>=48 && s.charAt(s.length()-1)<=57)) {
            System.out.println(s.substring(b,s.length()));
		}

	}

}
