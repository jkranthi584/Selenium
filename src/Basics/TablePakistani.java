package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablePakistani {
	
	
	
	public static void main(String[] args) {
		
		//pakistanInning
		int sum=0;
		System.setProperty("webdriver.chrome.driver", "C://Users//ccomp//Desktop//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
		
	//WebElement table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		           WebElement table=        driver.findElement(By.cssSelector("#innings_2 > div:nth-child(1)"));
	
	           int columns=  table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		
	           
	           for(int i=0; i<columns; i++){
	        	   
	        	  System.out.println (table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
	           
	        	 String coltotal= table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
	        	int colIntTotal= Integer.parseInt(coltotal);
	        	sum= sum + colIntTotal;
	        	System.out.println(sum);
	        	
	           }
	           
	           
	   // String extras=       driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
	           
	                   String extras=   driver.findElement(By.xpath("(//div[text()='Extras']/following-sibling::div)[3]")).getText();
	                    System.out.println(extras);
	      int extrasInt=  Integer.parseInt(extras);
	       int  totalscore= extrasInt +sum;
	      System.out.println(totalscore);
	           
	           
	     String actualTotal=      driver.findElement(By.xpath("(//div[text()='Total'])[2]/following-sibling::div[1]")).getText();
	    
	        int intActualtotal =      Integer.parseInt(actualTotal);
	        if(totalscore==intActualtotal){
	        	
	        	System.out.println(" crap crap");
	        }
	           
	          
	        else{
	        	System.out.println("wrap crap");
	        }
	        
	        driver.close();
	}
	
	
}


