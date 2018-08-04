package Basics;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class chromebrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	System.setProperty("webdriver.chrome.driver","C://Users//ccomp//Desktop//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
         driver.get("https://www.yahoo.com/");*/
		  System.setProperty("webdriver.ie.driver", "C://Users//ccomp//Downloads//IEDriverServer_x64_3.4.0//IEDriverServer.exe//");
				WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.com");
		//    Webdriver  driver = new SafariDriver();
		
         
	}

	
	

}
