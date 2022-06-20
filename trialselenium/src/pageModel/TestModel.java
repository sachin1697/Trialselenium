package pageModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestModel  {
  
WebDriver driver;
  PageModel PMobj;
  @BeforeTest
  public void lounchBrowser() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\automisation lecture\\selenium\\chromeDriver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/login/");
	  
  }
  @BeforeClass
  public void Initilizeobj() {
	  PMobj=new PageModel(driver);
  }
  
  @Test
  public void dataprovider() {
	  String mail="sachin123@gmail.com";
	  String cod="123456";
	  PMobj.insertData(mail, cod);
  }
  @Test
  public void newpass() {
	 PMobj.forgottePass();
	  System.out.println(driver.getTitle());
  }
  @AfterMethod
  public void back() {
	  driver.navigate().back();
	  driver.navigate().refresh();
  }
  
}
