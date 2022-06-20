package selenium2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubWindow2 {
	public static void method() throws InterruptedException{
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\automisation lecture\\selenium\\chromeDriver\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://vctcpune.com/selenium/practice.html");
	    

	    JavascriptExecutor ss=(JavascriptExecutor)driver;
	    ss.executeScript("window.scroll(0,700)");
	     
	    Thread.sleep(2000);
	    String url="https://www.google.com/";
	    
	    String parentTab=driver.getWindowHandle();

	    Thread.sleep(2000);
	    driver.switchTo().newWindow(WindowType.TAB);
	    driver.get(url);
	  
	    Thread.sleep(2000);
	    driver.switchTo().window(parentTab);
	    driver.quit();

	}
	  public static void main(String[]args) throws InterruptedException{
	  method();
	}
}
