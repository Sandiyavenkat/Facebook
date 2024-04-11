package com.sel.pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down {

	public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandhiya venkat\\eclipse-workspace\\Selenium_Concept\\Driver\\chromedriver.exe");
	 
     WebDriver driver = new ChromeDriver();
	 
	 driver.get("https://www.facebook.com/");
	 driver.manage().window().maximize();
	 
	 
	 
	  driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	  
	  Thread.sleep(2000);
	   WebElement element = driver.findElement(By.xpath("//select[@title='Day']"));
	  
	   Select a = new Select(element);
	   a.selectByIndex(5);
	  
	   Thread.sleep(2000);
	   WebElement element2 = driver.findElement(By.id("month"));
	   Select b = new Select(element2); 
	   b.selectByVisibleText("Aug");
	   
	   Thread.sleep(2000);
	   WebElement element3 = driver.findElement(By.id("year"));
	   Select c =new Select(element3);
	   c.selectByValue("1998");
	 
	 
	 
	}
}
