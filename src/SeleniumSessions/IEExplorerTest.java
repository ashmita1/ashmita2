package SeleniumSessions;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IEExplorerTest {
	
	public static void main(String[] args) {
		 // Path to the folder where you have extracted the IEDriverServer executable
		 //System.setProperty("webdriver.ie.driver", service);

		 // Create the DesiredCapability object of InternetExplorer
		 DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();

		 // Settings to Accept the SSL Certificate in the Capability object
		 capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		 EdgeDriver driver = new EdgeDriver(capabilities);
		 driver.get("URL for which certificate error is coming");

	}

}
