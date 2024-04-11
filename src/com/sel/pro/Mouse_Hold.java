package com.sel.pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hold {

	public static void main(String[] args) {
		
  System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandhiya venkat\\eclipse-workspace\\Selenium_Concept\\Driver\\chromedriver.exe");
		
  WebDriver driver = new ChromeDriver();
  
  driver.get("https://www.flipkart.com/");
  driver.manage().window().maximize();
  
  WebElement element = driver.findElement(By.xpath("//div[@class='H6-NpN _3N4_BX']"));
  
  Actions fk = new Actions(driver);
  fk.moveToElement(element).perform();
  
		
		
	}
}
