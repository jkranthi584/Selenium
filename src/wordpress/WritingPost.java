package wordpress;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class WritingPost {
	
	public  WebDriver driver;
	  public WritingPost(WebDriver driver){
		  this.driver = driver;
		  PageFactory.initElements(driver, this);
	  }
	    @FindBy(xpath="//header[@id='header']/div[1]/a/span")
	      WebElement writeClick;
	  
	 // @FindBy(xpath="(//span[@class='masterbar__item-content'])[3]")
	    // WebElement writeClick;
	  
	   @FindBy(xpath="//textarea[@placeholder='Title']")
	       WebElement title;
	   //@FindBy(id="tinymce")
	    //  WebElement body;
	   
	   @FindBy(xpath="//iframe[@id='tinymce-1_ifr']")
	     WebElement body;
	   
	    //@FindBy(xpath="//button[@class='button']")
	   //  WebElement publish;
	   
	   @FindBy(xpath="//*[@id='primary']/div/div[3]/div[1]/div[3]/div/button")
	    WebElement publish;
	   ////*[@id="primary"]/div/div[1]/div/div[1]/div[2]/button
	   @FindBy(xpath="//*[@id='primary']/div/div[1]/div/div[1]/div[2]/button")
	   WebElement publish1;
	  public WebElement clickWrite(){
		  
		  return writeClick;
	  }
	 public WebElement hitTitle(){
		 
		 return title;
	 }
         
	 public WebElement writeText(){
		 return body;
	 }
	 public WebElement hitPulishTwice(){
		 
		 return publish;
	 }
 public WebElement hitPulishSecond(){
		 
		 return publish1;
	 }
} 
