package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends Base {
	@Test
	public void loginPage()
	{
		String username="admin";
		String password="admin";
		WebElement uname=driver.findElement(By.name("username"));
		uname.sendKeys(username);
		WebElement pss=driver.findElement(By.name("password"));
		pss.sendKeys(password);
		WebElement signin= driver.findElement(By.xpath("//button[text()='Sign In']"));
		signin.click();
		//Assertion for correct validation of Login page
		WebElement dashboard= driver.findElement(By.xpath("//p[text()='Dashboard']"));
		boolean ishomepagedisplayed= dashboard.isDisplayed();
		Assert.assertTrue(ishomepagedisplayed);
	}
	@Test
	public void incorrectLogin()//incorrect username and password
	{
		String username="aswin";
		String password="aswin";
		WebElement uname=driver.findElement(By.name("username"));
		uname.sendKeys(username);
		WebElement pss= driver.findElement(By.name("password"));
		pss.sendKeys(password);
		WebElement signin= driver.findElement(By.xpath("//button[text()='Sign In']"));
		signin.click();
		WebElement alert= driver.findElement(By.className("alert alert-danger alert-dismissible"));
		boolean isalertdisplayed= alert.isDisplayed();
		Assert.assertTrue(isalertdisplayed);
	}
	@Test
	public  void incorrectUsername()
	{
		String username="aswin";
		String password="admin";
		WebElement uname=driver.findElement(By.name("username"));
		uname.sendKeys(username);
		WebElement pss= driver.findElement(By.name("password"));
		pss.sendKeys(password);
		WebElement signin= driver.findElement(By.xpath("//button[text()='Sign In']"));
		signin.click();
		WebElement alert1= driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
		boolean isalertdisplayed=alert1.isDisplayed();
		Assert.assertTrue(isalertdisplayed);
	}
	@Test
	public void incorrectPassword() 
	{
		String username="admin";
		String password= "aswin";
		WebElement uname= driver.findElement(By.name("username"));
		uname.sendKeys(username);
		WebElement pss= driver.findElement(By.name("password"));
		pss.sendKeys(password);
		WebElement signin= driver.findElement(By.xpath("//button[text()='Sign In']"));
		signin.click();
		WebElement alert2=driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
		boolean isalertdisplaued= alert2.isDisplayed();
		Assert.assertTrue(isalertdisplaued);
		
		
	}

}
