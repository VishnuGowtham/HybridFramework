package java_pratcie;

public class ReverseNum {

	public static void main(String[] args) {
		
//		int num = 123;
//		int rev=0;
//		int rem=0;
//		while (num!=0) {
//			rem = num%10;
//			rev=rev*10+rem;
//			num = num/10;
//			
//		}	
//		System.out.print(rev);
		
		
		String s = "vinay";
		char[] ch = s.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			
			 System.out.print(ch[ch.length-1-i]); //0	1	
		 }
		
		
	}
}
