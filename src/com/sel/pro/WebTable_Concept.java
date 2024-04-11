package com.sel.pro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Concept {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandhiya venkat\\eclipse-workspace\\Selenium_Concept\\Driver\\chromedriver.exe" );
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		
		//singlevalue
		WebElement element = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr/th[2]"));
		    System.out.println("*********the second header is******: "+element.getText());
		    
		    
		    //all values
		    List<WebElement> elements = driver.findElements(By.tagName("th"));
		    int size = elements.size();
		    System.out.println(size);
		    
		    
		
	}

}
