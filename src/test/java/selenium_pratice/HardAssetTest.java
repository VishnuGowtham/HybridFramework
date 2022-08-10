package selenium_pratice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssetTest {

	@Test
	public void hardAssert() {
		
		byte i = 15;
		byte j = 15;
		
		short k = 100;
		short l = 200;
		
		long g = 965673253;
		long w = 758390239;
		
		String vjay = "Hello";
		String velan = "Hello";
		
		boolean flag = true;
		boolean flag2 = true;
		
		Assert.assertEquals(k, l);
		Assert.assertEquals(vjay, velan);
		//Assert.assertEquals(flag, flag2);
//		Assert.assertEquals(vjay, velan);
		
		//Assert.assertTrue(velan.contains(vjay));
		
		
	}	
}
