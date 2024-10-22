package com.practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Inheritance extends Google {
	
	public void drive() {
		driver.get("https://tgnpdcl.in");
		System.out.println("Inherit driver");
	}
	public void search() {
		driver = new ChromeDriver();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		System.out.println("child Class ----------Search");
	}
	
	public void login() {
		driver = new EdgeDriver();
		driver.get("https://gmail.com");
		System.out.println("child Class ----------Login");
	}

	public static void main(String[] args) {
		
		Google g = new Inheritance();
		g.login();
		g.search();
		

	}

}
