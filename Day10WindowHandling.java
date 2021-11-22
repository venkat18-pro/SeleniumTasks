package com.tasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day10WindowHandling {
	
/*
	QUESTION 1
	----------
	URL : https://www.amazon.com/

	NOTE: Search iphones X and right click 1st phone and give open in new window 
	      print cost of product
*/
	private static void task1(WebDriver driver) throws InterruptedException, AWTException {
		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);
		Thread.sleep(3000);
		WebElement product = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
		Actions action = new Actions(driver);
		action.contextClick(product).perform();
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		String parent = driver.getWindowHandle();
		Thread.sleep(4000);
		Set<String> windows = driver.getWindowHandles();
		for (String win : windows) {
			if(!win.equals(parent)) {
				driver.switchTo().window(win);
			}
		}
		Thread.sleep(4000);
		WebElement name = driver.findElement(By.xpath("(//span[@class='a-size-base'])[6]"));
		System.out.println(name.getText());
	}

	/*QUESTION 2
	----------
	URL : https://www.snapdeal.com/ 

	NOTE: Search iphones 7 and click 1st phone 
	      add it to cart.
	      print the you pay cost displayed.
	*/
	private static void task2(WebDriver driver) throws InterruptedException {
		driver.get("https://www.snapdeal.com/");
		
		WebElement search = driver.findElement(By.name("keyword"));
		search.sendKeys("iphone 7", Keys.ENTER);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//p[@title='Apple iPhone 7 Shock Proof Case NBOX - Blue']")).click();
		String parentWin = driver.getWindowHandle();
		Thread.sleep(3000);
		Set<String> windows = driver.getWindowHandles();
		for (String win : windows) {
			if(!win.equals(parentWin)) {
				driver.switchTo().window(win);
			}
		}
		
		Thread.sleep(3000);
		driver.findElement(By.id("add-cart-button-id")).click();
		Thread.sleep(4000);
		WebElement price = driver.findElement(By.xpath("(//span[@class='price'])[2]"));
		System.out.println(price.getText());
	}
	
	/*QUESTION 3
	----------
	URL : https://www.homedepot.com/

	NOTE: Search celling fan 
	      click 1st fan and click the remote control included
	*/
	private static void task3(WebDriver driver) throws InterruptedException {
		driver.get("https://www.homedepot.com/");
		WebElement search = driver.findElement(By.id("headerSearch"));
		search.sendKeys("celling fan", Keys.ENTER);
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='product-pod__title__product'])[1]")).click();
		Thread.sleep(3000);
		String parentWin = driver.getWindowHandle();
		Thread.sleep(3000);
		Set<String> windows = driver.getWindowHandles();
		for (String win : windows) {
			if(!win.equals(parentWin)) {
				driver.switchTo().window(win);
			}
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Remote Included']")).click();
	}
	
/*QUESTION 4
----------
URL : https://www.snapdeal.com/ 

NOTE: Search hand sanitizer and click any hand sanitizer
      add it to cart
*/
	private static void task4(WebDriver driver) throws InterruptedException {
		driver.get("https://www.snapdeal.com/");
		WebElement search = driver.findElement(By.name("keyword"));
		search.sendKeys("hand sanitizer", Keys.ENTER);
		Thread.sleep(4000);
		WebElement product = driver.findElement(By.xpath("(//p[@class='product-title'])[1]"));
		product.click();
		Thread.sleep(3000);
		
		Set<String> windows = driver.getWindowHandles();
		List<String> li = new ArrayList<>();
		li.addAll(windows);
		driver.switchTo().window(li.get(1));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='add to cart']")).click();
	}
	

/*QUESTION 5
----------
URL : https://www.flipkart.com/ 

NOTE: Search redmi phone and click any phone
      print price amount*/
	private static void task5(WebDriver driver) throws InterruptedException {
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(3000);
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("redmi", Keys.ENTER);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[text()='REDMI 9i Sport (Carbon Black, 64 GB)']")).click();
		Thread.sleep(3000);
		Set<String> windows = driver.getWindowHandles();
		List<String> li = new ArrayList<>();
		li.addAll(windows);
		driver.switchTo().window(li.get(1));
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("(//div[text()='₹8,499'])[1]"));
		System.out.println(element.getText());
	}
	

/*QUESTION 10
----------
URL : https://www.flipkart.com/ 

NOTE: Search mask and click any mask
      Enter delivery pincode*/

/*//QUESTION 11
//----------
//URL : https://www.flipkart.com/ 
//
//NOTE: Search hp laptop and click 1st hp laptop
//      print cost of laptop
*/
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		task1(driver);
//		task2(driver);
//		task3(driver);
//		task4(driver);
		task5(driver);

		driver.quit();
	}

}
