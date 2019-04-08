package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DynamicControls {
	
	private WebDriver driver;
	
	 @BeforeTest
	    public void setupSelenium(){
	        driver = new ChromeDriver();
	    }
	    
	    @AfterTest
	    public void closeSelenium(){
	        driver.quit();
	    }
	
	
	    @Test
		public void Dynamic() {
			WebDriverWait wait = new WebDriverWait(driver, 5);
			
			driver.get("http://the-internet.herokuapp.com/dynamic_controls");
			//driver.findElement(By.cssSelector("#checkbox-example > button")).click();
			driver.findElement(By.cssSelector("#input-example > button")).click();

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form[@id='input-example']//p[@id='message']")));
			String result = driver.findElement(By.cssSelector("#message")).getText();
			Assert.assertEquals("It's enabled!", result);
			


		}
}
