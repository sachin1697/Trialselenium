package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Fluent {
	WebDriver driver;
	  @BeforeTest
	  public void browser() {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\automisation lecture\\selenium\\chromeDriver\\chromedriver.exe");
			driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  }
	  @Test
	  public void test1() {
		  driver.findElement(By.id("display-other-button")).click();
		  WebElement button=driver.findElement(By.id("hidden"));
		  FluentWait <WebDriver> fwait=new FluentWait<WebDriver>(driver);
			 
		  fwait.withTimeout(Duration.ofSeconds(12)).pollingEvery(Duration.ofSeconds(15));
		  fwait.until(ExpectedConditions.visibilityOf(button));
	      button.click();
	  }
	  @AfterTest
	  public void quit() {
		  driver.quit();
	  }
}
