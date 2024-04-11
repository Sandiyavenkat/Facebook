package com.sel.pro;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_work {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandhiya venkat\\eclipse-workspace\\Selenium_Concept\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		WebElement findElement = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		driver.switchTo().frame(findElement);
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("sandy");
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		WebElement findelement1 = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(findelement1);
		Thread.sleep(3000);
		  WebElement findelement2 = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
		  driver.switchTo().frame(findelement2);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("San");
		
		 	
		
		
		
		
		
	}
}
