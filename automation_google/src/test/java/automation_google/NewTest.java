package automation_google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
	

	@BeforeMethod
	public void inital() {
		System.setProperty("webdriver.chrome.driver", "/Users/sumamoni/Downloads/chromedriver");
		driver = new ChromeDriver();	
	}
	
  @Test
  public void googleopentest() {
	  driver.get("https://www.google.com");
	  driver.manage().window().maximize();
	  System.out.println(driver.getTitle());
	  }
	  
  
  @AfterMethod
  public void teardown() {
	  driver.quit();
	  
  }
  
}
