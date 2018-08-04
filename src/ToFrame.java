
	
	
	import java.util.Iterator;
	import java.util.List;
	import java.util.Set;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;


public class ToFrame {

	 public static void main(String[] args) throws InterruptedException {
	  // TODO Auto-generated method stub
	  System.setProperty("webdriver.chrome.driver", "C://Users//ccomp//Desktop//chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.get("https://www.google.com/recaptcha/api2/demo");
	  int num = findframenumber(driver, By.className("recaptcha-checkbox-checkmark"));
	  driver.switchTo().frame(num);
	  driver.findElement(By.className("recaptcha-checkbox-checkmark")).click();
	  driver.switchTo().defaultContent();
	  //driver.switchTo().defaultContent(); remove the above step if the frame exist within the  frame...
	  //...if the frame is the child of another frame.
	  int num1 = findframenumber(driver, By.cssSelector("button[id='recaptcha-verify-button']"));
	  driver.switchTo().frame(num1);
	   // driver.findElement(By.cssSelector("button[id='recaptcha-verify-button']")).click();

	  WebElement ele = driver.findElement(By.cssSelector("button[id='recaptcha-verify-button']"));
	 // ele.click();
	  if (!ele.getText().equals("Verify") && ele.isDisplayed()) {
	  Thread.sleep(2000);
	  ele.click();
	  Thread.sleep(2000);
	  ele = driver.findElement(By.cssSelector("button[id='recaptcha-verify-button']"));
	  ele.click();
	  
	      }
	   ele.click();

	  }
	 //this is the First step after declaring the website
	 public static int findframenumber(WebDriver driver, By by)
	 {
	  int i;
	  int framecount = driver.findElements(By.tagName("iframe")).size();
	  System.out.println("what's the frame count?: "+framecount);
	  for (i=0; i<framecount; i++)
	  {
		 
	  driver.switchTo().frame(i);
	  int count = driver.findElements(by).size();
	  //count is 0 means no object/item is present with the given path
	  if (count>0)
	  {
	   System.out.println("count is: "+count);
	   //count is 0 means no object/item is present with the given path
	  break; 
	  //break is use to stop looping if item/object is found 
	  }
	  else
	  {
		  System.out.println("Continue looping through the frames until the item with given Path is present");
	   driver.switchTo().defaultContent();
	  
	  }
	  }

	  driver.switchTo().defaultContent();
	  System.out.println("what is the i now:"+i);
	  return i;
	 }

	 }


