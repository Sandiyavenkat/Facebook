package com.sel.pro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Concept_alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandhiya venkat\\eclipse-workspace\\Selenium_Concept\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		

		
		driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		
		driver.switchTo().alert().dismiss();
		
		
		WebElement alert1 = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		alert1.click();
		
		WebElement prompt = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		prompt.click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("sandy");
		alert.accept();
		
		
		
		
		
		
		
		
		
	}	
}
