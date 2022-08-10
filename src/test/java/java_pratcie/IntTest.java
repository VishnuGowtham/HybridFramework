package java_pratcie;

import java.util.Scanner;

public class IntTest {

	public static void main(String[] args) {
	/*	String s = "rajeshh";
		
		for (int i = 0; i <s.length(); i++) {
			
			int count = 1;
			for (int j = 0; j < s.length(); j++) {
				
				if (s.charAt(i)==s.charAt(j)) {
					count++;	
				}
			}
			
			if(count==1)
			System.out.println(s.charAt(i) + " no of count is " + count );*/
		
			System.out.println("enter the array");
			Scanner sc = new Scanner(System.in);
			int[] a=new int[5];
			for (int i = 0; i < a.length; i++) {
				a[i]=sc.nextInt();
			}
			for (int j = 0; j < a.length; j++) {
				System.out.println(a[j]);
			}

	}
}
