package com.sel.pro;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;import java.util.jar.Attributes.Name;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Practice {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandhiya venkat\\eclipse-workspace\\Selenium_Concept\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/SearchHotel.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("sandhiyaVenkat123");
		driver.findElement(By.id("password")).sendKeys("sandhiya");
		
		driver.findElement(By.xpath("//input[@type='Submit']")).click();
		
		driver.findElement(By.xpath("//select[@name='location']")).click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		 
		driver.findElement(By.id("hotels")).click();
         r.keyPress(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.id("room_type")).click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.id("Submit")).click();
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.name("first_name")).sendKeys("Jamie");
		driver.findElement(By.name("last_name")).sendKeys("Dordan");
		driver.findElement(By.name("address")).sendKeys("Sutherland,PC-2232");
		driver.findElement(By.name("cc_num")).sendKeys("1234567890123456");
		
		driver.findElement(By.id("cc_type")).click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.name("cc_exp_month")).click();
		 r.keyPress(KeyEvent.VK_DOWN);
			
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.name("cc_exp_year")).click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
			
		
		
		
		driver.findElement(By.name("cc_cvv")).sendKeys("123");
		driver.findElement(By.name("book_now")).click();
		
		Thread.sleep(2000);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,1000)");
			
		//driver.findElement(By.className("reg_button")).click();
			
		//driver.findElement(By.xpath("(//input[@type='button'])[3]")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}			
}
