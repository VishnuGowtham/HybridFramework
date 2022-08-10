package selenium_pratice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryImpClass {

	@Test(retryAnalyzer = com.crm.genericutility.RetryAnalayzerImplemetation.class)
	
	public void create() {
		System.out.println("retry");
		Assert.assertEquals(false, true);
	}
	
}
