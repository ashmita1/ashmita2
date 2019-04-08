package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverConcept {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/naveenkhunteta/Downloads/chromedriver");	
		
		//WebDriver driver = new ChromeDriver(); //launch chrome
		
		//htmlunitdriver is not available in Selenium 3.x version.
		//htmlunitdriver -- to use this concept, we have to download htmlunitdriver JAR file.
		
		//advantages:
		//1. testing is happening behind the scene -- no browser is launched
		//2. Very fast -- execution of test cases -- very fast -- performance of the script
		//3. not suitable for Actions class -- user actions -- mousemovement, doubleClick, drag and drop
		//4. Ghost Driver -- HeadLess Browser: 
			//--HtmlUnit Driver -- JAva
			//--PhantomJS -- JavaScript
		
		
		HtmlUnitDriver driver = new HtmlUnitDriver();
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete all the cookies
		driver.setJavascriptEnabled(true);
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://the-internet.herokuapp.com/checkboxes");
		//driver.findElement(By.xpath("//input[@type='checkbox'][1]//following-sibling::text()[1]"));
		
		List<WebElement> e = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for (WebElement webElement : e) {
			if(webElement.isSelected()) {
				JavascriptExecutor js = ((JavascriptExecutor) driver);
			    String Checkboxname = (String)js.executeScript("return arguments[0].nextSibling.textContent;", webElement);
			    System.out.println(Checkboxname +"Checkbox name");
			}
		}
		driver.close();		
		
		
	}

}
