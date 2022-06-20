package selenium2;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubWindow {
  
public static void m1() throws InterruptedException, IOException {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\automisation lecture\\selenium\\chromeDriver\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://vctcpune.com/selenium/practice.html");
	   
	   //step 2nd scroll window
	   JavascriptExecutor ss=(JavascriptExecutor)driver;
	   ss.executeScript("window.scroll(0,700)");
	   Thread.sleep(2000);
	   
	   TakesScreenshot SS2=(TakesScreenshot)driver;
	   File source2=SS2.getScreenshotAs(OutputType.FILE);
	   File file=new File(System.getProperty("user.dir")+"\\Screenshot\\Subwindow1.png");
	   FileHandler.copy(source2,file);			   
	   //step 3 click 
	   driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
	   
	   //step 4 switch to alert window
	   Alert Awondow=driver.switchTo().alert();
	   Thread.sleep(5000);

	   Awondow.accept();
	   
	   // step 5 sendKeys
	   driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys("sachin");
	   Thread.sleep(5000);

	   //step 5A second alert window
	    driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		   Thread.sleep(5000);

	   //step 6 second alert window
	   Alert Awindow2=driver.switchTo().alert();
	   String in=Awindow2.getText();
	   if(in.contains("sachin")) {
		   Awindow2.accept();
		  	   
	   }
	   Thread.sleep(5000);
	   driver.close();
   }
     public static void main(String[]args) throws InterruptedException, IOException {
    	 m1();
     }
}
