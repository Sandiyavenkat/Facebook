package com.sel.pro;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Screenshot_Concept {
	
	
	 public static void main(String[] args) throws IOException  {
			
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandhiya venkat\\eclipse-workspace\\Selenium_Concept\\Driver\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		  driver.get("https://www.facebook.com/");
		  driver.manage().window().maximize();	
		  
		  
		  TakesScreenshot ts = (TakesScreenshot) driver;
		  File source = ts.getScreenshotAs(OutputType.FILE);
		  File destination = new File("C:\\Users\\Sandhiya venkat\\eclipse-workspace\\Selenium_Concept\\Screenshot\\FaceB.png");
		  FileUtils.copyFile(source, destination );

		  
	
}
}
