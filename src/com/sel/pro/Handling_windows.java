package com.sel.pro;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_windows {
 public static void main(String[] args) throws AWTException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandhiya venkat\\eclipse-workspace\\Selenium_Concept\\Driver\\chromedriver.exe" );
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement Grocery = driver.findElement(By.xpath("(//a[@class='_1ch8e_'])[1]"));
		Actions ac = new Actions(driver);
		ac.contextClick(Grocery).perform();
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		WebElement Mobiles = driver.findElement(By.xpath("(//a[@class='_1ch8e_'])[2]"));

	    Actions aac = new Actions(driver);
	    aac.contextClick(Mobiles).perform();
	    
	    Robot rr =new Robot();
	    rr.keyPress(KeyEvent.VK_DOWN);
	    rr.keyPress(KeyEvent.VK_ENTER);
	    rr.keyRelease(KeyEvent.VK_ENTER);
	    
	    Set<String> windowHandles = driver.getWindowHandles();
	    
	    ArrayList<String> a = new ArrayList<>(windowHandles);
	    
	    String title1 = driver.switchTo().window(a.get(1)).getTitle();
	    System.out.println(title1);
	    
	    String title2 = driver.switchTo().window(a.get(2)).getTitle();
	    System.out.println(title2);
	    
	    
	    
	    
	    
	    
	    
	 
	 
	 
	 
	 
	 
}
}
