package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProviderTest {

	private static WebDriver driver;

	
	@Parameters("browser")
	@BeforeMethod
	public void beforeMethod(@Optional("firefox") String browser) {
		if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void afterMethod() {
		// Close the driver
		driver.close();
	}

  // Here we are calling the Data Provider object with its Name

  @Test(dataProvider="SearchProvider", dataProviderClass=DataProviderClass.class,groups= {"A"})
  public void testMethod(String test,String searchKey) throws InterruptedException{
	  driver.get("https://google.com");
      WebElement searchText = driver.findElement(By.name("q"));
      //search value in google searchbox
      searchText.sendKeys(searchKey);
      System.out.println("Welcome ->"+"Bheem"+" Your search key is->"+searchKey);
      Thread.sleep(3000);
      String testValue = searchText.getAttribute("value");
      System.out.println(testValue +"::::"+searchKey);
      searchText.clear();
      //Verify if the value in google search box is correct
 
  }
  
  @Test(dataProvider="SearchProvider", dataProviderClass=DataProviderClass.class,groups= {"A"})
  public void testMethodA(String test,String searchKey) throws InterruptedException{
	  driver.get("https://google.com");
      WebElement searchText = driver.findElement(By.name("q"));
      //search value in google searchbox
      searchText.sendKeys(searchKey);
      System.out.println("Welcome ->"+"Bheem"+" Your search key is->"+searchKey);
      Thread.sleep(3000);
      String testValue = searchText.getAttribute("value");
      System.out.println(testValue +"::::"+searchKey);
      searchText.clear();
      //Verify if the value in google search box is correct
 
  }
  
  
  @Test(dataProvider="SearchProvider", dataProviderClass=DataProviderClass.class)
  public void testMethodA(String searchKey) throws InterruptedException{
  {
	  driver.get("https://google.com");
      WebElement searchText = driver.findElement(By.name("q"));
      //search value in google searchbox
      searchText.sendKeys(searchKey);
      System.out.println("Welcome ->"+"Bheem"+" Your search key is->"+searchKey);
      Thread.sleep(3000);
      String testValue = searchText.getAttribute("value");
      System.out.println(testValue +"::::"+searchKey);
      searchText.clear();
      //Verify if the value in google search box is correct
 
  }
  }
  

  

}