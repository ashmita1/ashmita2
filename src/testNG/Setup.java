package testNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Setup {
	
	
	@BeforeTest

	public void beforeTest() {

		System.out.println("Before All Tests ");

	}

	@AfterTest

	public void afterTest() {

		System.out.println("After All Tests");

	}

}
