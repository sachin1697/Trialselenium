package testNg1;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestNG1 {
	WebDriver driver;
	@BeforeMethod
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\automisation lecture\\selenium\\chromeDriver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  //driver.manage().deleteAllCookies();
	  driver.get("https://www.facebook.com/");
	  Thread.sleep(3000);
	
	   }
	
	 @Test(priority=1,groups="status of checkbox")
	  public  void verifyUsernameTexboxTest() throws InterruptedException {
		
		  
		WebElement  username=driver.findElement(By.xpath("//input[@name='email']"));
		 username.sendKeys("suraj1234@Gmail");
		 
		  
		  }
	  @Test(priority=2,groups="status of checkbox")
	  public void verifyHightandWidthTest() {
			WebElement  username=driver.findElement(By.xpath("//input[@name='email']"));
	   
		Rectangle userRect=username.getRect();
		System.out.println("username text box hight"+userRect.getHeight());
		System.out.println("username text box width"+userRect.getWidth());}

	
  @Test(priority=3,groups="check hight of textbox")
  public void hightOfUsernameTextboxTest() {
	  
	  WebElement  username=driver.findElement(By.xpath("//input[@name='email']"));
	   
		Rectangle userRect=username.getRect();
		System.out.println("username textbox hight"+userRect.getHeight());
}
  @Test(priority=4,groups="check hight of textbox")
  public void hightOfPasswordTextboxTest() {
	  WebElement  password=driver.findElement(By.xpath("//input[@name='pass']"));

	  Rectangle passRect=password.getRect();
		System.out.println("password textbox hight="+passRect.getHeight());
	  
	  }
  @Test(priority=5,groups="check hight of textbox")
  public void hightOfloginButtonTest() {
	  
	  WebElement  login=driver.findElement(By.name("login"));

	  Rectangle loginRect=login.getRect();
		System.out.println("loginbutton textbox hight="+loginRect.getHeight());
	  
	  
  }
  
  @AfterMethod
  public void tearDown() {
	 
	  driver.quit();
  }
}
