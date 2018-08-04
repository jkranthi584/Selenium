package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableAgain {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
	
	WebElement table = driver.findElement(By.xpath("//*[@id='innings_2']/div[1]"));
	int sum=0;
	       int col=   table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
            
	       for(int i=0; i<col-2; i++){
	    	String value =   table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
	          int crap = Integer.parseInt(value);
	          //sum=sum+crap;
	          sum+=crap;
	       
	       }
	       
	       String extras = driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
                   int intextras=   Integer.parseInt(extras);
                 int total =  sum+intextras;
            String expText=     driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();

                  int actualValue =    Integer.parseInt(expText);
                  
                  if(actualValue==total)
                	  System.out.println("count Matched");
                  else
                	  System.out.println("count misMatched");
                  
}
}
