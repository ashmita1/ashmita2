package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dynamic_Loading {
	
	
	private WebDriver driver;
	
	 @BeforeTest
	    public void setupSelenium(){
	        driver = new ChromeDriver();
	    }
	    
	    @AfterTest
	    public void closeSelenium(){
	        driver.quit();
	    }
	
	
	@Test(enabled=false)
    public void DynamicallyLoadedPageElements1(){
    	
    	driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");
    	                                                    
    	driver.findElement(By.xpath("//div[@id='start']/button")).click();
    	
    	WebDriverWait wait = new WebDriverWait(driver, 30);
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='finish']/H4"))); 
    	WebElement e = driver.findElement(By.xpath("//div[@id='finish']/H4"));

    	Assert.assertEquals(e.getText(), "Hello World!");
    	                                                   
    }                 

}
