package com.QL.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.QL.Base.TestBase;
import com.QL.pages.HomePage;
import com.QL.pages.LoginPage;

public class LoginPageTest extends TestBase {

	
	LoginPage loginPage;
	HomePage homePage;
	
	LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginPage  = new LoginPage(driver);
		
	}
	
	@Test
	public void LoginTitleTest() {
		String title = loginPage.validatePageTitle();
		System.out.println("title:-----------" + title);
		Assert.assertEquals(title, "Login");
	}
	
	@Test
	public void LoginLogoTest() {
		boolean flag = loginPage.validateLogo();
		Assert.assertTrue(flag);
	}
	
	@Test
	public void loginTest() {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
				
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
}
