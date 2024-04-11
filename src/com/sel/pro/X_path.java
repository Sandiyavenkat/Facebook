package com.sel.pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_path {
 public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandhiya venkat\\eclipse-workspace\\Selenium_Concept\\Driver\\chromedriver.exe");

	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.instagram.com/accounts/login/");
	
	Thread.sleep(2000);
	WebElement element = driver.findElement(By.name("username"));
	element.sendKeys("Sandiya sonu");

	Thread.sleep(2000);
	WebElement element1 = driver.findElement(By.name("password"));
	element1.sendKeys("Sai@2023");
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	
	
	
	
	
	
	
	
	
}	
}
