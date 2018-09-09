package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option= new ChromeOptions();
		 DesiredCapabilities cap = new DesiredCapabilities();
		 option.addArguments("disable-infobars");
		 cap.setAcceptInsecureCerts(true);
		 
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		WebDriver driver = new ChromeDriver(option);
		 driver.get("https://www.timeanddate.com/worldclock/");
		 WebElement table =  driver.findElement(By.tagName("table"));
		   List<WebElement> trs = table.findElements(By.tagName("tr"));
		   System.out.println("---------------------------------------------------");
		   for(int i=0; i<trs.size(); i++) {
			  
			  List<WebElement> tds = trs.get(i).findElements(By.tagName("td"));
			  for(int j=0; j<tds.size(); j++) {
				 System.out.print(tds.get(j).getText());
				 
				 
			  }
			  System.out.println("\n__________________________________________________");
			     if(i==5)
			    	 break;
		   }
		  
	}
}
