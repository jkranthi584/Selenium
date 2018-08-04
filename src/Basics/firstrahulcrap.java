package Basics;




	import org.openqa.selenium.By;

	import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.WebDriverException;

	import org.openqa.selenium.WebElement;

	import org.openqa.selenium.firefox.FirefoxDriver;

	import org.openqa.selenium.interactions.Actions;

	import org.openqa.selenium.support.ui.ExpectedConditions;

	import org.openqa.selenium.support.ui.WebDriverWait;

	public class firstrahulcrap {

	public static int gotoframe(WebDriver driver1,By by)

	{

	driver1.switchTo().defaultContent();

	int i;

	int num = -1;//frame can have an index of 0 that's why -1

	int a=driver1.findElements(By.tagName("iframe")).size();
	System.out.println("frame count "+a);

	for(i=0;i<a;i++)

	{

	driver1.switchTo().defaultContent();

	driver1.switchTo().frame(i);
	System.out.println("the indexes of the frame:"+i);

	int b=driver1.findElements(by).size();
	//it has to greater than 0 since we are already inside one frame that starts 
	// with an index 0.if there is a frame(s) inside this,its index has to be greater
	//than zero(0)
        
	if(b>0)

	{

	num=i;

	break;

	}
	
	}

	driver1.switchTo().defaultContent();

	return num;// it returns 0 if there is no frame(s) inside the frame we r in

	  }
	
	}
