package java_pratcie;

public class CountNoOfDuplicateInAnArray {

	public static void main(String[] args) {

		int a[] = { 3, 4, 5, 4, 2, 4, 1, 5, 2 };

		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[i]==a[j] && i>j) {
					break;
				}else if(a[i]==a[j]) {
				   count++;	
				}
			}
			
			if(count>1) {
				System.out.println(a[i] +" no of times present in array "+ count);
			}
			
		}
		
	}
}
