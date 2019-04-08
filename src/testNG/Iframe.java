package testNG;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Iframe {

	private WebDriver driver ;

	@BeforeMethod(alwaysRun=true)
	public void setupSelenium() {
		driver = new ChromeDriver();
	}

	@AfterMethod(alwaysRun=true)
	public void closeSelenium() {
		driver.quit();
	}

	@Test (groups = { "iframe" })
	@Parameters({ "text"})
	public void iframe(String text) throws InterruptedException {
		
		driver.get("http://the-internet.herokuapp.com/iframe");

		// System.out.println(driver.switchTo().frame(0).findElement(By.xpath("//body[@id='tinymce']/p")).getText());

		WebElement frame = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(frame);
		WebElement element = driver.findElement(By.tagName("body"));
		element.clear();
		element.sendKeys(text);
		
		ArrayList<String> Exepcted = new ArrayList<>();
		ArrayList<String> Actual = new ArrayList<>();

		
		//boolean validate = element.getText().equalsIgnoreCase("a");
		Assert.assertEquals(Actual, Exepcted);
		

		// driver.switchTo().frame(0).findElement(By.xpath("//body[@id='tinymce']/p")).sendKeys("ddd");
		// driver.switchTo().frame(0).findElement(By.xpath("//body[@id='tinymce']/p")).sendKeys("ddd");
	}

}
