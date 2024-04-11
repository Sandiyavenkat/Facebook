package com.sel.pro;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waits {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandhiya venkat\\eclipse-workspace\\Selenium_Concept\\Driver\\chromedriver.exe");
    
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
	driver.manage().window().maximize();
	

	//implicit waits()
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
	
	Thread.sleep(1000);
    WebElement Textbox1 = driver.findElement(By.id("btn1"));
    Textbox1.click();
    
    
    
    
	
	
	
	
	
}
}
