package selenium2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sub {
    public static void m1() {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\automisation lecture\\selenium\\chromeDriver\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://vctcpune.com/selenium/practice.html");
    	
    	//step 1 getWindowHandle method
    	String tab0=driver.getWindowHandle();
        System.out.println(driver.getTitle( ));
        
        WebElement newtab=driver.findElement(By.cssSelector("a[id='opentab']"));
        newtab.click();
        
        Set<String> tab1=driver.getWindowHandles();
        for(String ele:tab1) {
        	driver.switchTo().window(ele);
        	System.out.println(driver.getTitle());
        }
        
        
        driver.switchTo().window(tab0);
        driver.quit();
    }
    public static void main(String[]args) {
    	m1();
    }
}
