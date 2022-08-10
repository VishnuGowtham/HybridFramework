package java_pratcie;

public class SwappingTwoStrings {

	public static void main(String[] args) {
		
		String s1 = "Shruthi";
		String s2 = "Ramya";
		
		s1 = s1+ s2; //12//ShruthiRamya// s1 = 12
		
		s2 = s1.substring(0, s1.length()- s2.length()); //12-5 //0,7 // Shruthi //7
		
		s1 = s1.substring(s2.length()); //5//World //7//Ramya
		
		System.out.println(s1 +" "+ s2);

		
		int x =5;
		int y = 3;
		
		x = x+y; 
		
		y = x-y;
		
		x = x - y;
		
		System.out.println("x = "+x +" "+"y = "+y);
		
		
		
		//{2, 3, 5, 1, 5}
		
		//2max = 3 
		
		
		
	}

}
