package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Dynamic_content {
	
	
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
	    public void DynamicContent(){
		 
	    	
	    	driver.get("http://the-internet.herokuapp.com/dynamic_content");
	    	
	    	List<WebElement> imagesList = driver.findElements(By.tagName("img"));
	    	 
	    	boolean isImagefound = false;
	    	 
	    	 for (WebElement myimageelement : imagesList) {
	    		 System.out.println( myimageelement.getAttribute("src"));
	    		if( myimageelement.getAttribute("src").contains("/img/avatars/Original-Facebook-Geek-Profile-Avatar-3.jpg"))
	    		{
	    			isImagefound = true;
				}
	    	 }
	    	 
	    	 Assert.assertTrue(isImagefound);
	    	
	    	
	    }


}
