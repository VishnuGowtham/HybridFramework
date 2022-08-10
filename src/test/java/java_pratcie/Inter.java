package java_pratcie;

public class Inter {

	public static void main(String[] args) {

			String s="Improvments - Cycle Reduction , Application And no of hours Reduced",s1="";
			
/*			int space=0,special=0;
			for (int i = 0; i < s.length(); i++) {
				if(s.charAt(i)==32) {
					space++;
				}
				else if(!((s.charAt(i)>=65&&s.charAt(i)<=90) || (s.charAt(i)>=97&&s.charAt(i)<=122))) {
					special++;
				}
			}
			System.out.println("space is: "+space);
			System.out.println("special is: "+special);*/
			
/*			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i)==32) {
					s1=s1+"@";
				}
				else 
					s1=s1+s.charAt(i);			
			}
			System.out.println(s1);*/
			
			char h='a' , H='A';
			for (int i = 0; i < s.length(); i++) {
				if(s.charAt(i)>=97&&s.charAt(i)<=122) {
					if(h<s.charAt(i)) {
						h=s.charAt(i);
					}
				} else if (s.charAt(i)>=65&&s.charAt(i)<=90) {
					if (H<s.charAt(i)) {
						H = s.charAt(i);
					}
				}
			}

			System.out.println(h);
			System.out.println(H);
	}
}