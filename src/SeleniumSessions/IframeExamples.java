package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IframeExamples {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.com/iframe-practice-page/");

		//By executing a java script
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		Integer numberOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
		System.out.println("Number of iframes on the page are " + numberOfFrames);

		//By finding all the web elements using iframe tag
		List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
		System.out.println("The total number of iframes are " + iframeElements.size());
		
		//Frame by name :
			
		
//		driver.get("http://toolsqa.com/iframe-practice-page/");
//
//		//Switch by frame name
//		driver.switchTo().frame("iframe1");
//		driver.quit();
//			
//		
//		// Frame by ID
//		
//		driver.get("http://toolsqa.com/iframe-practice-page/");
//
//		//Switch by frame webelement / xpath
//		
//		driver.switchTo().frame("IF1");
//		driver.quit();
//		
//		//Switching back to main frame 
		
		//driver.get("http://toolsqa.com/iframe-practice-page/");
		//First find the element using any of locator stratedgy
		WebElement iframeElement = driver.findElement(By.id("IF1"));

		//now use the switch command
		driver.switchTo().frame(iframeElement);

		//Do all the required tasks in the frame 0
		//Switch back to the main window
		driver.switchTo().defaultContent();
		driver.quit();
	}

}
