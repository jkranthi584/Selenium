package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Recaptcha2 {
	
	 public static int findFrameNumber(WebDriver driver, By path) throws InterruptedException {
		 int i;
		 int framecount = driver.findElements(By.tagName("iframe")).size();
		 System.out.println("the framecount: "+framecount);//2
		 for (i = 0; i < framecount; i++) {
		 System.out.println("value of i is: "+i);//0
		 driver.switchTo().frame(i);//frame 0
		 int count = driver.findElements(path).size();
		        System.out.println("no of webelement with this path:"+count);
		 if (count > 0) {
			 
		 driver.findElement(path).click();
		 System.out.println("the i is:"+i);
		 break;
		 } else {
		 System.out.println("Continue looping");
		 driver.switchTo().defaultContent();
		    }
		 }
		 driver.switchTo().defaultContent();
		 return i;

		 }
		 }


