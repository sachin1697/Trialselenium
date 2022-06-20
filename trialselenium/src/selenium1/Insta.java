package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\automisation lecture\\selenium\\chromeDriver\\chromedriver.exe");
	 WebDriver d2=new ChromeDriver();
	 d2.navigate().to("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjUyMzIwNTY2LCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
	 d2.manage().window().minimize();
	 WebElement ref=d2.findElement(By.id("email"));
	 ref.sendKeys("8956329626");
	 Thread.sleep(3000);
	 WebElement ref2=d2.findElement(By.partialLinkText("Forgotten account?"));
	 ref2.click();
	 Thread.sleep(5000);
	 //ref=d2.findElement(By.xpath("//*[@id=\"u_0_j_1m\"]"));
	 //ref.sendKeys("kadam");
	 //Thread.sleep(3000);
	// d2.close();
	//*[@id="u_0_j_1m"]
	}

}
