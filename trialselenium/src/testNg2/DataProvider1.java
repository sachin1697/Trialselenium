package testNg2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {
  WebDriver driver;
  
  @BeforeTest
  public void WatchVideo () {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\automisation lecture\\selenium\\chromeDriver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.youtube.com/");
  }
  @Test(dataProvider="sendkeys")
  public void test1(String name) {
	  driver.findElement(By.xpath("//input[@id='search']")).sendKeys(name);
	  driver.findElement(By.xpath("//button[@class='style-scope ytd-searchbox']")).click();
  }
  @DataProvider(name="sendkeys")
  public String[] test2() {
	  String[] data= {"https://youtu.be/I9cBAa6S_OU","chala hava yeu day","automation mock interview"};
	  return data;
  }
  @AfterTest
  public void tearDown() throws InterruptedException {
	  Thread.sleep(5000);
	  driver.close();
  }

}
