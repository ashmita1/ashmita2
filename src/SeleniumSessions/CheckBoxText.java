package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxText {
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
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
