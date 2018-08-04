package Basics;

import java.util.Iterator;

import java.util.Set;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {

public static void multiWind(WebDriver driver) throws InterruptedException {

Iterator<String> it = driver.getWindowHandles().iterator();

while (it.hasNext()) {

System.out.println("switching to mainWindow");

String mWind = it.next();

driver.switchTo().window(mWind);

System.out.println(driver.getTitle());

Thread.sleep(6000L);

}

}

public static void main(String[] args) throws InterruptedException {

WebDriver driver = new ChromeDriver();

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.get("http://www.naukri.com");

Thread.sleep(2000L);

driver.findElement(By.linkText("Post Jobs")).click();

// multiWind(driver);

Thread.sleep(2000L);

driver.findElement(By.linkText("Employer Zone")).click();

// multiWind(driver);

Thread.sleep(2000L);

// driver.findElement(By.linkText("Employer Zone")).click();

// multiWind(driver);

Thread.sleep(2000L);

driver.findElement(By.linkText("Report a Problem")).click();

// multiWind(driver);

Set<String> s2 = driver.getWindowHandles();

Iterator<String> it1 = s2.iterator();

// Iterator<String> it1 = driver.getWindowHandles().iterator();

// Iterator<String>it1 = (Iterator<String>)

// driver.getWindowHandles().iterator();

String str = "Post";

while (it1.hasNext()) {

driver.switchTo().window(it1.next());

String title = driver.getTitle();

if (title.contains(str)) {

driver.close();

break;

}

}

}

}