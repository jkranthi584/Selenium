package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablePakistan {
	
	public static void main(String[] args) {
		int sum=0;
		System.setProperty("webdriver.chrome.driver", "C://Users//ccomp//Desktop//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
		
	WebElement table=	driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		
	    // int row=   table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
	     int cols=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
			
	       //int cols= table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child[3]")).size();
	
	       
	           for(int i=0;i<cols-2;i++){
	     //System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
	        	   
	        	   String value=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
	        	int crap=    Integer.parseInt(value);
	        	   sum=sum+crap;
	        	//System.out.println(sum);
	           }//By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
	        String Extras=	driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
	        		//By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
	        	
	        int intExtras=     Integer.parseInt(Extras);
	        
	             int totalValue=   sum + intExtras;
	             System.out.println("total: "+totalValue);
	             
	        String expectedValue=     driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
	             
	        int actualTotalValue=   Integer.parseInt(expectedValue);
	        
	        if(actualTotalValue==totalValue){
	        	
	        	System.out.println("Count matched!");
	        }
	        else{
	        	System.out.println("count is not right");
	        }
	}

}
