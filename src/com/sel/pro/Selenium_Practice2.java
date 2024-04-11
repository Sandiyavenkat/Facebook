package com.sel.pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Practice2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandhiya venkat\\eclipse-workspace\\Selenium_Concept\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.saucedemo.com/v1/");
	driver.manage().window().maximize();
	
    driver.findElement(By.className("form_input")).sendKeys("standard_user");
    driver.findElement(By.name("password")).sendKeys("secret_sauce");
	driver.findElement(By.id("login-button")).click();
	
	driver.findElement(By.xpath("(//button[@class='btn_primary btn_inventory'])[1]")).click();	
	
	driver.findElement(By.id("shopping_cart_container")).click();
	driver.findElement(By.xpath("//a[@class='btn_action checkout_button']")).click();
	driver.findElement(By.id("first-name")).sendKeys("Samitha");
	driver.findElement(By.id("last-name")).sendKeys("venkat");
	driver.findElement(By.id("postal-code")).sendKeys("600094");
	driver.findElement(By.xpath("//a[@class='cart_cancel_link btn_secondary']")).click();
	driver.findElement(By.xpath("//a[@class='btn_action checkout_button']")).click();
	driver.findElement(By.id("first-name")).sendKeys("sandhiya");
	driver.findElement(By.id("last-name")).sendKeys("vinoth");
	driver.findElement(By.id("postal-code")).sendKeys("143");
	driver.findElement(By.xpath("//input[@class='btn_primary cart_button']")).click();
	driver.findElement(By.xpath("//a[@class='btn_action cart_button']")).click();
	
}
}
