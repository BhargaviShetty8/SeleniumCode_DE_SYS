package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Google {

	static WebDriver driver;
	public void search() {
		driver = new ChromeDriver();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
	}
	
	public void login() {
		driver = new EdgeDriver();
		driver.get("https://gmail.com");
	}
		
//	public static void main(String[] args) {
//		Google G = new Google();
//		G.search();
//		G.login();
//		
//		
//	}

}
