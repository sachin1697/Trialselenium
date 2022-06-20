package selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trial2 {
	public static void main(String[]args) throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\automisation lecture\\selenium\\chromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		List<WebElement> frame=driver.findElements(By.xpath("ifme"));
		for(WebElement ele:frame) {
			System.out.println(frame.size());
		}
		
		
	}

}
