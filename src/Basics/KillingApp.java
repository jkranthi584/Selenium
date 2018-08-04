package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.os.WindowsUtils;

public class KillingApp {
	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
	//WebDriver	driver = new FirefoxDriver();
		WindowsUtils.killByName("notepad.exe");
		
	}
}
