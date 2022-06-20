package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
     public static void main(String[]args) throws InterruptedException {
    	 System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\Desktop\\automisation lecture\\selenium\\gickodriver\\geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
	     driver.manage().window().maximize();
	     driver.get("https://vctcpune.com/selenium/practice.html");
	     Thread.sleep(2000);
	     driver.quit();
     }
}
