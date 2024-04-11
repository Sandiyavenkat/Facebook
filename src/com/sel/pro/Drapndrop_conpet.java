package com.sel.pro;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drapndrop_conpet {
 public static void main(String[] args) {
	
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandhiya venkat\\eclipse-workspace\\Selenium_Concept\\Driver\\chromedriver.exe");
	 
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://demo.automationtesting.in/Static.html");
	 driver.manage().window().maximize();
	 
	 WebElement source = driver.findElement(By.id("angular"));
	 
	 WebElement target = driver.findElement(By.id("droparea"));
	 
	 Actions sa = new Actions(driver);
	 sa.dragAndDrop(source, target).perform();
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
}
