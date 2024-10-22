package com.QL.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

WebDriver driver;

	

	@FindBy(xpath = "//*[@id=\"home\"]/p[1]/a/font")
	WebElement clickHereText;
	
	@FindBy(xpath ="//a[contains(text(), 'Logout(NPDCL)')]")
	WebElement LogOutButton;
	
	@FindBy(xpath = "//a[contains(text(), 'Reports')]")
	WebElement Reports;
	
	@FindBy (xpath = "//a[contains(text(), 'Voltage & Load Wise  Abstract')]")
	WebElement VoltageAndLoadAbstract;
	
	@FindBy (xpath = "//a[contains(text(), 'DTR')]")
	WebElement DTR_Button;
	
	@FindBy (xpath = "//a[contains(text(), '33')]")
	WebElement Feeder33KV;
	
	@FindBy (xpath = "//a[contains(text(), 'Max/Min Load/Voltage List')]")
	WebElement MaxLoad;
	
	public HomePage(WebDriver driver) {
	    this.driver = driver;
	    PageFactory.initElements(driver, this);
	}
	
	public String verifyPageTitle() {
		return driver.getTitle();
	}
	
	public ReportsPage ClickOnReports() {
		Actions action = new Actions(driver);
		action.moveToElement(Reports).build().perform();
		VoltageAndLoadAbstract.click();
		return new ReportsPage(driver);
	}
	
	public Feeder_33KVPage ClickOn33KV() {
		Select select = new Select(Feeder33KV);
		MaxLoad.click();
		return new Feeder_33KVPage();
	}
	
	public void LogOutCheck() {
		LogOutButton.click();
	}
	
	
	
	
	
	
}