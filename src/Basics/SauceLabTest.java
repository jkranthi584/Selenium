package Basics;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SauceLabTest {
	@BeforeTest
	public void setup() throws MalformedURLException{
		
		DesiredCapabilities decap = DesiredCapabilities.firefox();
		decap.setCapability("version", "5");
		decap.setCapability("platform", "XP");
		WebDriver driver = new RemoteWebDriver(new URL
//saucelabaccesskey src	
				("http:www.saucelab.com:accesskey."),decap);
		
		driver.get("https://www.google.com");
		
		System.out.println(driver.getTitle());
		
		
	}

}
