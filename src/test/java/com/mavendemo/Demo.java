package com.mavendemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {
//public static void main(String[] args) {
//	
//}
	WebDriver driver;

	@Test
	public void LaunchBrowser() {

		driver = new ChromeDriver();
		driver.get("https://www.ebay.com");

	}

	@Test
	public void Input() {

		driver.findElement(By.id("gh-ac")).sendKeys("Naku istamocindi");

	}

	@Test
	public void Button() {

		driver.findElement(By.id("gh-btn")).click();

	}

}

class Facebook {
	WebDriver driver;

	@Test
	public void LaunchBrowser() {

		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");

	}
	

	@Test
	public void credentialsValidation() {

		driver.findElement(By.id("email")).sendKeys("jksddk");
		driver.findElement(By.id("pass")).sendKeys("jksddk");
		
		
		
		

	}
}
