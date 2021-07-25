package App;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass
{
	WebDriver driver;
	@BeforeMethod
	
	public void setupApplication()
	{
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://affiliate.flipkart.com/login");
		
	}
	
@AfterMethod
	
	public void closeApplication()
	{
		driver.quit();
			
	} 
	


}
