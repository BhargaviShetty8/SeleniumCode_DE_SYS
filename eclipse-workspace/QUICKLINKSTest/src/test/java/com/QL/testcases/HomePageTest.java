package com.QL.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.QL.Base.TestBase;
import com.QL.pages.HomePage;
import com.QL.pages.LoginPage;

public class HomePageTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	public HomePageTest() {
		super();
		
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage(driver);
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test
	public void verifyTitleTest() {
		String title = homePage.verifyPageTitle();
		System.out.println("title---------" + title);
		Assert.assertEquals(title, "Login");
	}
	
	@Test
	public void verifyReports() {
		homePage.ClickOnReports();
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"ResultForm\"]/input[7]")), true);
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	
	
}
