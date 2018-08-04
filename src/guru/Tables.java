package guru;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {
	
	public static void main(String[] args) throws ParseException {
		
		
		WebDriver wd;
		String max; 
		double m=0,r=0;
		int k=0;
		
		  System.setProperty("webdriver.chrome.driver", "C://Users//ccomp//Desktop//chromedriver.exe");
	        wd = new ChromeDriver();
	        wd.get("http://money.rediff.com/gainers/bsc/daily/groupa?");
	        //No.of rows
	        List <WebElement> rows = wd.findElements(By.xpath (".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
	        System.out.println("Total No of rows are : " + rows.size());
	        //No. of Columns
	        List <WebElement> col = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
	        System.out.println("Total No of columns are : " +col.size());
	    
		for(int i=1; i<rows.size(); i++){
			
		  max=	   wd.findElement(By.xpath("html/body/div[1]/div[5]/table/tbody/tr["+ i+1 + "]/td[4]")).getText();
		//Exception in thread "main" java.lang.NumberFormatException: For input string: "1,807.65"
		  //calling the calls NumberFormat and its method and creating its object to  cast max into number format
		  
	NumberFormat nf=	     NumberFormat.getIntegerInstance();
	//using nf,Number'sFormat Object to cast max into number format
	//Number is an abstract class and that makes num an object or instance of the class, Number
	   Number num=        nf.parse(max);
	   
	           max=          num.toString();
	           // num gives us no decimal value means no value after a decimal,for example 197.0 num 
	           //num will be 197 no .0
	                // System.out.println("lol"+num.toString());
	                 System.out.println("the max is now: "+max);
	           
	          m=     Double.parseDouble(max);
	          System.out.println("the m is: ");
	          System.out.println(m);
	          
	          if(m>r){
	        	  r=m;
	        	  k=i;
	          }
			
		}
		System.out.println("The maximum number is: "+r);
		
		//System.out.println( wd.findElement(By.xpath("html/body/div[1]/div[5]/table/tbody/tr[" + k + "]")).getText());
		String wholer=  wd.findElement(By.xpath("html/body/div[1]/div[5]/table/tbody/tr["+ k +"]")).getText();
	        
	        
	        System.out.println(wholer);
	        System.out.println("Maximum Number's row number is: "+k);
	        wd.close();
	}

}
