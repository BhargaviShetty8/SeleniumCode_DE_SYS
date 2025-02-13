package com.BaseTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.Util.TestUtil;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream fp = new FileInputStream("C:\\Users\\Division Office Tech\\eclipse-workspace\\MiniProject_ATS\\src\\main\\java\\com\\config\\config.properties");
			prop.load(fp);			
		}catch (FileNotFoundException  e){
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	 public static void init() {
		 String browser = prop.getProperty("browser");
		 if(browser.equals("chrome")) {
			 driver= new ChromeDriver();
		 }
		 if(browser.equals("ff")) {
			 driver= new FirefoxDriver();
		 }
		 if(browser.equals("Edge")) {
			 driver= new EdgeDriver();
		 }
		 
		 
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.Page_Load_timeOut));
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.Implicit_wait));
		 driver.get(prop.getProperty("url"));
		 
		 
		 
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
