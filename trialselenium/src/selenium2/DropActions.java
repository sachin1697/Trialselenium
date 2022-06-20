package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropActions {
	public static void m2() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\automisation lecture\\selenium\\chromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
		
		//step 1 scroll window
		JavascriptExecutor sc=(JavascriptExecutor)driver;
		sc.executeScript("window.scrollBy(0,100)");

		//Step 2 A Switch driver on ifream
		WebElement frame=driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(frame);

		//step 2 B select element
		WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		
		//step 3 A action class
		Actions act=new Actions(driver);
		act.dragAndDropBy(drag,100,100).perform();

		Thread.sleep(4000);
		driver.quit();


	}
	public static void main(String[]args) throws InterruptedException{
		m2();
	}
}
