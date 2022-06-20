package pageModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;



public class OBaseClass {
	public static WebDriver driver;
	@BeforeSuite
	public void initBrowser() {
		
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\automisation lecture\\selenium\\chromeDriver\\chromedriver.exe");
			//step-1 Launch browser
		   driver=new ChromeDriver();
			
			//Step-2 Maximize window
			driver.manage().window().maximize();
			
			//step-3
			driver.get("https://opensource-demo.orangehrmlive.com/");
			//step-4
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@AfterSuite
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}
}
