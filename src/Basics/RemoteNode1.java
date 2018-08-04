package Basics;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RemoteNode1 {
public static void main(String[] args) throws MalformedURLException {
	WebDriver driver;
	String nodeURL;
	String baseURL;
	DesiredCapabilities capabilities = DesiredCapabilities.firefox();
	capabilities.setCapability(FirefoxDriver.BINARY,new File("C://program Files (x86\\Mozilla firefox\\firefox.exe").getAbsolutePath());

      driver = new RemoteWebDriver(new URL("http://190.08.108:5566/wd/hub"), capabilities);
         driver.get("http://www.google.com");
         System.out.println(driver.getTitle());
}
}
   