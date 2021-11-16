package com.tasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3Task {
	
	private static void task1(WebDriver driver) {
		driver.get("https://www.amazon.in/");
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("iphone ", Keys.ENTER);
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		System.out.println("Search text: "+search.getAttribute("value"));
		driver.quit();
	}	
	
	private static void task2(WebDriver driver) {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("venkat");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("venkat18");
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
		driver.quit();
	}
	
	private static void task3(WebDriver driver) {
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("venkatesh");//firstName
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("s");//lastName
		driver.findElement(By.tagName("textarea")).sendKeys("address");//address
		driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("venkat@gmail.com");//email
		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("6382927724");//phoneNumber
		WebElement radioBtn = driver.findElement(By.xpath("(//input[@ng-model='radiovalue'])[1]"));//RadioButton
		radioBtn.click();
		WebElement checkbox = driver.findElement(By.id("checkbox1"));//checkbox
		checkbox.click();
	}
	
	private static void task4(WebDriver driver) {
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.findElement(By.xpath("(//i[@class='fas fa-plus'])[1]")).click();//click the interview
		driver.findElement(By.linkText("CTS Interview Question ")).click();//click the cts interview q
		driver.quit();
	}
	
	private static void task5(WebDriver driver) {
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("venkat");
		driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("venkat18");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
	}
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		task5(driver);
//		task1(driver);
//		task2(driver);
//		task3(driver);
	}

}
