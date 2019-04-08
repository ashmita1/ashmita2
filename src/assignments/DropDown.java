package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DropDown {
	
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
    public void Dropdown(){
    	driver.get("http://the-internet.herokuapp.com/dropdown");
    	Select dropdown = new Select(driver.findElement(By.id("dropdown")));
    	dropdown.selectByVisibleText("Option 2");
    	
    }
    

}
