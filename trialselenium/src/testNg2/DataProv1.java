package testNg2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import excelData.DataAquire;

public class DataProv1 {
WebDriver driver;
String email;
String pass;	
	@BeforeTest
	public void initBrowser() {
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\automisation lecture\\selenium\\chromeDriver\\chromedriver.exe");
		
		//step-1 Launch browser
	   driver=new ChromeDriver();
		
		//Step-2 Maximize window
		driver.manage().window().maximize();
		
		//step-3
		driver.get("https://www.facebook.com/");	
	}
	
  @Test (dataProvider="testData")
  public void login(String user, String pass) throws InterruptedException {
	  
	//Step-1 Enter username
	  WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
	  username.sendKeys(user);
	  Thread.sleep(2000);
	  //step-2 enter pass
	  driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pass);
	  Thread.sleep(2000);
	  //step-3 click on button 
	  driver.findElement(By.xpath("//button[@name='login']")).click();
	  Thread.sleep(2000);
	  //step-4 go back
	  driver.navigate().back();
	  Thread.sleep(4000);
	  //step-5 clear username
	 driver.findElement(By.xpath("//input[@id='email']")).clear();
	  Thread.sleep(2000);
	  
  }
  
  @DataProvider(name="testData")
  public String [][] getData() throws IOException {
	  
	  int a=1;
	  int b=2;
	  int c=2;
	  while(c<4) {
		  email=DataAquire.m1(c, a);
		  pass=DataAquire.m1(c,b);
	  }
	
	  String [][]data= {{email, pass}};
	  
	
	  
	  return data;
  }
  
  @AfterTest
  public void tearDown() throws InterruptedException {
	  Thread.sleep(5000);
	  driver.close();
  }
}
