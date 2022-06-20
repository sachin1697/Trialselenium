package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Implicitly {
	WebDriver driver;

 @BeforeTest
 public void browser() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\automisation lecture\\selenium\\chromeDriver\\chromedriver.exe");
	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 }
 @Test
 
	 public void login() throws InterruptedException {
		  
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		 
		 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		 
		
		 driver.findElement(By.id("btnLogin")).click();
 }
 @AfterTest
 public void close() {
	 driver.quit();
 }
 }
