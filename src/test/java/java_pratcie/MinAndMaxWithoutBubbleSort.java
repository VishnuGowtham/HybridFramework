package java_pratcie;


public class MinAndMaxWithoutBubbleSort {

	public static void main(String[] args) {

		int[] a = { 1, 7, 3, 5, 9 };

		int fmax = a[0];//fmin

		for (int i = 0; i < a.length; i++)
			                    //(int i = 0; i < a.length; i++)
		{
			if (a[i] > fmax) //for "fmin" change : a[i] < fmin
			{ 
				fmax = a[i];
			}
		}
		System.out.println(fmax);//fmin
		
	
	}

}
