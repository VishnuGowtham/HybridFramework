package java_pratcie;

import java.util.HashSet;

public class RepalceCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String d = "Ravikiran";

		d = d.toLowerCase();

		String str = "";

		for (int i = 0; i < d.length(); i++) {
		         int count =0;
			for (int j = i+1; j < d.length(); j++) {
				  if (d.charAt(i) == d.charAt(j)) {
					  count++;
					 if(count == 2) { 
					  str =  d.replace(d.charAt(j), 'x');
					  System.out.println();
				}  
			}
			//System.out.println();	
		}
	}
		
}
}