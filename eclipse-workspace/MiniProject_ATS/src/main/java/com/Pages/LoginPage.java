package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseTest.TestBase;

public class LoginPage extends TestBase{

	
	@FindBy(name="userName")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	 
	@FindBy(xpath ="//input[@type='submit']")
	WebElement LoginButton;
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public HomePage login(String id, String pwd) {
		username.sendKeys(id);
		password.sendKeys(pwd);
		LoginButton.click();
		return new HomePage();
	}
	
	
	
}
