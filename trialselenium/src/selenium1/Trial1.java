package selenium1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Trial1 {
    public static void main(String[]args) throws InterruptedException {
    	 System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\Desktop\\automisation lecture\\selenium\\gickodriver\\geckodriver.exe");
   	  WebDriver driver=new FirefoxDriver();
   	  driver.manage().window().maximize();
   	  driver.get("https://www.facebook.com/");
    	
   	 //driver.close();
}
}
