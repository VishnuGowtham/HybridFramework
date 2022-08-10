package selenium_pratice;

import org.testng.annotations.Test;

public class PriorityTestng {

	@Test
	public void m1() {
		System.out.println("m1 method running");
	}
	
	@Test
	public void m2() {
		System.out.println("m2 method running");
	}
	
	@Test(priority = 0)
	public void m3() {
		System.out.println("m3 method running");	
	}
	
	@Test
	public void m4() {
		System.out.println("m4 method running");
	}
	
	
}
