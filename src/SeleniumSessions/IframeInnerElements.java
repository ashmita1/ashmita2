package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IframeInnerElements {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		// Step 1: Navigate to the page with multiple iframes
		driver.get("http://toolsqa.com/iframe-practice-page/");

		// Step 2: Switch to first frame and then find First Name and Last name
		// element
		Thread.sleep(5000);
		/* Switch to the first frame, remember frame index starts from 0 */
		driver.switchTo().frame(0);
	
		
		Thread.sleep(5000);


		/* now find the First name field */
		WebElement firstName = driver.findElement(By
				.xpath("//input[@name='firstname']"));

		/* now find the Last name field */
		WebElement lastName = driver.findElement(By
				.xpath("//input[@name='lastname']"));

		// Step 3: Fill some value in the first name and last name files
		firstName.sendKeys("Virender");
		lastName.sendKeys("Singh");

		// Step 4: Switching to the 2nd frame, frame index 1
		driver.switchTo().defaultContent();
		
		Thread.sleep(5000);
//		driver.switchTo().frame(1);
//
//		//Step 5: Find image element and click on that
//		WebElement imageElement = driver.findElement(By
//				.xpath("//*[@id='post-9']/div/div[1]/div/p[1]/a/img"));
//
//		imageElement.click();
//		System.out.println("Switching successfull");
		System.out.println(driver.findElement(By.xpath("//p[contains(text(),'Iframe 1 and 2')]")).getText());
		driver.close();
	}
	

}
