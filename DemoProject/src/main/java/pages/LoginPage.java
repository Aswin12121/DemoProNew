package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtilities;

public class LoginPage {
	@FindBy(name="username") WebElement username;
	@FindBy(xpath="//input[@ name='password']") WebElement password;
	@FindBy(xpath="//button[text()='Sign In']") WebElement signin;
	@FindBy(xpath="//p[text()='Dashboard']") WebElement dashboard;
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']") WebElement alert;
	public WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterTheUsename(String username2)
	{
		username.sendKeys(username2);
	}
	public void enterThePassowrd(String password2)
	{
		password.sendKeys(password2);
	}
	public void clickSignin()
	{

		signin.click();
	}
	public boolean isHomePageDisplayed()
	{
		return dashboard.isDisplayed();
	}
	public boolean isAlertDisplayed()
	{
		return alert.isDisplayed();
		
	}
}
