package java_pratcie;

import java.util.Scanner;

public class PalindromeWithNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the num");
		   int num = in.nextInt();
		   int temp = num,r,sum = 0; 
		   while(num>0) {
			      
			   r = num%10;
			   sum = (sum*10) + r;
			   num = num/10;
			   
		   }
		
		if (sum==temp) {
			System.out.println("It is a Palindrome");
		}else {
			System.out.println("It is not a palindrome");
		}
		
		
	}

}
