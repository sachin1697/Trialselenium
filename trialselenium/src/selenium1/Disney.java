package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disney {
   public static void main(String[]args) throws InterruptedException {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\automisation lecture\\selenium\\chromeDriver\\chromedriver.exe");
	  WebDriver obj1=new ChromeDriver();
	  obj1.manage().window().maximize();
	  obj1.get("https://www.hotstar.com/in");
	  obj1.navigate().refresh();
	  Thread.sleep(3000);
	  WebElement E=obj1.findElement(By.id("searchField"));
	  E.sendKeys("Mahabharat");
	  Thread.sleep(3000);
	  WebElement F=obj1.findElement(By.className("search-wrap"));
	  F.click();
	  Thread.sleep(2000);
	  WebElement G=obj1.findElement(By.className("cover-link"));
	  G.click();
	  Thread.sleep(20000);
	  WebElement H=obj1.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[1]/div/div[1]/div[8]/div/div[2]/div/div"));
	  H.click();
	  H.click();
	  //Thread.sleep(6000);
	  //obj1.close();
   }
}
    