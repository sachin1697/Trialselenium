package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubWindowScrolling {
	public static void m2() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\automisation lecture\\selenium\\chromeDriver\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://vctcpune.com/selenium/practice.html");
	   
	   
	   JavascriptExecutor sc0=(JavascriptExecutor)driver;
	   sc0.executeScript("window.scroll(0,3000)");
	   WebElement subwindow=driver.findElement(By.xpath("//iframe[@id='courses-iframe']"));
	   driver.switchTo().frame(subwindow);
	   
	   JavascriptExecutor sc=(JavascriptExecutor)driver;
	   sc.executeScript("window.scroll(0,3000)");
	}
	public static void main(String[]args) {
		m2();
	}
	}
