package selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S2 {
    public static void main(String[]args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\automisation lecture\\selenium\\chromeDriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://vctcpune.com/selenium/practice.html");
        JavascriptExecutor ja=(JavascriptExecutor)driver;
        Thread.sleep(3000);
        ja.executeScript("window.scrollBy(0,500)");
        List<WebElement> option=driver.findElements(By.cssSelector("input[type='checkbox']"));
        Thread.sleep(2000);
        for(WebElement options:option) {
        	options.click();
        }
    }
}
