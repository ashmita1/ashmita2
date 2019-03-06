package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplicitWaitConcept {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "/Users/bvennapureddy/Desktop/TRAINING/chromedriver");
		//To create a new instance of Firefox Driver
		WebDriver driver = new ChromeDriver();
		//To open a website "Software Testing Material"
		driver.get("http://www.SoftwareTestingmaterial.com");
		//To maximize the browser window
		driver.manage().window().maximize();
		//This waits up to 15 seconds before throwing a TimeoutException or if it finds the element will return it in 0 - 15 seconds
		WebDriverWait wait = new WebDriverWait (driver, 15);
		//Title of the webpage is "Software Testing Material - A site for Software Testers"
		wait.until(ExpectedConditions.titleIs("Software Testing Material"));
		//If the above condition met then the browser will be closed
		//To close the browser
		driver.close();
		//Change the title "Software Testing Material - A site for Software Testers" as "xyz" in the script and try
		//You will face an execption - Exception in thread "main" org.openqa.selenium.TimeoutException: Timed out after 20 seconds waiting for title to be "Software Testing Material - A site for Software Tes". Current title: "xyz"
		
	}
	
	
	
//	public static void clickOn(WebDriver driver, WebElement locator, int timeout) {
//		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
//		locator.click();
//	}

}
