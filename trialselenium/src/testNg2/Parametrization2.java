package testNg2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametrization2 {
 WebDriver driver;
 @Parameters("integer")
 
 @Test
 public void test2(int x) {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\automisation lecture\\selenium\\chromeDriver\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.youtube.com/");
	 if(x==2) {
		 driver.findElement(By.xpath("//input[@id='search']")).sendKeys("mock interview video ");
	 }
	 else if(x==1) {
		  driver.findElement(By.xpath("//input[@id='search']")).sendKeys("https://youtu.be/I9cBAa6S_OU");
	 }
	 
 }
 @Test
 public void test2() {
	 driver.quit();
 }
}
