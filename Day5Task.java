package com.tasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day5Task {

	private static void mouseEvent(WebDriver driver) {
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement txtBankSordb = driver.findElement(By.id("credit2"));
		WebElement txtAccDesdb = driver.findElement(By.id("bank"));
		WebElement txt5000db = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement txtAmoutDesdb = driver.findElement(By.id("amt7"));
		WebElement txtSaleSocCr = driver.findElement(By.id("credit1"));
		WebElement txtSalesDesCr = driver.findElement(By.id("loan"));
		WebElement txt5000Descr = driver.findElement(By.id("amt8"));

		Actions action = new Actions(driver);
		
		action.dragAndDrop(txtBankSordb, txtAccDesdb).perform();
		action.dragAndDrop(txt5000db, txtAmoutDesdb).perform();
		action.dragAndDrop(txtSaleSocCr, txtSalesDesCr).perform();
		action.dragAndDrop(txt5000db, txt5000Descr).perform();
		
		WebElement perfect = driver.findElement(By.xpath("//a[text()='Perfect!']"));
		boolean displayed = perfect.isDisplayed();
		if(displayed) {
			System.out.println("Success");
		}else {
			System.out.println("Not Success");
		}
		
	}
	
	private static void robotEvent(WebDriver driver) throws AWTException {
		// TODO Auto-generated method stub
		driver.get("https://www.google.com/");
		WebElement gmailtxt = driver.findElement(By.linkText("Gmail"));
		Actions actions = new Actions(driver);
		actions.moveToElement(gmailtxt).perform();
		actions.contextClick().perform();
		Robot ro = new Robot();
		ro.keyPress(KeyEvent.VK_UP);
		ro.keyRelease(KeyEvent.VK_UP);
		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);

	}
	
	private static void task1(WebDriver driver) throws InterruptedException {
		driver.get("https://www.amazon.in");
		try {
		WebElement primetxt = driver.findElement(By.id("nav-link-prime"));
		Actions action = new Actions(driver);
		action.moveToElement(primetxt).perform();
		Thread.sleep(3000);
		WebElement img = driver.findElement(By.id("multiasins-img-link"));
		img.click();
		} finally {
			driver.quit();
		}
	}
	
	private static void task2(WebDriver driver) throws InterruptedException {
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement hometxt = driver.findElement(By.xpath("//div[text()='Home']"));
		Actions action = new Actions(driver);
		action.moveToElement(hometxt).perform();
		driver.findElement(By.linkText("Bath linen")).click();
		Thread.sleep(3000);
		WebElement title = driver.findElement(By.xpath("(//a[text()='TRIDENT Cotton 460 GSM Hand Towel Set'])[1]"));
		System.out.println(title.getText());
	}
	
	private static void task3(WebDriver driver) throws InterruptedException {
		driver.get("http://greenstech.in/selenium-course-content.html");
		Thread.sleep(6000);
		WebElement txtCpurses = driver.findElement(By.xpath("//div[text()='Courses ']"));
		Actions action = new Actions(driver);
		action.moveToElement(txtCpurses).perform();
	}
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		task1(driver);
		task2(driver);
//		task3(driver);
//		mouseEvent(driver);
//		robotEvent(driver);
	
				
		
	}

}
