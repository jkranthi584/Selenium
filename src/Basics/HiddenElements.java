package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElements {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C://Users//ccomp//Desktop//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
	//int x   =  driver.findElement(By.id("male")).getLocation().getX();
    //int y   =    driver.findElement(By.id("male")).getLocation().getY();
  // System.out.println("the x cordination is "+ x);
  // System.out.println("the y cordination is : "+ y);
	  //second program starts from here above 4 steps are of 1st program.
	    //here the keyword is plural i.e webelements.that's why we have use the list
	 List<WebElement> radio=     driver.findElements(By.id("male"));
	 System.out.println("the total no of radio webelements on this page with this id is/are: "+radio.size());
	 
	 for(int i=0; i<radio.size(); i++){
		 //1st this was propose before creating webelement ele
		// int x1 = radio.get(i).getLocation().getX();
		            
		    
		 WebElement ele = radio.get(i);
		//if x and/or y coordinations are zero it means that element is hidden
		 
		int x= ele.getLocation().getX();
		if(x!=0){
			//radio.get(i).click();
			
			ele.click();
			break;
			
		}
		
	 }
	 
	}

}
