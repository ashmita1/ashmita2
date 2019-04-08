package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

	public class RetryExample {
		

		@Test(retryAnalyzer = testNG.RetryAnalyzer.class)
		public void Test1()
		{
			//Assert.assertEquals(false, true);
			Assert.assertEquals(true, true);
		}

		@Test
		public void Test2()
		{
			Assert.assertEquals(false, true);
		}
	}


