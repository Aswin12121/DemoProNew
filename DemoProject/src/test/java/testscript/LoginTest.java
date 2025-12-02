package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtilities;

public class LoginTest extends Base {
	@Test (groups= {"regression"},retryAnalyzer=retry.Retry.class)
	public void verifyTheUserIsAbleToLoginUsingValidCredentials() throws IOException
	{
//		String username="admin";
//		String password="admin";
		String username= ExcelUtilities.getStringData(1, 0, "loginpage");
		String password= ExcelUtilities.getStringData(1, 1, "loginpage");
		LoginPage loginpage= new LoginPage(driver);
		loginpage.enterTheUsename(username);
		loginpage.enterThePassowrd(password);
		loginpage.clickSignin();
		boolean homepage=loginpage.isHomePageDisplayed();
		Assert.assertTrue(homepage);
		
	}
	@Test
	public void verifyTheUserIsAbleToLoginUsingCorrectUsernameAndInCorrectPassword() throws IOException
	{
		String username="admin";
     	String password="hello";
//		String username= ExcelUtilities.getStringData(2, 0, "loginpage");
//		String password= ExcelUtilities.getStringData(2, 1, "loginpage");
		LoginPage loginpage= new LoginPage(driver);
		loginpage.enterTheUsename(username);
		loginpage.enterThePassowrd(password);
		loginpage.clickSignin();
		boolean alert=loginpage.isAlertDisplayed();
		Assert.assertTrue(alert);
	}
	@Test
	public void verifyTheUserIsAbleToLoginUsingIncorrectUsernameAndCorrectPassword() throws IOException
	{
		String username="hello";
     	String password="admin";
//		String username= ExcelUtilities.getStringData(3, 0, "loginpage");
//		String password= ExcelUtilities.getStringData(3, 1, "loginpage");
		LoginPage loginpage= new LoginPage(driver);
		loginpage.enterTheUsename(username);
		loginpage.enterThePassowrd(password);
		loginpage.clickSignin();
		boolean alert=loginpage.isAlertDisplayed();
		Assert.assertTrue(alert);
	}
	@Test
	public void verifyTheUserIsAbleToLoginUsingIncorrectUsernameAndIncorrectPassword() throws IOException
	{
		String username="hello";
     	String password="hello";
//		String username= ExcelUtilities.getStringData(4, 0, "loginpage");
//		String password= ExcelUtilities.getStringData(4, 1, "loginpage");
		LoginPage loginpage= new LoginPage(driver);
		loginpage.enterTheUsename(username);
		loginpage.enterThePassowrd(password);
		loginpage.clickSignin();
		boolean alert=loginpage.isAlertDisplayed();
		Assert.assertTrue(alert);
	}
	

}
