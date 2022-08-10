package java_pratcie;

import java_pratcie.OuterClass.InnerClass;

public class OuterClass {
	
	int x = 10;
	public class InnerClass{
		int y = 5;
		
	}
}
   class Test{
	
	public static void main(String[] args) {
		
		OuterClass outer = new OuterClass();

	    InnerClass inner = outer.new InnerClass();
		System.out.print(inner.y + outer.x);
		
	}
}