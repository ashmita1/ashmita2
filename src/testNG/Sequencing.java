package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sequencing {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class");
	}
	@AfterClass
	public void sAfterClass() {
		System.out.println("after class");
	}
	
	
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("Before method");
	}
	
	@Test()

	public void Login() {

		System.out.println("This is the Test Case 3");

	}

		@Test()

		public void VerifyTextBox() {

			System.out.println("This is the Test Case 1");

		}

		@Test

		public void VerifyImage() {

			System.out.println("This is the Test Case 2");

		}
		
		


		

		

		

		

	}