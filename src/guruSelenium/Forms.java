package guruSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Forms {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C://Users//ccomp//Desktop//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 //Selecting Checkbox and using isSelected Method		
       /* driver.get("http://demo.guru99.com/selenium/facebook.html");					
        WebElement chkFBPersist = driver.findElement(By.id("persist_box"));							
        for (int i=0; i<3; i++) {											
            chkFBPersist.click (); 			
            System.out.println("Facebook Persists Checkbox Status is -  "+chkFBPersist.isSelected());							
        }		
        System.out.println("browser is getting closed now");
        driver.close();*/
	String baseUrl=	"http://demo.guru99.com/selenium/webform/login.html";	
	driver.get(baseUrl);
	
	WebElement email = driver.findElement(By.id("email"));
	  WebElement password = driver.findElement(By.name("passwd"));
	  email.sendKeys("therock");
	  password.sendKeys("supremerock");
	  System.out.println("Text field is set");
	  
	  //deleting the values in the text
	     email.clear();
	     password.clear();
	     System.out.println("text field is clear my dear");
	     
	     //find the submit button
	WebElement login=  driver.findElement(By.id("SubmitLogin"));
	
	       //Using click method to submit form
	       email.sendKeys("abcd@gmail.com");
	       password.sendKeys("abcdefghlkjl");
	       login.click();
	       System.out.println("Login done with Click");
	       
	       // using submit method to submit the form. Sumbit used on password field
	       driver.get(baseUrl);
	       driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
	       
	       driver.findElement(By.name("passwd")).sendKeys("abcdefghlkjl");
	         WebElement submitting=      driver.findElement(By.id("SubmitLogin"));
	            submitting.submit();   
	            driver.get("http://demo.guru99.com/selenium/webform/radio.html");
	            WebElement radio1 =driver.findElement(By.id("vfb-7-1"));
	            WebElement radio2=  driver.findElement(By.id("vfb-7-2"));
	            
	            radio1.click();
	            System.out.println("Radio button option 1 is selected");
	            
	            radio2.click();
	            System.out.println("Radio button option 2 Selected");
	            
	            //Selecting Checkbox
	       WebElement option1=  driver.findElement(By.id("vfb-6-0"));
	          option1.click();
	          


     //isSelected() method is used to know whether the Checkbox is toggled on or off. 
	          
	          //check whether the checkbox is toggled on
	          if(option1.isSelected()) {
	        	  
	        	  System.out.println("checkbox is toggled on");
	          }
	          else {
	        	  System.out.println("checkbox is toggled off");
	          }
	            
	            
		          //Selecting Checkbox and using isSelected Method
	          
	          driver.get("http://demo.guru99.com/selenium/facebook.html");
	          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	          
	      WebElement facebook=  driver.findElement(By.id("persist_box"));
	            for(int i=0; i<2; i++) {
	            	
	            	facebook.click();
	            	System.out.println("Facebook Persists Checkbox Status is -" +facebook.isSelected());
	            }
		            
		
	}
   	
	 

}
