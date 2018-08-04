package guruProject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrom.driver", "C:/chromdriver.exe");
		
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://www.naukri.com");
		   
		   String main = driver.getWindowHandle();
		   
		  Set<String> allWindows =  driver.getWindowHandles();
		 // String main = (String) allWindows.toArray()[0];
		      
		       //Object[] dr =  allWindows.toArray();
		       int i=0;
		       while(i<3) {
		    	   Object[] dr =  allWindows.toArray();
		        System.out.println(dr.toString());
		        i++;
	}
		    Iterator<String> children=     allWindows.iterator();
	        /*  Iterator<String>child =  allwindows.iterator();*/
	         int windCount =  allWindows.size();
	         
	       /*  for(String child: allWindows) {
	        	 if(!main.equalsIgnoreCase(child))
	        	 driver.switchTo().window(child).close();
	         }*/
	         while(children.hasNext()) {
	        	 String ch = children.next();
	        	 if(!main.equalsIgnoreCase(ch))
	        		 driver.switchTo().window(ch).close();
	        	    // String title = driver.switchTo().window(ch).getTitle();
	        		// if(title.contains("Amazon"))
	        	       // driver.switchTo().window(ch).close();
	         }
	         driver.switchTo().window(main);
	         System.out.println( driver.getTitle());
		  // driver.findElement(By.name("qp")).sendKeys("dljfdljf");
		  
		   
	}

}
