package Basics;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.WebDriverException;

	import org.openqa.selenium.WebElement;

	import org.openqa.selenium.firefox.FirefoxDriver;

	import org.openqa.selenium.interactions.Actions;

	import org.openqa.selenium.support.ui.ExpectedConditions;

	import org.openqa.selenium.support.ui.WebDriverWait;

	public class opsrahulcrap extends firstrahulcrap {

	public static void main(String[] args) {

	// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
	WebDriver driver=new FirefoxDriver();

	WebDriverWait wd=new WebDriverWait(driver,17);

	driver.get("https://www.google.com/recaptcha/api2/demo");

	//driver.manage().window().maximize();

	int m=gotoframe(driver,By.xpath(".//*[@id='recaptcha-anchor']"));
    System.out.println("the value of m is(frame): "+m);

	driver.switchTo().frame(m);
	
	//these two lines are crap just an example of wedriver wait.
//wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='recaptcha-anchor']/div[5]"))).click();
	//driver.findElement(By.xpath(".//*[@id='m_rtxtEmail1']")).sendKeys("ja");
driver.findElement(By.xpath(".//*[@id='recaptcha-anchor']/div[5]")).click();

	driver.switchTo().defaultContent();

	//wd.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("I1_1441700500937")));

	int j=gotoframe(driver,By.xpath(".//*[@id='recaptcha-verify-button']"));
     System.out.println("the value of j is(frame) : "+j);
	if(j!=-1)

	{

	driver.switchTo().frame(j);

	//WebDriverWait wd=new WebDriverWait(driver,5);

	//wd.until(ExpectedConditions.(By.xpath(".//*[@id='recaptcha-verify-button']")));

	driver.findElement(By.xpath(".//*[@id='recaptcha-verify-button']")).click();

	}

	else{

	System.out.println("ops");

	}

	}
	}
