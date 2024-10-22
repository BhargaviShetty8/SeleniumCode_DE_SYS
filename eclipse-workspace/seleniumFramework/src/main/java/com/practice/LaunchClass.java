package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver =new EdgeDriver();
		
		
		driver.get("https://google.com");
	}

}
