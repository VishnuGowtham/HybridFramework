package selenium_pratice;

import org.testng.annotations.Test;

public class DependsOnMethodsTest {

	@Test
	public void createAccount() throws Exception {
		// Added Exception to see TestScript (@Test) is skipped or not
		// depends on methods used for the "integration module"
		System.out.println("login");
		System.out.println("create Account");
		System.out.println("logout");
		throw new Exception();
	}

	@Test(dependsOnMethods = "createAccount")
	public void modifyAccount() {
		System.out.println("login");
		System.out.println("Modify Account");
		System.out.println("logout");

	}

	@Test(dependsOnMethods = "modifyAccount")
	public void deleteAccount() {
		System.out.println("login");
		System.out.println("Delete Account");
		System.out.println("logout");

	}

}
