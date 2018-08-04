package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sizeNDis {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https:www.google.com");
		// Below xpath is not a valid one and it will throw an error
//System.out.println(driver.findElement(By.xpath(".//*[@id='hp-widget__fakexapth']")).isDisplayed());
//unable to locate element:("method:"xpath", "selector":".//*[@id='hp-widget__fakexapth']/span")
int count = driver.findElements(By.xpath(".//*[@id='hp-widget__fakexapth']")).size();
//size will tell you whether the element is present on the page or not
if(count==0){
	System.out.println("verified");
}
		
		
	}

}
