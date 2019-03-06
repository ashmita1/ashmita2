package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignments2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/bvennapureddy/Desktop/TRAINING/geckodriver");
		WebDriver driver = new FirefoxDriver();
//		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.get("http://the-internet.herokuapp.com/windows");
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		int size = driver.getWindowHandles().size();
		System.out.println(size);
		if(size>1) {
			System.out.println("Multiple windows are opended");
		}
		driver.quit();// there is an issue here
	}

}
