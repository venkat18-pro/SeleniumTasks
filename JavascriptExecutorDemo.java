package com.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorDemo {

	public static void facebookLogin(WebDriver driver) {
		driver.get("https://www.facebook.com/");
		
		WebElement txtEmail = driver.findElement(By.id("email"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value', 'venkat')", txtEmail);
		String emailtxt = (String)js.executeScript("return arguments[0].getAttribute('value')", txtEmail);
		System.out.println(emailtxt);
		
		WebElement txtPass = driver.findElement(By.id("pass"));
		js.executeScript("arguments[0].setAttribute('value', 'venkat18')", txtPass);
		String password = (String)js.executeScript("return arguments[0].getAttribute('value')", txtPass);
		System.out.println(password);
		
		WebElement loginBtn = driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click()", loginBtn);
	}
	
	public static void websiteScroll(WebDriver driver) {
		driver.get("http://www.greenstech.in/selenium-course-content.html");
		
		WebElement dest = driver.findElement(By.xpath("(//h3[@title='Top Selenium Trends In 2020'])[1]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", dest);
		
		WebElement up = driver.findElement(By.xpath("(//a[@title='Contact Us'])[1]"));
		js.executeScript("arguments[0].scrollIntoView(false)", up);
		
	}
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		facebookLogin(driver);
		websiteScroll(driver);
		
		driver.quit();
	}

}
