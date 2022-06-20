package testNg2;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	static WebElement driver;
   public static void takeScreenshot(String name) throws IOException {
	   TakesScreenshot ss=(TakesScreenshot)driver;
	   File source=driver.getScreenshotAs(OutputType.FILE);
	   File file=new File(System.getProperty("user.dir")+name+".png");
	   FileHandler.copy(source,file);
	   	  
   }
}
