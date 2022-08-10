package selenium_pratice;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.genericutility.BaseClass;

@Listeners(com.crm.genericutility.ListernerImplementationClass.class)
public class ExtentReportTest extends BaseClass {

   @Test
   public void testSuccess() {
	   
	   System.out.println("Test script success");
	   
   }
   
   
   @Test
   public void testFailure() {
	   
	   System.out.println("Failed script!!!");
	   Assert.fail();
   }
   
   @Test
   public void testSkipped() {
	   
	   System.out.println("Script skipped");
	   throw new SkipException("skipped");
	   
   }
   
}
