package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class browserinvocation {
	public static void main(String[] args) {
		
		//firefoxdriver is a class and we  are executing methods that are
		//present in the webdriver interface.
		//geckodriver has the capability to invoke browser in ur local mchine
		System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://rabb.it/");//get metthod called to hit url
	//this below get method will get the title
     System.out.println(driver.getTitle());
     System.out.println(driver.getPageSource());
     System.out.println(driver.getCurrentUrl());
    driver.close();
	
	
	
		
	}

}
