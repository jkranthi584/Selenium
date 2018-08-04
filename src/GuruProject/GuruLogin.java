package GuruProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class GuruLogin {
	
	WebDriver driver;
	
	public GuruLogin(WebDriver driver) {
		
		this.driver= driver;
		
	}
	By userName= By.name("mngr101257");
	By password=By.name("yrubasa");
	By login = By.name("btnLogin");
	
	  


   public WebElement getusernaame() {
	   
     return driver.findElement(userName);
   }
   public WebElement getPassword() {
	   
	   return driver.findElement(password);
   }
   
          public WebElement clickLogin() {
        	  
        	  return driver.findElement(login);
          }
   }