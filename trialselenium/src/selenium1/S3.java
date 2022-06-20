package selenium1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class S3 {
      public static void main(String[]args) throws InterruptedException, IOException {
    	  System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\automisation lecture\\selenium\\chromeDriver\\chromedriver.exe");
    	  WebDriver driver=new ChromeDriver();
    	  driver.manage().window().maximize();
    	  driver.get("https://vctcpune.com/selenium/practice.html");
    	  //JavascriptExecutor j=(JavascriptExecutor)driver;
    	  //j.executeScript("window.scrollBy(0,500)");
          TakesScreenshot SS=(TakesScreenshot)driver;
          File Source=SS.getScreenshotAs(OutputType.FILE);
          File file=new File("C:\\eclipse\\trialselenium\\Screenshot\\Screen15.png");
          FileHandler.copy(Source, file);
          Thread.sleep(6000);
    	  System.out.println(driver.getCurrentUrl());
    	  driver.close();
      }

      
	
	}

