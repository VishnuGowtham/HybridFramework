package java_pratcie;

public class Print123 {

	public static void main(String[] args) {
		
		
		int num = 3;
		int temp = num;
		int sum = 10;
		
		//op 123 112233 111222333
		
		while (num != 0) {
			if (sum == 321) {
				break;
			}
			else {
		    sum = sum + num;
		    num = num -1;
		   }
		}
		System.out.println(sum);
		System.out.println("====================================================");
//		int rev=0;
//		int rem=0;
//		while (temp!=0) {
//			rem = temp%10;
//			rev=rev*10+rem;
//			num = temp/10;
//			
//		}	
//		System.out.print(rev);
//		
		
	}
}
