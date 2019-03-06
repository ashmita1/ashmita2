package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FileUploadPopUp {

	public static void main(String args[]) {

		WebDriver driver = new FirefoxDriver();
		Select optionsSelect = new Select(driver.findElement(By.id("drop_down")));
		List<WebElement> elementCount = optionsSelect.getOptions();
		int iSize = elementCount.size();
		for (int i = 0; i < iSize; i++) {
			String sValue = elementCount.get(i).getText();
			if (sValue.equals("Example")) {
				System.out.println("Validation Passed");
			}
		}

	}

}
