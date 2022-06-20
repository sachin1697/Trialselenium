package testNg2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametrization1 {
   WebDriver driver;
   @Parameters("declesr")
   @BeforeTest
   public void parameters(String video) {
	   if(video.equals("video2")) {
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\automisation lecture\\selenium\\chromeDriver\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.navigate().to("https://www.youtube.com/");
		  
			  driver.findElement(By.xpath("//input[@id='search']")).sendKeys("https://youtu.be/I9cBAa6S_OU");
		  
		 
		  }
	   else if(video.equals("video1")) {
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\automisation lecture\\selenium\\chromeDriver\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.navigate().to("https://www.youtube.com/");
		  
			  driver.findElement(By.xpath("//input[@id='search']")).sendKeys("mock interview video ");
		  
		 
		  }
	   
   }
   @Test
   public void test1 () {
	   System.out.println("test case is run");
   }
}
