package Basics;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuruCrap {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		WebDriver wd;
		String max; 
		double m=0,r=0;
		
		  System.setProperty("webdriver.chrome.driver", "C://Users//ccomp//Desktop//chromedriver.exe");
	        wd = new ChromeDriver();
	        wd.get("http://money.rediff.com/gainers/bsc/daily/groupa?");
	        //No.of rows
	        List <WebElement> rows = wd.findElements(By.xpath (".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
	        System.out.println("Total No of rows are : " + rows.size());
	        //No. of Columns
	        List <WebElement> col = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
	        System.out.println("Total No of columns are : " +col.size());
	    
	        for(int i=1; i<=rows.size(); i++){
	        	
	        	  max=  wd.findElement(By.xpath("html/body/div[1]/div[5]/table/tbody/tr[" + i + "]/td[4]")).getText();
	        	   
	        	      
	    NumberFormat f=   	NumberFormat.getNumberInstance();
	               Number num    =   f.parse(max);
	               
	                 max=       num.toString();
	        	      /*
	        	       * Exception in thread "main" java.lang.NumberFormatException: For input string: "1,807.65"
	        	       * Double mo=          Double.parseDouble(max);
	                 
	                     max=            mo.toString();
	                     System.out.println("what is max");
	                     System.out.println(max);
	                     
	                       m=         Double.parseDouble(max);*/
	        	  
	        	            m=           Double.parseDouble(max);
	        	            System.out.println("the m is after parsing into Double: ");
	        	            System.out.println(m);
	                       
	                     if(m>r){
	                    	 
	                    	 r=m;
	                    	 
	                    	 
	                     }
	                 
	        }
		
		
	        System.out.println("Maximum current price is : "+ r);
	        wd.close();
	}

}
