package selenium_pratice;

import org.testng.annotations.Test;

public class GroupExecutionTest {

	@Test(groups = {"smokeTest", "regressionTest"})
	public void createDemoOrg() {
		System.out.println("Org created sucessfully");
	}
	
	@Test(groups = "regressionTest")
	public void createOrgwithInd() {
		System.out.println("Org created with Industry sucessfully");
	}
}
