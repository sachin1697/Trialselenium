package selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date {
	
	public static void m1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\automisation lecture\\selenium\\chromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://jqueryui.com/datepicker/");
		
		//step 1 scroll
		//JavascriptExecutor ja=(JavascriptExecutor)driver;
		//ja.executeScript("window.scroll(0,700)");
		 Thread.sleep(2000);
		  
		// List<WebElement> frames=driver.findElements(By.tagName("iframe"));
		
		  
		 WebElement frame1=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		 driver.switchTo().frame(frame1);
		 
		 driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		 
		 //boolean s=true;
		while(true) {
			
			String actualText=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			WebElement date=driver.findElement(By.xpath("//a[@title='Prev']"));
			if(!actualText.equalsIgnoreCase("May 2021")) {
				date.click();
			}
			else {
				//dete.click();
				break;
				
			}
		}
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a[@data-date='2']")).click();
	}

	public static void main(String[] args) throws InterruptedException {
		m1();
	}

}
