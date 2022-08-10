package selenium_pratice;

import org.testng.annotations.Test;

public class DemoTestNG {

	@Test(priority = -4)
	
	public void vidhya() {
		System.out.println("GOod Mornnn");
		
	
	}
	
	@Test(priority = -3)
	
	public void mdazar() {
		System.out.println("Good Afternoon");
	}
	
	@Test(priority = -5)
	
	public void sibi() {
		System.out.println("Good Night");
	}
}
