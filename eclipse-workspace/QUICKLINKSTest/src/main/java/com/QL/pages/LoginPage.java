package com.QL.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.QL.Base.TestBase;

public class LoginPage extends TestBase{

	
	
	//Page Factory -OR:
	
	@FindBy(name="userName")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	 
	@FindBy(xpath ="//input[@type='submit']")
	WebElement LoginButton;

	@FindBy (xpath= "//div[@id='header']")
	WebElement ATSLogo;
	
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String validatePageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateLogo() {
		return ATSLogo.isDisplayed();
	}
	public HomePage login(String user, String Pwd) {
		
		username.sendKeys(user);
		password.sendKeys(Pwd);
		LoginButton.click();
		return new HomePage(driver);
		
		
		
		
		
	}
}
