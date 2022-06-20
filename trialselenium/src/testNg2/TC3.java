package testNg2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testNg2.ImplementingClass.class)
public class TC3 {
public static  WebDriver driver;
	
	@BeforeSuite
	public void initBrowser() throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\automisation lecture\\selenium\\chromeDriver\\chromedriver.exe");
		
		//step-1 Launch browser
	   driver=new ChromeDriver();
		
		//Step-2 Maximize window
		driver.manage().window().maximize();
		
		//step-3
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
	}	
	
  @Test 
  public void verifyURL () {
	  String actUrl=driver.getCurrentUrl();
	  System.out.println(actUrl);
	  String expUrl="https://www.fok.com/";
	Assert.assertEquals(actUrl,expUrl);
  } 
  
  @Test 
  public void verifytitle() {
	  
	  String actTile=driver.getTitle();
	  System.out.println(actTile);
	  String expTitle="Facebook";
	  
	  Assert.assertEquals(actTile,expTitle);
	
  }
  
  @Test 
  public void verifyPage() {
	 
	  System.out.println("TC verifyPageo from TC3");
	 
  }
  
  @AfterClass
  public void tearDown() {
	  
	  driver.close();
  }
}
