package Basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IsDisplayerOrng {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriver driver  = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://opensource.demo.orangehrmlive.com");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
	   Thread.sleep(8000L);
	Actions act = new Actions(driver);
	  /* act.moveToElement(driver.findElement(By.linkText("Admin"))).build().perform();
	   Thread.sleep(4000L);
	   act.moveToElement(driver.findElement(By.linkText("Qualifications"))).build().perform();
	   Thread.sleep(4000L);
	   driver.findElement(By.linkText("Education")).click();
	   Thread.sleep(4000L);
	   Thread.sleep(4000L);

		                  
		if(!driver.findElement(By.name("education[name]")).isDisplayed()){
		        driver.findElement(By.id("btnAdd")).click();
		        Thread.sleep(6000L);
		         driver.findElement(By.name("education[name]")).sendKeys("Masters of Computer Application");
		          driver.findElement(By.name("btnSave")).click(); 
		         }
	}*/
	act.moveToElement(driver.findElement(By.linkText("Leave"))).build().perform();
	Thread.sleep(4000L);
	 act.moveToElement(driver.findElement(By.linkText("Entitlements"))).build().perform();
     Thread.sleep(5000L);
     act.moveToElement(driver.findElement(By.linkText("Add Entitlements"))).build().perform();
             
     Thread.sleep(5000L);
     driver.findElement(By.linkText("Add Entitlements")).click();
     Thread.sleep(5000L);
    // dropDown(driver, "Paternity US");
     Thread.sleep(5000L);
     dropDown(driver,"2019-12-31");
	}

    public static void dropDown(WebDriver driver, String value) throws ParseException{
    	/*
    	  if(driver.findElement(By.xpath("//*[@id='frmLeaveEntitlementAdd']/fieldset/ol/li[3]/label")).getText().contains("Leave Type")){
    		  System.out.println("inside the leave type");
WebElement ele = driver.findElement(By.name("entitlements[leave_type]"));

       List<WebElement> eles =          ele.findElements(By.xpath("//select[@id='entitlements_leave_type']/option"));
		for(WebElement option: eles){
			 SimpleDateFormat date= new SimpleDateFormat("yyyy-MM-dd");
			 Date date1 =   date.parse(value);
			int val = Integer.parseInt(value);
   			 if(option.getText().equals(value)){
            			option.click();
           				break;
      				}
			}
    	  }*/
    	  
    	  if(driver.findElement(By.xpath("//*[@id='frmLeaveEntitlementAdd']/fieldset/ol/li[4]/label")).getText().contains("Leave Period")){
    		  System.out.println("inside the leave period");
    		  WebElement ele = driver.findElement(By.id("period"));

    		         List<WebElement> eles =          ele.findElements(By.xpath("//select[@id='period']/option"));
    		  		for(WebElement option: eles){
    		  			 SimpleDateFormat date= new SimpleDateFormat("yyyy-MM-dd");
    					 Date date1 =   date.parse(value);
    					int val = Integer.parseInt(value);
    		  			         String date2 =      String.valueOf(date1);
    		  			   String crap=        String.valueOf(value);
    		     			 if(option.getText().contains(date2)){
    		              			option.click();
    		             				break;
    		        				}
    		     			/* else if(option.getAttribute("value").equals(date1)){
    		     				 option.click();
    		     				 break;*/
    		     			 
    		  			}
    		      	  }
    	  
    	  
}

}

