package selenium1;

import java.util.List;	

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop {
   public static void m1() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\automisation lecture\\selenium\\chromeDriver\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.navigate().to("https://demoqa.com/select-menu");
	//step-4 identify dropdown and click on drop
			WebElement drop=driver.findElement(By.id("oldSelectMenu"));
			//drop.click();
			Thread.sleep(2000);
			
			//step-5 using select class we will handle dropdown
			Select sel=new Select(drop);
			
			//sel.selectByIndex(4);
			//sel.selectByVisibleText("Indigo");
			
			List<WebElement> dropValues=sel.getOptions();
			
			for (WebElement ele:dropValues) {
				
				String val=ele.getText();
				
				if (val.equalsIgnoreCase("Voilet")) {
					
					ele.click();
				}
				System.out.println(val);
			}
			
			
			
			//step-6
			driver.close();
}
	public static void main(String[]args) throws InterruptedException {
		m1();
	}
}