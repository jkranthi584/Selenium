package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
		System.setProperty("webdriver.chrome.driver","C://Users//ccomp//Desktop//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(19, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.cssSelector("#hp-widget__depart")).click();
		//ui-datepicker-next ui-corner-all
		//WebElement store= driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']"));
           
		    //WebElement store=  driver.findElement(By.cssSelector("#dp1510763216738 > div > div.ui-datepicker-group.ui-datepicker-group-last > div > a > span"));
		     //#dp1510763216738 > div > div.ui-datepicker-group.ui-datepicker-group-last > div > a > span
		        //WebElement store= driver.findElement(By.xpath("(.//span[@class='ui-icon ui-icon-circle-triangle-e'])[1]"));   
		
		           WebElement next= driver.findElement(By.xpath("(//*[text()='Next'])[1]"));
		        		   
		       // WebElement next=   driver.findElement(By.xpath("(//*[@title='Next'])[1]"));
		     WebElement store=   driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/span"));
		                    System.out.println(store.getText());        
		while(!(store.getText().contains("May"))){
		    	 
		    	next.click();
			////*[@id="dp1511427958272"]/div/div[2]/div/a/span
		    	//driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		    }
		 // driver.findElement(By.xpath("//*[@id='dp1510763216738']/div/div[2]/div/div/span[1]")).click();
		/*int dayCount=    driver.findElements(By.className("day")).size();
		    
		  for(int i=0; i<dayCount; i++){
			  
		String text=	  driver.findElements(By.className("day")).get(i).getText();
			  
		    if(text.equalsIgnoreCase("20")){
		    	
		    	
		    	driver.findElements(By.className("day")).get(i).click();
				break;
			}
			  
		  }*/
		    
	}

}
