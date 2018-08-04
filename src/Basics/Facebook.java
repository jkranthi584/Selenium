package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C://Chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	    driver.get("https://www.facebook.com");
	    
	    for(int i=1; i<7; i++){
	    	//div[@id='reg_form_box']/child::div[1]/descendant::input[2]
	    	if(i<3)
	    	driver.findElement(By.xpath("//div[@id='reg_form_box']/child::div[1]/descendant::input["+i+"]")).sendKeys(sendData(i,""));
	    	//driver.findElement(By.xpath("(//div[@id='reg_form_box']/child::div[1]/descendant::input)["+i+"]")).sendKeys("rite");
	      
	       
	    	else{
	    		
	    		int j=i-1;
	    		//skipping 3 and 4 
	    		if(j==4)
	    			continue;
	    		driver.findElement(By.xpath("//div[@id='reg_form_box']/child::div["+j+"]/descendant::input")).sendKeys(sendData(j,"email"));
	    		
	    		
	    	}	
	    }
	  
	}
	public static String sendData(int i,String crap){
		String data="";
		switch(i){
		case 1:
			data="name";
			break;
		case 2:
		case 3:
			 if(crap=="")
			 data="break";
			 else
				 data="somethingelse@gmail.com";
			break;
		case 5:
			data="righton@dlfjd";
			break;
		case 6:
			data="tofreak@dlfjd";
			break;
		default:
			 data="noData";
				break;
		
		}
		
		return data;
	}

}
