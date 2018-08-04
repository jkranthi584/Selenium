package Basics;


import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DeleteCookies {
	
	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");	
        FirefoxProfile prod = new FirefoxProfile();
        prod.setAcceptUntrustedCertificates(false);
		WebDriver driver = new FirefoxDriver(prod);
		driver.get("https://www.google.com");
		//driver.manage().deleteAllCookies();
		//driver.manage().window().maximize();
		//driver.manage().window().setSize(new Dimension(1920, 1080));
	Set<Cookie>abc = driver.manage().getCookies();
	System.out.println(abc.size());
	driver.manage().deleteAllCookies();
  Set<Cookie> obj  =driver.manage().getCookies();
  System.out.println(obj.size());
  
      driver.close();
	               
	}

}