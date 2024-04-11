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

public class Windows_Handling {
	
	
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandhiya venkat\\eclipse-workspace\\Selenium_Concept\\Driver\\chromedriver.exe" );
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		WebElement bestSeller = driver.findElement(By.xpath("(//a[@class='nav-a  '])[4]"));
		
		Actions ac = new Actions(driver);
		ac.contextClick(bestSeller).perform();
		
		Robot r = new Robot();
		//vk-virtualkey
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		WebElement todayDeal = driver.findElement(By.xpath("(//a[@class='nav-a  '])[5]"));
		
		Actions acc = new Actions(driver);
		acc.contextClick(todayDeal).perform();

		
		Robot rr = new Robot();
		//vk-virtualkey
		rr.keyPress(KeyEvent.VK_DOWN);
		rr.keyPress(KeyEvent.VK_ENTER);
		rr.keyRelease(KeyEvent.VK_ENTER);
		
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		ArrayList<String> a = new ArrayList<>(windowHandles);
		
		String title = driver.switchTo().window(a.get(0)).getTitle();
		System.out.println(title);
		

		String title1 = driver.switchTo().window(a.get(1)).getTitle();
		System.out.println(title1);
		

		String title2 = driver.switchTo().window(a.get(2)).getTitle();
		System.out.println(title2);
		
		
		
		
		
		
	}

}
