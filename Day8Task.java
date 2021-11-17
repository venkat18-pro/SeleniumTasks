package com.tasks;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day8Task {
	/*QUESTION 1
	----------
	URL : https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997
	NOTE: Click continue without enter the user id and handle popup.
	 */
	private static void task1(WebDriver driver) throws InterruptedException {
	driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
	Thread.sleep(2000);
	driver.switchTo().frame(0);
	Thread.sleep(2000);
	WebElement ele =driver.findElement(By.xpath("//a[text()='CONTINUE']"));
	ele.click();
	Alert alert = driver.switchTo().alert();
	alert.accept();
	}
	
	/*QUESTION 2
	----------
	URL : https://netbanking.canarabank.in/entry/ENULogin.jsp

	NOTE: Click sign in without enter the user id and print text appear and handle popup.
	 */
	private static void task2(WebDriver driver) {
		driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
		driver.findElement(By.xpath("//input[@value='SIGN IN']")).click();
		driver.switchTo().alert().accept();
	}
	
	/*QUESTION 3
	----------
	URL : https://retail.onlinesbi.com/retail/login.htm

	NOTE: Click Continue To Login and click Login without enter the user id.
	*/
	private static void task3(WebDriver driver) throws InterruptedException {
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		driver.findElement(By.xpath("(//a[text()='CONTINUE TO LOGIN'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("Button2")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}
	
	/*QUESTION 4
	----------
	URL : https://netbanking.hdfcbank.com/netbanking/

	NOTE: Enter the userId,click continue.Enter password.
	*/
	private static void task4(WebDriver driver) throws InterruptedException {
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@class='form-control text-muted']")).sendKeys("venkat");
		driver.findElement(By.xpath("//a[text()='CONTINUE']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("fldPasswordDispId")).sendKeys("venkat");
		driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		task1(driver);
		task2(driver);
		task3(driver);
		task4(driver);
		driver.quit();

	}

}
