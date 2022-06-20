package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	public static void m3() throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\automisation lecture\\selenium\\chromeDriver\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demoqa.com/buttons");
    
    WebElement doubleClick=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
    
    Actions act=new Actions(driver);
    act.doubleClick(doubleClick).perform();
    Thread.sleep(2000);
    String doubleClickText=driver.findElement(By.xpath("//p[@id='doubleClickMessage']")).getText();
    if(doubleClickText.contains("double click")) {
    	System.out.println(doubleClickText);
    }
	} 
	public static void main(String[]args) throws InterruptedException {
		m3();
	}
}
