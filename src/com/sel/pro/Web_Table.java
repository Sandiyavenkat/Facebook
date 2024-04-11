package com.sel.pro;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandhiya venkat\\eclipse-workspace\\Selenium_Concept\\Driver\\chromedriver.exe" );
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	driver.manage().window().maximize();
	
	WebElement element = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr/th[2]"));
    System.out.println(element.getText());

    List<WebElement> elements = driver.findElements(By.tagName("th"));
    for(WebElement allElement : elements){
	System.out.println(allElement.getText());
	
	
	
	
	
	
}
}
}