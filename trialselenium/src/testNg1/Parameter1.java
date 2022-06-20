package testNg1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter1 {
	WebDriver driver;
  @Parameters("browser")
  @BeforeTest
  
  public void browesr(String type) {
	  if(type.equals("chrome")) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\automisation lecture\\selenium\\chromeDriver\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://vctcpune.com/selenium/practice.html");
		 
	  }
	  else if(type.equals("firefox")) {
		  System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\Desktop\\automisation lecture\\selenium\\gickodriver\\geckodriver.exe");
		  driver=new FirefoxDriver();
	      driver.manage().window().maximize();
	      driver.get("https://vctcpune.com/selenium/practice.html");
		  }
  }
  @Test
  public void Test1() {
	 String actTitle=driver.getTitle();
	 String requiredTitle="Practice Page";
	 Assert.assertEquals(actTitle,requiredTitle);
  }
  @AfterTest
  public void afterTest() {
	  driver.quit();
  }
}
