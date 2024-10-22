package com.QL.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.QL.util.TestUtil;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase (){
		
		try {
			prop = new Properties();
			FileInputStream fp = new FileInputStream("C:\\Users\\Division Office Tech\\eclipse-workspace\\QUICKLINKSTest\\src\\main\\java\\com\\QL\\config\\config.properties");
			prop.load(fp);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public static void initialization() {
		String browserName = prop.getProperty("browser");
		if((browserName.equals("chrome"))){
			driver = new ChromeDriver();
		}
		if((browserName.equals("firefox"))){
			driver = new FirefoxDriver();
		}
		if((browserName.equals("Edge"))){
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.Page_Load_TimeOut));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.Implicit_Wait));
		
		driver.get(prop.getProperty("url"));
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}

