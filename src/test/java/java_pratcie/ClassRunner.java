package java_pratcie;

public class ClassRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ClassC obj = new ClassC(); obj.test(); obj.demo();
		 * 
		 * ClassB obj1 = obj; //up casting obj1.test(); //test() method is overrided
		 * obj1.run();
		 * 
		 * ClassA obj2 = obj1;//up casting obj2.test(); // test() method is overrided
		 * System.out.println("=============================");
		 * 
		 * ClassB obj3 =(ClassB)obj2; obj3.run(); obj3.test();
		 */
		
		ClassB obj = new ClassB();
		
		ClassA obj2 = obj;
		obj2.test();
		
	}

}
