package com.tasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Day6Task {
	
	private static void sampleTask(WebDriver driver) {
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		driver.findElement(By.xpath("//button[@onclick ='promptbox()']")).click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.sendKeys("venkat");
		alert.dismiss();

	}
	
	private static void task1(WebDriver driver) throws InterruptedException, AWTException {
		driver.get("https://www.facebook.com/");
		try {
		WebElement txtemail = driver.findElement(By.id("email"));
		txtemail.sendKeys("venkat");
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.doubleClick(txtemail).perform();
		Robot robot = new Robot();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_C);
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).click();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		} finally {
			driver.quit();
		}
	}

	private static void task2(WebDriver driver) throws InterruptedException, AWTException {
		driver.get("https://www.google.co.in/webhp");
		try {
			WebElement search = driver.findElement(By.name("q"));
			search.sendKeys("VelMurugan");
			Actions action = new Actions(driver);
			Thread.sleep(2000);
			action.doubleClick(search).perform();
			Robot robot = new Robot();
			Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_X);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_X);
			Thread.sleep(2000);
		} finally {
			driver.quit();
		}
	}
	
	private static void task3(WebDriver driver) throws AWTException {
		driver.get("http://greenstech.in/selenium-course-content.html");
		try {
			driver.findElement(By.id("heading20")).click();
			WebElement ctsLink = driver.findElement(By.xpath("//a[text()='CTS Interview Question ']"));
			Actions action = new Actions(driver);
			action.contextClick(ctsLink).perform();
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
		} finally {
			driver.quit();
		}

	}
	
	private static void task4(WebDriver driver) throws AWTException, InterruptedException {
		driver.get("http://greenstech.in/selenium-course-content.html");
		try {
			WebElement linktxt = driver.findElement(By.id("heading304"));
			Actions action = new Actions(driver);
			action.contextClick(linktxt).perform();
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_UP);
			robot.keyRelease(KeyEvent.VK_UP);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(5000);
		} finally {
			driver.quit();
		}
	}
	
	private static void task5(WebDriver driver) throws AWTException, InterruptedException {
		driver.get("http://greenstech.in/selenium-course-content.html");
		try {
			driver.findElement(By.id("heading201")).click();
			WebElement resumetxt = driver.findElement(By.xpath("//a[text()='Resume Model-4 ']"));
			Actions action = new Actions(driver);
			action.contextClick(resumetxt).perform();
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(5000);
		} finally {
			driver.quit();
		}
	}
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		task5(driver);
	}

}
