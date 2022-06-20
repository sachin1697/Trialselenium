package testNg1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import excelData.InsertData;

public class Facebook2 {
	WebDriver driver;
	String mainWindow;
	
  @BeforeMethod
  public  void window() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\automisation lecture\\selenium\\chromeDriver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  mainWindow=driver.getWindowHandle();
	  
  }
  @Test (groups="new_page")
  public void TestCase4() throws IOException, InterruptedException {
	  Thread.sleep(4000);
	  driver.findElement(By.linkText("Forgotten password?")).click();
	  String title=driver.getTitle();
	  InsertData.m5(9, 7, title);
  }
  @Test (groups="new_page")
  public void TestCase5() throws IOException {
	  driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	  String title=driver.getTitle();
	  InsertData.m5(11, 7, title);
  }
  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }
}
