package com.tasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		List<WebElement> frame = driver.findElements(By.tagName("iframe"));
		System.out.println("Total frame: " + frame.size());
		// find by id		
		//driver.switchTo().frame("a077aa5e");
		
		driver.switchTo().frame(1);
		
		driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
		
		driver.quit();

	}

}

