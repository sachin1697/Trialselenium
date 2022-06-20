package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
	 public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\automisation lecture\\selenium\\chromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/login/");
		Thread.sleep(2000);
		WebElement b=driver.findElement(By.name("email"));
		b.sendKeys("sachinkadam010697@gmail.com");
		Thread.sleep(2000);
		WebElement c=driver.findElement(By.id("pass"));
		c.sendKeys("12345678");
	    Thread.sleep(2000);
		WebElement a=driver.findElement(By.tagName("button"));
		a.click();
		Thread.sleep(6000);
        driver.close();
        
	 }
}
