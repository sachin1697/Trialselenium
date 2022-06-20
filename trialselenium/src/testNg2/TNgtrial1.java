package testNg2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TNgtrial1 {
	WebDriver driver;
  @BeforeTest
  public  void m1() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\automisation lecture\\selenium\\chromeDriver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.navigate().to("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }
  @Test
  public void waitforelement() {
	 driver.findElement(By.xpath("//button[@id='alert']")).click();
	 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	 wait.until(ExpectedConditions.alertIsPresent());
	 driver.switchTo().alert().accept();
  }
  @AfterTest
  public void close() {
	  driver.quit();
  }
}
