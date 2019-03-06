package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver(); //launch chrome
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete all the cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://the-internet.herokuapp.com/nested_frames"); //enter URL
		
		
		driver.switchTo().frame("frame-bottom");
		
		
		String frameContent = driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]")).getText();
		System.out.println(frameContent);
		
		driver.switchTo().defaultContent();
		
		
		
	}

}
