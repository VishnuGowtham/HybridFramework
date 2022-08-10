package java_pratcie;

public class GlobalAndLocalVariable {

	int x = 10;
	static int y = 20;

	public void test() {

		/* creating object by calling non static variable */
		GlobalAndLocalVariable gl = new GlobalAndLocalVariable();
		System.out.println("Using Obj referance " + gl.x);

		/* calling non static variable using "this" keyword */
		System.out.println("Using this keyword " + this.x);

		/* calling non static variable directly */
		System.out.println("Directly using inside NS method " + x);

		System.out.println("===========================");

		/* calling static variable inside non static method with "this" keyword */
		System.out.println("calling SV using this keyword "
				+ "inside NS method "+this.y);

		/* calling static variable inside non static method using "ClassName" */
		System.out.println("calling SV using ClassName "
				+ "inside NS method "+ GlobalAndLocalVariable.y);

		/* calling static variable directly inside non static method */
		System.out.println("calling SV directly inside the NS method "+y);
		
		System.out.println("============================");
	}

	public static void testOne() {

		/* calling static variable directly inside static method */
		System.out.println("static variable calling directly "
				+ "inside static method "+y);
		
		/* calling static variable inside static method using "ClassName" */
		System.out.println("Calling SV using ClassName "
				+ "inside Static method " +GlobalAndLocalVariable.y);
		
		//System.out.println(this.y);
		//System.out.println(x); calling non static variable inside Static method
		//System.out.println(this.x);

		
		System.out.println("============================");
		

	}

	public static void main(String[] args) {

		GlobalAndLocalVariable gnl = new GlobalAndLocalVariable();
		gnl.test();
		
		/*Calling testOne static method */
		GlobalAndLocalVariable.testOne();

	}

}
