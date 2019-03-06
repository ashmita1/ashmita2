package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignments3 {

	public static void main(String[] args) {
		
		try {
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

		By Link_elemnet = By.linkText("A/B Testing");

		System.setProperty("webdriver.gecko.driver", "driver_executables/geckodriver");

		// Create a new instance of the FireFox driver
		WebDriver driver = new FirefoxDriver();

		String appUrl = "http://the-internet.herokuapp.com/";
		driver.get(appUrl);

		// Click on Registration link
		driver.findElement(Link_elemnet).click();

		// Go back to Home Page
		driver.navigate().back();

		// Go forward to Registration page
		driver.navigate().forward();

		// Go back to Home page
		driver.navigate().to(appUrl);

		// Refresh browser
		driver.navigate().refresh();

		// Close browser
		driver.close();
	}

}
