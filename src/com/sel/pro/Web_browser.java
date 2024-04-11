package com.sel.pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Web_browser {

	public static void main(String[] args) throws InterruptedException  {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandhiya venkat\\eclipse-workspace\\Selenium_Concept\\Driver\\chromedriver.exe" );
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	
		
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
	
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//select[@title='Day']"));
	    
		
	
		Select s = new Select(element);
		s.selectByIndex(0);
		
		WebElement element2 = driver.findElement(By.id("month"));
		Select s1 = new Select(element2);
		s1.selectByVisibleText("May");
		
		WebElement element3 = driver.findElement(By.id("year"));
		Select s3 = new Select(element3);
		s3.selectByValue("2016");
		
		
		
		
		
	}
	
}
