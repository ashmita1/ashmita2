package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollUpAndDown {
	
	public static void main(String[] args) throws InterruptedException {

		 WebDriver driver = new FirefoxDriver();

		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		 driver.get("http://the-internet.herokuapp.com/infinite_scroll");

		 driver.manage().window().maximize();
		 
		 Thread.sleep(5000);

		 JavascriptExecutor jsx = (JavascriptExecutor)driver;

		 jsx.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 Thread.sleep(5000);

		 jsx.executeScript("window.scrollTo(document.body.scrollHeight,0)");//
		 
//		 JavascriptExecutor jse = (JavascriptExecutor)driver;
//	        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//	        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		 driver.close();
	}

}
