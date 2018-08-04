package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailVerification {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		/*System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
	 driver = new ChromeDriver();*/
		System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
	String url = "https://accounts.google.com/ServiceLogin?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1";
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	   driver.findElement(By.id("identifierId")).sendKeys("heyemailmeback@gmail.com");
	   driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
	    Thread.sleep(5000L);
	    
	   driver.findElement(By.name("password")).sendKeys("WHOCAres_901U");
	   //driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")).click();
	    driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
	   Thread.sleep(10000L);
	   getData(driver);
	
}
	public static void getData(WebDriver driver) throws InterruptedException{
	
	String inbox = driver.findElement(By.xpath("(//span[@class='nU n1']/a)[1]")).getText();
	
	String name = driver.findElement(By.xpath("//*[@id=\":45\"]")).getText();
	//String name1 = driver.findElement(By.xpath("//div[@class='xS']//div[@class='xT']//div[@class='y6']//span[@id=':4h']")).getText();
	
	 String subject = driver.findElement(By.xpath("//span[@id=':48']")).getText();
	//String subject = driver.findElement(By.xpath("(//td[@class='yX xY mt-recipient']/div[3])[5]")).getText();
	
	   System.out.println("inbox: "+inbox);
	   System.out.println();
	   System.out.println("name: "+name);
	   System.out.println();
	   System.out.println("subject: "+subject);
	}

}
