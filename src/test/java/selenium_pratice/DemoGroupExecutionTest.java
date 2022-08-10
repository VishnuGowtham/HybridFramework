package selenium_pratice;

import org.testng.annotations.Test;

public class DemoGroupExecutionTest {
	
	@Test(groups = "smokeTest")
	public void createDemoContact() {
		System.out.println("contact created sucessfully");
	}
	
	@Test(groups = "regressionTest")
	public void createContactwithOrg() {
		System.out.println("contact created with org sucessfully");
	}

}
