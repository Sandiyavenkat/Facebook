package com.sel.pro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Dropdown {
	
	public static void main(String[] args) {
		

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandhiya venkat\\eclipse-workspace\\Selenium_Concept\\Driver\\chromedriver.exe");
	 
    WebDriver driver = new ChromeDriver();
	 
	 driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
	 driver.manage().window().maximize();
	 
	 
	 WebElement multielement = driver.findElement(By.xpath("//select[@id='multi-select']"));
	 
	 Select s = new Select(multielement);
	 boolean multiple = s.isMultiple();
	 System.out.println(multiple);
	 
	 
	 System.out.println("******ALL Options*******");
	 
	 List<WebElement> options = s.getOptions();
	 for (WebElement weblement : options) {
		 String text = weblement.getText();
		System.out.println(text);
	}
	 

	 System.out.println("****** size *******");
	 int size = options.size();
	System.out.println("The size is : "+size);
	
	
	
	System.out.println("*********Selected values**********");
	
	for (int i = 0; i < size; i++) {
		if (i==2||i==4||i==6) {
			s.selectByIndex(i);
		}

	}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	}
}
