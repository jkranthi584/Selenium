package Basics;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class Scrolling {
	

	public static void main(String[] args) {

	// Start browser

	//WebDriver driver=new FirefoxDriver();

		System.setProperty("webdriver.chrome.driver","C://Users//ccomp//Desktop//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

	// Maximize browser

	//driver.manage().window().maximize();



	// Pass application URL

	driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");



	// Create instance of Javascript executor

	JavascriptExecutor je = (JavascriptExecutor) driver;



	//Identify the WebElement which will appear after scrolling down

	WebElement element = driver.findElement(By.xpath(".//*[@id='mCSB_3_container']/p[3]"));



	// now execute query which actually will scroll until that element is not appeared on page.

	try {
		je.executeScript("arguments[0].scrollIntoView(true);",element);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}



	// Extract the text and verify

	System.out.println(element.getText());

	}

	}
	  


