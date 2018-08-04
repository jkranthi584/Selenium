package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calender {
	public static void main(String[] args) throws InterruptedException {
  System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
 
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.makemytrip.com");

   // driver.findElement(By.xpath(".//*[@id='hp-widget__depart']")).click();

    
    
	//driver.findElement(By.xpath(".//*[@id='dp1500140515786']/div/div[1]/table/tbody/tr[5]/td[3]/span")).click();
	//driver.findElement(By.xpath(".//td[@fare-date='1501007400000']")).click();
	//driver.findElement(By.cssSelector(".ui-state-default.ui-state-hover")).click();
	
	//driver.findElement(By.xpath(".//*[@id='dp1500140515786']/div/div[2]/table/tbody/tr[1]/td[5]/a")).click();
	
	driver.findElement(By.xpath("html/body/div/div[2]/div[2]/div/div/div[2]/input")).click();
	Thread.sleep(4000L);
	driver.findElement(By.xpath(".//*[@id='dp1500196721519']/div/div[1]/table/tbody/tr[5]/td[6]/a")).click();
	/*int i = 0;
	while(i<5){
		driver.findElement(By.xpath(".//*[@id='js-adult_counter']/li[5]")).click();
		i++;
		
	}*/
	
	}

}
