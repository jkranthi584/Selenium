package fromScratch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class automation {
    static WebDriver driver;
    
	public static void main(String[] args) throws InterruptedException {
		

			System.setProperty("webdriver.chrome.driver","C://Chromedriver.exe");
			       driver = new ChromeDriver();
			
			driver.get("http://automationpractice.com/index.php");
			driver.findElement(By.xpath("//a[text()='Women']")).click();
			            Thread.sleep(7000L);

						filterColor("Yellow","#F1C40F");
					       String colo= "blue";
					        driver.close();
					
/*//a[contains(text(),'Orange')]*/
/*//a[text()='Women']*/


	/*	  // driver.findElement(By.xpath("//*[@id=\"ul_layered_id_attribute_group_3\"]/li[4]/label/a"));
		   Thread.sleep(3000L);
		  
		  
	   
	
	//ele.click();
	System.out.println(ele.toString()+" is clicked");
   
    
Thread.sleep(3000L);

List<WebElement> bgColor = driver.findElements(By.xpath("//ul[@class='color_to_pick_list clearfix']/li/a"));
     


       
for(WebElement clr: bgColor) {
	  // if(clr.getCssValue("background").contains("rgb(243, 156, 17)"))
	     
	String color =   clr.getCssValue("background");
	//System.out.println(color);
	  String col[] = color.split("n");
	 // System.out.println(col[0]);
	  
	         
	String hexValue  =   Color.fromString(col[0]).asHex();
	   if(hexValue.toUpperCase().equals("#F39C11"))
	
	
     System.out.println("background-color:"+hexValue);
     
     
}*/

 
	}  
	
	public static void filterColor(String xcolor,String hexVal) {
	    
		  int  counter =0;
		    boolean checkColor=false;
		 if(!hexVal.startsWith("#"))
		     hexVal =	 "#"+hexVal;
		
		
		//WebElement ele = driver.findElement(By.xpath("//a[text()='"+xcolor+"']"));
		WebElement ele = 	driver.findElement(By.xpath("//a[contains(text(),'"+xcolor+"')]/parent::*/preceding-sibling::input[1]"));
		
		 //String random  =     ele.getText();
			//  System.out.println(random);
		  ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()",ele);
			  
				  
		
		try {
		      ele.click();
             Thread.sleep(7000L);
             
             List<WebElement> bgColor = driver.findElements(By.xpath("//ul[@class='color_to_pick_list clearfix']/li/a"));
             


             
             for(WebElement clr: bgColor) {
             	  // if(clr.getCssValue("background").contains("rgb(243, 156, 17)"))
             	     
             	String color =   clr.getCssValue("background");
             	//System.out.println(color);
             	  String col[] = color.split("n");
             	  //System.out.println(col[0]);
             	  
             	         
             	String hexValue  =   Color.fromString(col[0]).asHex();
             	
         
             	   if(hexValue.toUpperCase().equals(hexVal)) {
             	
             	       counter++;
                      System.out.println("background-color:"+hexValue);
                       System.out.println("color filter is working");
                       checkColor = true;
                       
             	   }
             	   else
             		   //System.out.println("color filter is not working");
             	       checkColor = false;
             	   
             	      
             }
			
		}catch(Exception e) {}
		
	              String text =  driver.findElement(By.xpath("//a[text()='"+xcolor+"']")).getText();
	              System.out.println(text);
		
		if(checkColor)
			System.out.println("Yeah! color filter is working and no of items  of this color are: "+counter);
		else
			System.out.println("No! filter is not working for now");
		
		
		
		
	}
}
