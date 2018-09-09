package Basics;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicCheckboxes {

public static void main(String[] args) {
	

	
	System.setProperty("webdriver.chrome.driver","C://Users//ccomp//Desktop//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//driver.manage().window().maximize();
	driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
	List <WebElement> elements = driver.findElements
			(By.xpath("//input[@name='lang' and @type='radio']"));
	
	
	
	
	    for(int i=0; i<elements.size(); i++){
	    	
	      WebElement local_radio=elements.get(i);
	      System.out.println("spiting out the I: "+ i);
	String value=      local_radio.getAttribute("Value");
	System.out.println("Values of radio buttons are: "+value);
	if(value.equalsIgnoreCase("Ruby")){
		
		local_radio.click();
	
	
	}
	      
	    	
	    }
	    
	    
	    List <WebElement> elemnto = driver.findElements(By.xpath("//input[@type='checkbox']"));
	               
	     for(int i=0; i<elemnto.size(); i++){
	    	 //get the index of the web elements 
	    	 
	    WebElement checkbox=	 elemnto.get(i);
	    
	    //getText() doesn't work on Iinput type elements for example checkboxes,that's why
	    // use getAttribute() method instead of getText()
	    /*String cup= elemnto.get(i).getText();
	     System.out.println("the cup is: "+cup);*/
	     
	    //extract text called it from the webelement
	    System.out.println(checkbox);
	              
	  String id=    checkbox.getAttribute("id");
	        //String text=           checkbox.getText();
	  
	        
	   //see if id equals to the code, if id equals code go ahead and click
	      if(id.equalsIgnoreCase("sing")){
	    	  
	    	  checkbox.click();
	    	  //break is used to stop looping once you find the desired step,no need to continue
	    	  break;
	      }
	     }
	     //driver.quit();
}
}
