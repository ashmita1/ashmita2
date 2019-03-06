package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicWebTableHandle {

	
		public static void main(String[] args) {
			WebDriver driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://the-internet.herokuapp.com/tables");
			
			//Here we are storing the value from the cell in to the string variable
			String sCellValue = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[2]")).getText();
			System.out.println(sCellValue);
			
			// Here we are clicking on the link of first row and the last column
			driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[6]/a")).click();        
			System.out.println("Link has been clicked otherwise an exception would have thrown");
			driver.close();
		}

}
