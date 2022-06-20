package testNg2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testNg2.ImplementingClass.class)
public class Listeners1{
public static WebDriver driver;
 @BeforeTest
 public void browser() throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\automisation lecture\\selenium\\chromeDriver\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com/");
	 Thread.sleep(2000);
 }
 @Test
 public void test() {
	 String title=driver.getTitle();
	 String acttitle="Facepage";
	 Assert.assertEquals(title, acttitle);
 }
 @Test
 public void test2() {
	 String url=driver.getCurrentUrl();
	 String acturl="https://www.facebook.com/login/";
	 Assert.assertEquals(url,acturl);
	 
 }
 @AfterTest
 public void aftertest() {
	 driver.close();
 }
}
