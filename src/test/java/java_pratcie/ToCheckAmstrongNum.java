package java_pratcie;

import java.util.Scanner;

public class ToCheckAmstrongNum {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = s.nextInt(),temp =num , temp2 =num;
		
		//Step1: Count no of digits in a Number
		
		int count=0;
		while(temp>0) {
			
			temp = temp/10;
			count++;
		}
		
		System.out.println("No of digits "+count);
		System.out.println(num);

		//To check Armstrong Num or not
		int sum =0;
		while(num>0) {
			
			int r = num%10;
			sum = (int) (sum + Math.pow(r, count));
			
			num = num/10;
		}
		
		if (sum == temp2) {
			System.out.println("It is a Armstrong");
		}else {
			System.out.println("It is not a Armstrong");
		}
		
		
	}
}
