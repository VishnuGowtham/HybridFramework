package java_pratcie;

import java.util.Iterator;

public class MergingTwoArray {

	public static void main(String[] args) {

		int[] a = { 9, 7, 5,5,7,9,
				+3, 6 };
		int[] b = { 1, 2, 4 };

		int[] c = new int[a.length + b.length];
		
		int i=0,j=0,k=0;
		while(k<c.length) {
			if(i<a.length) {
				c[k++]=a[i++];
			}
			else {
				c[k++]=b[j++];
			}
		}
		//9,7,5,3,6,1,2,4
		for (int m = 0; m < c.length; m++) {
			for (int n = m+1; n < c.length; n++) {
				if(c[m]>c[n]) {//9>7
					int temp=c[m];//9
					c[m]=c[n];//7
					c[n]=temp;//9
				}
			}
		}
		
		for (int z : c) {
			System.out.print(z+" ");
		}
	}

}
