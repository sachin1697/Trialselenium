package testNg1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import excelData.DataAquire;
import excelData.InsertData;

public class Facebook {
	WebDriver driver;
	String mainWindow;
	
  @BeforeMethod
  public  void window() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\automisation lecture\\selenium\\chromeDriver\\update\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  mainWindow=driver.getWindowHandle();
	  
  }
  @Test (groups="actual_functionality")
  public  void TestCase1() throws IOException {
	  driver.findElement(By.xpath("//input[@name='email']")).sendKeys(DataAquire.m1(3, 6));
	  driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(DataAquire.m1(4, 6));
	  driver.findElement(By.xpath("//button[@name='login']")).click();
	  InsertData.m5(3, 7, "user login in his account");
  }
  @Test (groups="error_handeling")
  public void TestCase2() throws IOException {
	  driver.findElement(By.xpath("//input[@name='email']")).sendKeys(DataAquire.m1(5, 6));
	  driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(DataAquire.m1(6, 6));
	  driver.findElement(By.xpath("//button[@name='login']")).click();
	  String title=driver.findElement(By.xpath("//div[@class='_9ay7']")).getText();
	  InsertData.m5(5, 7, title);
  }
  @Test (groups="error_handeling")
  public void TestCase3() throws IOException {
	  driver.findElement(By.xpath("//input[@name='email']")).sendKeys(DataAquire.m1(7, 6));
	  driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(DataAquire.m1(8, 6));
	  driver.findElement(By.xpath("//button[@name='login']")).click();
	  String title=driver.findElement(By.xpath("//div[@class='_9ay7']")).getText();
	  InsertData.m5(7, 7, title);
  }
  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }
}
