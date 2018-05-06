import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
public class SauceLabsDemo {

	//https://wiki.saucelabs.com/display/DOCS/Example+Selenium+Scripts+for+Automated+Website+Tests
		//https://wiki.saucelabs.com/display/DOCS/Java+Test+Setup+Example

		public static final String USERNAME = "shashims1993";
		public static final String ACCESS_KEY = "7c4c5e42-06f4-4d67-a3e2-406112da7e67";
		public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

		public static void main(String[] args) throws Exception {

			DesiredCapabilities caps = DesiredCapabilities.firefox();
			/*caps.setCapability("platform", "Windows 2003'");
			caps.setCapability("version", "43.0");*/
			caps.setCapability("platform", "Windows 10");
		    caps.setCapability("version", "latest");
		  /*  caps.setCapability("platform", "ANY");
		    caps.setCapability("version", "latest");*/

			WebDriver driver = new RemoteWebDriver(new URL(URL), caps);

			driver.get("https://letskodeit.teachable.com/p/practice");
			
			System.out.println("title of page is: " + driver.getTitle());
			Thread.sleep(3000);
			driver.findElement(By.partialLinkText("Sign Up")).click();

			Thread.sleep(3000);

			driver.quit();
		}
}
