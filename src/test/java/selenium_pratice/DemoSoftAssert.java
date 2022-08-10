package selenium_pratice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoSoftAssert {
	
	@Test
	
	public void softAssert() {
	
		String dog = "Bow  bow";
		String cat = "Meow Meow";
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(dog, cat);
		sa.assertAll();
	}

}
