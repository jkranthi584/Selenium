package FreeCRMDealVerification;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyFreeTestCrm {
	static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
		
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		         waitsforanElement();
		      
		         driver.switchTo().frame("mainpanel");
		 		
		 		
		 		WebElement ele = driver.findElement(By.xpath("//a[contains(text(),'Deals')]"));
		 		  ele.click();
		 		
		 		  waitsforanElement(); 
		 		 
		 		/*String title="";
		 		String text="";
		 		
		 		WebElement select=  driver.findElement(By.xpath("(//div[@class='pagination']/select)[1]"));
		 		Select sel = new Select(select);
		 		
		 		 do{
		 			 title ="FreakShow";
		 			
		 			int optionsCount =driver.findElements(By.xpath("(//div[@class='pagination']/select)[1]/option")).size();
		 		
		 			
		 	                 
		              // text =driver.findElement(By.xpath("(//a[contains(@_title,'"+title+"')])[2]")).getText();
				
					    for(int i=1; i<=optionsCount; i++) {
					    	select=  driver.findElement(By.xpath("(//div[@class='pagination']/select)[1]"));
				    	    sel = new Select(select);
					    	
					    	int textCount =  driver.findElements(By.xpath("//form[@name='PROSPECTSEARCH']/table[2]/tbody/tr")).size();
					 	       for(int j=4; j<textCount; j++) {
					 	    	   
					 	     text = driver.findElement(By.xpath("//form[@name='PROSPECTSEARCH']/table[2]/tbody/tr["+j+"]/td[2]/a")).getText();
					 	        //System.out.println("the value of j is: "+j);
					 	       
					 	        //System.out.println("actual text: "+text);
					 	       
					 	      // System.out.println("title: "+title);
					 	       
					 	     //  System.out.println("text at 21 row and td[2]: "+driver.findElement(By.xpath("//form[@name='PROSPECTSEARCH']/table[2]/tbody/tr[21]/td[2]")).getText());
					 	  
					 	        if(text.contains(title)) {
					 	      title = text;
					 	      System.out.println("text matched");
					 	        return;
					 	    }
					     }
					 	       
					 	      sel.selectByIndex(i);
							    waitsforanElement();
						 	     waitsforanElement();
		 	           }
					    
					      
		 	          
		 	            }while(!(title.equalsIgnoreCase(text)));*/
		 		    driver.findElement(By.xpath("(//table[@class='datacard'][2]/tbody/tr[3]/td/a[2])[1]")).click();
		 		     waitsforanElement();
		 		     waitsforanElement();
		 		    int textCount =  driver.findElements(By.xpath("//form[@name='PROSPECTSEARCH']/table[2]/tbody/tr")).size();
		 		     for(int i=4; i<textCount;i++) {
		 		    	//form[@name='PROSPECTSEARCH']/table[2]/tbody/tr[4]/td[2]
		 		   String text = driver.findElement(By.xpath("//form[@name='PROSPECTSEARCH']/table[2]/tbody/tr["+i+"]/td[2]/a")).getText();
		 		      if(text.equalsIgnoreCase("freakShow")) 
		 		    	 // System.out.println("Matched");
		 		    	  break;
		 		     }  
		 		        
		 		  
		 		    driver.close();
		 		     
		 		  
		
	}
	public static void waitsforanElement() {
		 
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
