package App;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class login2 extends BaseClass
{
	@Test 
	public void loginToApplication()
	{
		    driver.findElement(By.name("email")).sendKeys("kavya.d");
		    driver.findElement(By.id("inputPassword")).sendKeys("kavya.d");
		    driver.findElement(By.id("btn btn-default")).click();
		    driver.quit();
	}
	
}
