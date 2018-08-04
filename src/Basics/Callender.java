package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Callender {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
	
	
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.goindigo.in");

	//driver.findElement(By.xpath(".//*[@id='js-adult_counter']/li[5]")).click();
	driver.findElement(By.xpath(".//*[@id='depart-date']"));
	Thread.sleep(3000L);
	driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[4]/td[4]/a")).click();
    /*int i =0;
    while(i<5){
    	
    	
    	
    }*/
}
}
