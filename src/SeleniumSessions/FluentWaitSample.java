package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait; //FluentWait is a Class and it is a part of this package
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class FluentWaitSample {
	

		@Test
		public static void fluentWaitMethod(){
			System.setProperty("webdriver.gecko.driver","/Users/bvennapureddy/Desktop/TRAINING/geckodriver");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("http://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html");
			driver.findElement(By.xpath("//*[@id='post-body-5280210221385817166']/div[1]/button")).click();
			
			 Wait<WebDriver> wait = new FluentWait<>(driver)
			            .withTimeout(Duration.ofSeconds(10))
			            .pollingEvery(Duration.ofMillis(12))
			            .ignoring(WebDriverException.class);

			 

			wait.until(new Function<WebDriver, WebElement>() {
				public WebElement apply(WebDriver driver) {
					WebElement element = driver.findElement(By.xpath("//p[@id='demo']"));
					String getTextOnPage = element.getText();
					if(getTextOnPage.equals("Software Testing Material - DEMO PAGE")){
						System.out.println(getTextOnPage);
						return element;
					}else{
						System.out.println("FluentWait Failed");
						return null;
					}
				}
			});
		}
}
