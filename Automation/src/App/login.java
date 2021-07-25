package App; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class login
{
	WebDriver driver;
	@BeforeMethod
	
	public void setupApplication()
	{
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://affiliate.flipkart.com/login");
		
	}
	
	@Test
public void loginToApplication()

{
	
    
    driver.findElement(By.name("email")).sendKeys("kavya.d");
    driver.findElement(By.id("inputPassword")).sendKeys("kavya.d");
    driver.findElement(By.id("btn btn-default")).click();
    driver.quit();
  }
	@AfterMethod
	
	public void closeApplication()
	{
		driver.quit();
		
		
		
	} 
	

}
