package selenium1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot2 {
      public void m1() throws IOException, InterruptedException {
    	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\automisation lecture\\selenium\\chromeDriver\\chromedriver.exe");
    	  WebDriver driver=new ChromeDriver();
    	  driver.manage().window().maximize();
    	  driver.get("https://www.hotstar.com/in");
    	  Thread.sleep(2000);
    	  
    	 // Step1 Screenshot 1
    	  TakesScreenshot SS=(TakesScreenshot)driver;
    	  File source=SS.getScreenshotAs(OutputType.FILE);
    	  File file=new File(System.getProperty("user.dir")+"\\Screenshot\\ScreenShot1.png");
    	  FileHandler.copy(source,file);
    	  
    	  
    	  //scroll Step 2
    	  JavascriptExecutor ja=(JavascriptExecutor)driver;
    	  ja.executeScript("window.scroll(0,200)");
    	  Thread.sleep(2000);
    	  
    	  //Step 3 Screenshot 2
    	  TakesScreenshot SS1=(TakesScreenshot)driver;
    	  File source1=SS1.getScreenshotAs(OutputType.FILE);
    	  File file1=new File(System.getProperty("user.dir")+"\\Screenshot\\Screenshot2.png");
    	  FileHandler.copy(source1,file1);
    	  
    	  //step 4 Scroll3
    	  JavascriptExecutor ja2=(JavascriptExecutor)driver;
    	  ja2.executeScript("window.scroll(0,400)");
    	  Thread.sleep(2000);
    	  
    	  //Step 5 Screenshot 3
    	  TakesScreenshot SS3=(TakesScreenshot)driver;
    	  File source3=SS3.getScreenshotAs(OutputType.FILE);
    	  File file3=new File(System.getProperty("user.dir")+"\\Screenshot\\Screenshot3.png");
    	  FileHandler.copy(source3,file3);
    	  
    	  //step 6 Scroll4
    	  JavascriptExecutor ja4=(JavascriptExecutor)driver;
    	  ja4.executeScript("window.scroll(0,1000)");
    	  Thread.sleep(2000);
    	  
    	  //step 7 Screenshot 4
    	  TakesScreenshot ss4=(TakesScreenshot)driver;
    	  File sourec4=ss4.getScreenshotAs(OutputType.FILE);
    	  File file4=new File(System.getProperty("user.dir")+"\\Screenshot\\Screenshot4.png");
    	  FileHandler.copy(sourec4, file4);
    	  
    	  //Step 8 scroll 
    	  JavascriptExecutor ja5=(JavascriptExecutor)driver;
    	  ja5.executeScript("window.scroll(0,1200)");
    	  
    	  //step 8 scroll 
    	  TakesScreenshot ss5=(TakesScreenshot)driver;
    	  File sourece5= ss5.getScreenshotAs(OutputType.FILE);
    	  File file5=new File(System.getProperty("user.dir")+"Screenshot\\Screenshot5");
    	  FileHandler.copy(sourece5, file5);
    	  
    			  
      }
      public static void main(String[]args) throws IOException, InterruptedException {
    	  ScreenShot2 obj1=new ScreenShot2();
    	  obj1.m1();
      }
      
}
