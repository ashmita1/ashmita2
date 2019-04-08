package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragAndDrop {
	
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
    public void DragandDrop() throws InterruptedException{
		
    	driver.get("http://the-internet.herokuapp.com/drag_and_drop");
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.manage().window().maximize();
    	
    	Actions a = new Actions(driver);
    	a.dragAndDropBy(driver.findElement(By.id("column-a")), 648, 160).build().perform();
    
  	 

        Assert.assertEquals(driver.findElement(By.id("column-a")).findElement(By.tagName("header")).getText(), "B");
        Assert.assertEquals(driver.findElement(By.id("column-b")).findElement(By.tagName("header")).getText(), "A");
    	
    	
    }


}
