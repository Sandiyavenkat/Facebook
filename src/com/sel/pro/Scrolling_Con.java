package com.sel.pro;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_Con {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandhiya venkat\\eclipse-workspace\\Selenium_Concept\\Driver\\chromedriver.exe" );
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();

	
	//WebElement ScrollDown = driver.findElement(By.xpath("//a[@href='/helpcentre?otracker=${otracker}_navlinks']"));
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("arguments[0].scrollIntoView", ScrollDown);
	
	//randomscroll-pixelscroll
	js.executeScript("window.scrollBy(0,1000)");
	
	
	
	
}
}
