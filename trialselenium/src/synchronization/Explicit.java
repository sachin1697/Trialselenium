package synchronization;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Explicit {
	WebDriver driver;
  @BeforeTest
  public void browser() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\automisation lecture\\selenium\\chromeDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
  }
  @Test
  public void stop() throws InterruptedException{
	  driver.findElement(By.id("alert")).click();
	  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	  wait.until(ExpectedConditions.alertIsPresent());
	  Thread.sleep(3000);
	  Alert window=driver.switchTo().alert();
	  window.accept();
}
  @AfterTest
  public void close() {
	  driver.quit();
  }
}
