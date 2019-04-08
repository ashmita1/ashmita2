package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindAllLinks {
	
	public static void main(String[] args) {
		

			WebDriver driver = new FirefoxDriver();

			driver.get("http://the-internet.herokuapp.com/");

			List<WebElement> links = driver.findElements(By.tagName("a"));

			System.out.println(links.size());

			for (int i = 0; i<=links.size(); i++)

			{

				System.out.println(links.get(i).getText());

			}

		}

	

}
