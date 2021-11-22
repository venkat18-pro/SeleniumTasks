package com.tasks;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
//		WebDriverWait w = new WebDriverWait(driver, 100);
//		WebElement until = w.until(ExpectedConditions.elementToBeClickable(By.name("login")));
//		until.click();
		
//		Wait w = new FluentWait(driver)
//				.withTimeout(Duration.ofSeconds(100))
//				.pollingEvery(Duration.ofSeconds(2))
//				.ignoring(Throwable.class);
//		WebElement ele = (WebElement)w.until(ExpectedConditions.elementToBeClickable(By.name("login")));
//		ele.click();
		
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		
		driver.findElement(By.id("email")).sendKeys("venkat");
		driver.findElement(By.id("pass")).sendKeys("venkat");
		
		driver.quit();
		
	}

}
