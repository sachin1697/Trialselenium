package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trial3 {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\automisation lecture\\selenium\\chromeDriver\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.navigate().to("https://www.swiggy.com/?utm_source=Google-Sok&utm_medium=CPC&utm_campaign=google_search_sok_food_na_narm_order_web_m_web_clubbedcities_neev_competitor_newuser_v1_v2_zomato_em&gclid=CjwKCAjw682TBhATEiwA9crl3yeELRTflRkppUN8SB-dmaQW9jOLUoFbM_wmiNEjHPq4kP6G2kgi3xoCjLQQAvD_BwE");
	  Thread.sleep(2000);
	  
	  System.out.println(driver.getCurrentUrl());
	String a="https://www.swiggy.com/?utm_source=Google-Sok&utm_medium=CPC&utm_campaign=google_search_sok_food_na_narm_order_web_m_web_clubbedcities_neev_competitor_newuser_v1_v2_zomato_em&gclid=CjwKCAjw682TBhATEiwA9crl3yeELRTflRkppUN8SB-dmaQW9jOLUoFbM_wmiNEjHPq4kP6G2kgi3xoCjLQQAvD_BwE";
	String b=driver.getCurrentUrl();
	if(a.equals(b)) {
		System.out.println("given url is correct");
	}
	else {
		System.out.println("given url is not correct");
	}
	
	 //driver.close();
	}
}
