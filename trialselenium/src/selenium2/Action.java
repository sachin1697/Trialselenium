package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {
	public static void m1() throws InterruptedException {
  System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\automisation lecture\\selenium\\chromeDriver\\chromedriver.exe");
  WebDriver driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.navigate().to("https://demoqa.com/buttons");
  
  //step 1A action class object
  Actions act=new Actions(driver);
  
  //step 1B
  WebElement singleClick=driver.findElement(By.xpath("//button[text()='Click Me']"));
  act.moveToElement(singleClick).click().perform();
  
  String singleClickText=driver.findElement(By.xpath("//p[@id='dynamicClickMessage']")).getText();
  
  if(singleClickText.contains("dynamic click")) {
	  System.out.println(singleClickText);
  }
  
  
  WebElement rightClick=driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
  act.contextClick(rightClick).perform();
  
  String rightClickText=driver.findElement(By.xpath("//p[@id='rightClickMessage']")).getText();
  
  if(rightClickText.contains("right click")) {
	  System.out.println(rightClickText);
  }
  
  Thread.sleep(4000);
  driver.close();
}
	public static void main(String[]args) throws InterruptedException {
		m1();
	}
}