package com.tasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day12DropDown {

	private void task(WebDriver driver) throws InterruptedException {
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(3000);
		
		WebElement day = driver.findElement(By.id("day"));
		Select selectDay = new Select(day);
		List<WebElement> dayoptions = selectDay.getOptions();
		for (WebElement option : dayoptions) {
			System.out.println("days: "+option.getAttribute("value"));
		}
		
		WebElement month = driver.findElement(By.id("month"));
		Select selectMonth = new Select(month);
		List<WebElement> monthoptions = selectMonth.getOptions();
		for (WebElement option : monthoptions) {
			System.out.println("Month: "+option.getAttribute("value"));
		}
		
		WebElement year = driver.findElement(By.id("year"));
		Select selectYear = new Select(year);
		List<WebElement> yearoptions = selectYear.getOptions();
		for (WebElement option : yearoptions) {
			String years = option.getAttribute("value");
			if(years.equals("2010")){
				break;
			}else {
				System.out.println("year: "+years);
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Day12DropDown o = new Day12DropDown();
		o.task(driver);
		
		driver.quit();
	}
}
