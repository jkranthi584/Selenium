package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RaidoButtonExample {
	
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C://Users//ccomp//Desktop//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		  driver.get("http://echoecho.com/htmlforms10.htm");
		  
		/*List<WebElement> radiocount=    driver.findElements(By.xpath(".//input[@name='group2']"));
		System.out.println("No of radio buttons are: "+radiocount.size());
		
		  for(int i=0; i<radiocount.size(); i++){
			  
		/*String crap=	  radiocount.get(i).getAttribute("value");
		System.out.println(crap);
		
		       if(crap.equalsIgnoreCase("water")){*/
		    	   
		    	   //radiocount.get(i).click();
		    	   
		      // }*/
	
	
	                       
			          /* List<WebElement> radiocount=  driver.findElements(By.xpath("//input[@name='group1']"));
			             
			           for(int i=0; i<radiocount.size(); i++ ){
			        	   
			        	 WebElement radio=  radiocount.get(i);
			        	 
			       String rub= 	   radio.getAttribute("value");
			       
			                if(rub.equalsIgnoreCase("milk")){
			                	
			                	radio.click();
			                }
			        	   
			           }*/
		  
		  List<WebElement> radiocount=    driver.findElements(By.xpath(".//input[@name='group2']"));
			System.out.println("No of radio buttons are: "+radiocount.size());
			//better to use isSelected Method on checkbox since we can click on more than one checkbox at a time
			// same is not true with radio button
			   for(int i=0; i<radiocount.size(); i++){
				   
				   if(!radiocount.get(i).isSelected()){
					   
					   radiocount.get(i).click();
				   }
				   
				   else{
					   String val= radiocount.get(i).getAttribute("value");
					   System.out.println(val);
				   }
			   }
		  
		  }
		    
		
	}


