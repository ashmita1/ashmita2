package testNG;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Listeners(com.excel.utility.Listeners.class)
public class CheckBoxtesNGTest {

	public WebDriver driver;

	final static Logger logger = Logger.getLogger(CheckBoxtesNGTest.class);

//	@Test(groups = { "checkbox" })
//	public void checkbox() {
//		driver.get("http://the-internet.herokuapp.com/checkboxes");
//		// driver.findElement(By.xpath("//input[@type='checkbox'][1]//following-sibling::text()[1]"));
//		List<WebElement> e = driver.findElements(By.xpath("//input[@type='checkbox']"));
//		for (WebElement webElement : e) {
//			if (webElement.isSelected()) {
//				JavascriptExecutor js = ((JavascriptExecutor) driver);
//				String Checkboxname = (String) js.executeScript("return arguments[0].nextSibling.textContent;",
//						webElement);
//				System.out.println(Checkboxname + "Checkbox name");
//			}
//		}
//
//	}

	// @Test(groups = { "disappear" })
	// public void DisappearingElementsTest() {
	// driver.get("http://the-internet.herokuapp.com/disappearing_elements");
	// if (driver.findElement(By.linkText("Gallery")).isDisplayed()) {
	// driver.findElement(By.linkText("Gallery")).click();
	// }
	// }
	//
	@Test(groups = { "iframe" })
	@Parameters({ "text" })
	public void iframe(@Optional("Validate text") String text) throws InterruptedException {
		try {
			driver.get("http://the-internet.herokuapp.com/iframe");
			WebElement frame = driver.findElement(By.tagName("iframe"));
			driver.switchTo().frame(frame);
			WebElement element = driver.findElement(By.tagName("body"));
			element.clear();
			element.sendKeys(text);
			if (element.getText().toString().equalsIgnoreCase(text)) {
				Reporter.log("Actual Text" + text + " is equal to expected text" + element.getText());
				Assert.assertEquals(false, true);
			}
		} catch (Exception e) {
			logger.error("Exception occured" + e.getMessage());
		}
	}

	@Parameters("browser")
	@BeforeMethod
	public void beforeMethod(@Optional("firefox") String browser) {
		if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			logger.info("Launched Firfox browser");
		} else if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			logger.info("Launched chrome  browser");

		}
		driver.manage().window().maximize();
		logger.info("Maximixed window");

	}

	@AfterMethod
	public void afterMethod() {
		// Close the driver
		driver.close();
		logger.info("driver closed");
	}

}
