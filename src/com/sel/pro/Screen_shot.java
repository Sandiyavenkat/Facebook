package com.sel.pro;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Screen_shot {
 public static void main(String[] args) throws IOException, InterruptedException {
	
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandhiya venkat\\eclipse-workspace\\Selenium_Concept\\Driver\\chromedriver.exe");
	 
	 WebDriver driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();	
	  driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	  TakesScreenshot ts = (TakesScreenshot) driver;
	  //driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	 // alert.click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@name='firstname']"));
	  File source = ts.getScreenshotAs(OutputType.FILE);
	  File target = new File("C:\\Users\\Sandhiya venkat\\eclipse-workspace\\Selenium_Concept\\Screenshot\\pls.png");
	  Files.copy(source, target);

	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}	
}
