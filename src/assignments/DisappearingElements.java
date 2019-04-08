package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DisappearingElements {
	
	private WebDriver driver;
	
	 @BeforeTest
	    public void setupSelenium(){
	        driver = new FirefoxDriver();
	    }
	    
	    @AfterTest
	    public void closeSelenium(){
	        driver.quit();
	    }
	
	
	 @Test
	    public void DisappearingElementsTest(){
	    	driver.get("http://the-internet.herokuapp.com/disappearing_elements");
	    	if(driver.findElement(By.linkText("Gallery")).isDisplayed()){
	    		driver.findElement(By.linkText("Gallery")).click();
	    	}
	    }

}
