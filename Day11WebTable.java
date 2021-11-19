package com.tasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day11WebTable {
	
/*	QUESTION 1
	----------
	URL : http://demo.guru99.com/test/write-xpath-table.html

	NOTE: Print all the content in the dymaic webtable.*/
	private void task1(WebDriver driver) {
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		WebElement table = driver.findElement(By.tagName("table"));
		List<WebElement> tRows = table.findElements(By.tagName("tr"));
		int i=1;
		for (WebElement tRow : tRows) {
			List<WebElement> tDatas = tRow.findElements(By.tagName("td"));
			for (WebElement tData : tDatas) {
				System.out.println(i+" Row data: "+tData.getText());
			}
			i++;
		}
		
	}

/*	QUESTION 2
	----------
	URL : http://demo.guru99.com/test/write-xpath-table.html

	NOTE: Print all value in first row*/
	private void task2(WebDriver driver) {
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		List<WebElement> tRows = driver.findElements(By.tagName("tr"));
		for (int i = 0; i < tRows.size(); i++) {
			if(i == 1) {
				break;
			}
			WebElement tRow = tRows.get(i);
			List<WebElement> tDatas = tRow.findElements(By.tagName("td"));
			for (WebElement tData : tDatas) {
				System.out.println(tData.getText());
			}
		}
	}
	
	/*QUESTION 3
	----------
	URL : http://demo.guru99.com/test/write-xpath-table.html

	NOTE: Find out Number of rows available in webPage*/
	private void task3(WebDriver driver) {
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		List<WebElement> tRows = driver.findElements(By.tagName("tr"));
		System.out.println("Size of row: "+tRows.size());
	}
	
//	QUESTION 4
/*	----------
	URL : http://demo.guru99.com/test/write-xpath-table.html

	NOTE: Print all details available in 4th webtable*/
	private void task4(WebDriver driver) {
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		List<WebElement> tDatas = driver.findElements(By.tagName("td"));
		WebElement tData = tDatas.get(3);
		System.out.println(tData.getText());
	}
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		Day11WebTable task = new Day11WebTable();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		task.task1(driver);
//		task.task2(driver);
//		task.task3(driver);
		task.task4(driver);
		
		driver.quit();
	}

}
