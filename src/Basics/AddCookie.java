package Basics;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class AddCookie {//getcookiesmethond returns Set of cookies
	
	public static void main(String[] args) {
		
		WebDriver driver;
	       driver = new ChromeDriver();
	       driver.manage().deleteAllCookies();
	       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	       driver.get("http://www.airtel.in");
	       //To add a cookie with name: username and its vaue:airtel
	       Cookie cookie = new Cookie("username","airtel");
	       driver.manage().addCookie(cookie);
	       //print this cookie which was just added
	        Set<Cookie> cookieL= driver.manage().getCookies();
	        
	            for(Cookie temp_cookie: cookieL)
		              System.out.println("Name of the cookie: "+temp_cookie.getName()+" and its value "+temp_cookie.getValue());
	            
	                         
	            //To delete a particular cookie
	           /*  driver.manage().deleteCookie(cookie);*/
	             //Get Cookie with a specific name – To get a specific cookie.
	           /*  Cookie cookie1=driver.manage().getCookieNamed("__utmb");
	             System.out.println("Name of the cookie:"+cookie1.getName()+"its value: "+cookie1.getValue());
	             */
	             
	             /*Set<Cookie>cookies=driver.manage().getCookies();
	             for(Cookie cooki: cookies){
	            	 driver.manage().deleteCookie(cooki);
	                 System.out.println("coookie is deleted and its name was :"+cooki.getName());
	             }*/
	}
	
}
