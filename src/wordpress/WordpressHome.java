package wordpress;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WordpressHome {
	
	WebDriver driver;
	
	public WordpressHome(WebDriver driver){
		
		
		this.driver= driver;
	}
	
	
      By signin=   By.linkText("Sign In");
       By email  = By.id("usernameOrEmail");
        By password=           By.name("password");
        By login       =     By.xpath("//button[@type='submit']");
      public WebElement Signin(){
    	  
    	  return driver.findElement(signin);
      }
       
      public WebElement Email(){
    	  
    	  return driver.findElement(email);
      }
        
      public WebElement getPassword(){
    	  
    	  return driver.findElement(password);
      }
      
      public WebElement LogIn(){
    	  
    	  return driver.findElement(login);
      }
            
      
}      
