package Basics;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class Trial {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		System.out.println("Before the execution of the automation");
	
		driver.get("https://www.aa.com/");
		Thread.sleep(3000L);
		//driver.findElement(By.xpath(".//*[@id='hp-widget__depart']")).click();
		//aa. aa code works but makemytrip didnt
		
		driver.findElement(By.xpath(".//*[@id='bookingModule']/div[3]/div[1]/div[2]/label/button/span")).click();
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[5]/td[3]/a")).click();
		Thread.sleep(4000L);
		//driver.findElement(By.xpath(".//*[@id='bookingModule']/div[3]/div[2]/div[2]/label/button/span")).click();
		driver.findElement(By.cssSelector("#aa-returningFrom")).click();
		driver.findElement(By.xpath("((.//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[4]/td[4]/a")).click();
		
		Select s = new Select(driver.findElement(By.xpath(".//*[@id='flightSearchForm.adultPassengerCount']")));
		
		s.selectByIndex(5);
		//driver.findElement(By.xpath("html/body/div/div[2]/div[2]/div/div/div[2]/input")).click();
		//driver.findElement(By.xpath(".//*[@id='dp1500196721519']/div/div[1]/table/tbody/tr[5]/td[6]/a")).click();
		//driver.findElement(By.xpath(".//*[@id='hp-widget__paxCounter']")).click();
		//driver.findElement(By.xpath(".//*[@id='js-adult_counter']/li[6]")).click();
	}

}
