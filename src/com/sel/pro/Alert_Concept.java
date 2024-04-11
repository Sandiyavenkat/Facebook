package com.sel.pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Concept {
	
	
	
	public static void main(String[] args) throws InterruptedException {
			
System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandhiya venkat\\eclipse-workspace\\Selenium_Concept\\Driver\\chromedriver.exe" );
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		
		
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
	    driver.switchTo().alert().dismiss();
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
	}
}
