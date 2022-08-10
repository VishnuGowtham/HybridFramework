package java_pratcie;

public class SecondMaxInArray {

	public static void main(String[] args) {

		int a[] = { 3, 9, 4, 1, 5, 8, 6, 8 , 9 };

		int greatest = a[0] , second = a[0]; //3
		
		
		
		for (int i = 0; i < a.length; i++) {

				if (a[i] > greatest) { // 3 > 3

					second = greatest;
					greatest = a[i];
					
				} else if(a[i] > second && a[i]!=greatest) { // 3>3
					
					second = a[i];
			}
			
		}
		
		System.out.println(second);
		System.out.println(greatest);

	}

}
