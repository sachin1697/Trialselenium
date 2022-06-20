package selenium1;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot1 {
    public static void main(String[]args) throws InterruptedException, IOException  {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\automisation lecture\\selenium\\chromeDriver\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.navigate().to("https://vctcpune.com/selenium/practice.html");
    	//driver.navigate().refresh();
    	Thread.sleep(3000);
    	JavascriptExecutor js=(JavascriptExecutor)driver;
    	js.executeScript("window.scroll(0,600)");
        List<WebElement> drop=driver.findElements(By.cssSelector("input[type='checkbox']"));
        TakesScreenshot SS=(TakesScreenshot)driver;
        File source=SS.getScreenshotAs(OutputType.FILE);
        File file1=new File("C:\\eclipse\\trialselenium\\src\\S.S\\Screen11.png");
        File file2=new File("C:\\eclipse\\trialselenium\\src\\S.S\\Screen12.png");

        File source1=SS.getScreenshotAs(OutputType.FILE);
       for(WebElement alld:drop) {
    		String s=alld.getText();
    		System.out.println(s);
    		//alld.click();
    		 if(s.equalsIgnoreCase("Option1")) {
    			alld.click();
    			Thread.sleep(3000);
    			FileHandler.copy(source,file1);
    		 }
    		if(alld.isSelected()) {
    			alld.click();
    			FileHandler.copy(source1,file2);
            	Thread.sleep(3000);
    		}
         	
    	}
        Thread.sleep(3000);
    	driver.close();
    	
    	
    }
}
