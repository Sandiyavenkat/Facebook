package com.sel.pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_multi {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandhiya venkat\\eclipse-workspace\\Selenium_Concept\\Driver\\chromedriver.exe");
	 
    WebDriver driver = new ChromeDriver();
	 
	 driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
	 driver.manage().window().maximize();
	 
	 WebElement multielement = driver.findElement(By.xpath("//ul[@class='menu side_bar_menu']"));
	 
     Select s = new Select(multielement);
     boolean multiple =s.isMultiple();
     System.out.println(multiple);
     
     System.out.println("******ALL Options*******");
	 
	 
	 
	 
	 
	 
}
}
