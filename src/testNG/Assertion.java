package testNG;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {

	final static Logger logger = Logger.getLogger(Assertion.class);

	
	@Test
	public void softAssert(){
		logger.info("Test Started");
		Reporter.log("");
		SoftAssert softAssertion= new SoftAssert();
		softAssertion.assertTrue(false,"Assert failed for first");
		System.out.println("softAssert Method Was Executed");
		softAssertion.assertTrue(false,"Assert passed for last");
		System.out.println("softAssert Method Was Executed for latest Assert");
		softAssertion.assertAll();
		
		try {
			
		}catch (Exception e) {
			logger.error(e.getMessage());
		}
	}
	
//	@Test
//	public void hardAssert(){
//		System.out.println("hardAssert Method Was Started");
//		Assert.assertTrue(false,"Asseting elemnt text check name");
//		System.out.println("hardAssert Method Was Executed");
//	}
	
	
}