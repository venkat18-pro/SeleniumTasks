package com.tasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BookingHotel {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://adactinhotelapp.com/");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement loginTxt = driver.findElement(By.id("username"));
		loginTxt.sendKeys("Venkat7012");
		WebElement passTxt = driver.findElement(By.id("password"));
		passTxt.sendKeys("Venkat@123");
		driver.findElement(By.id("login")).click();
		
		WebElement loc = driver.findElement(By.id("location"));
		Select selLoc = new Select(loc);
		selLoc.selectByVisibleText("Sydney");
		
		WebElement hotels = driver.findElement(By.id("hotels"));
		Select selHotel = new Select(hotels);
		selHotel.selectByVisibleText("Hotel Sunshine");
		
		WebElement roomType = driver.findElement(By.id("room_type"));
		Select selRoomType = new Select(roomType);
		selRoomType.selectByVisibleText("Standard");
		
		driver.findElement(By.id("Submit")).click();
		
		WebElement selectHotel= driver.findElement(By.id("radiobutton_0"));
		selectHotel.click();
		driver.findElement(By.id("continue")).click();
		
		WebElement firstName = driver.findElement(By.id("first_name"));
		firstName.sendKeys("venkatesh");
		WebElement lastName = driver.findElement(By.id("last_name"));
		lastName.sendKeys("sel");
		WebElement billAddr = driver.findElement(By.id("address"));
		billAddr.sendKeys("cuddalore");
		WebElement ccNum = driver.findElement(By.id("cc_num"));
		ccNum.sendKeys("7483746592382719");
		
		WebElement ccType = driver.findElement(By.id("cc_type"));
		Select selCcType = new Select(ccType);
		selCcType.selectByVisibleText("VISA");
		
		WebElement ccExpMonth = driver.findElement(By.id("cc_exp_month"));
		Select selCcExpMonth = new Select(ccExpMonth);
		selCcExpMonth.selectByVisibleText("July");
		
		WebElement ccExpYear = driver.findElement(By.id("cc_exp_year"));
		Select selCcExpYear = new Select(ccExpYear);
		selCcExpYear.selectByVisibleText("2022");
		
		WebElement cvvNum = driver.findElement(By.id("cc_cvv"));
		cvvNum.sendKeys("8549");
		
		driver.findElement(By.id("book_now")).click();
		
		String hotelName = driver.findElement(By.id("hotel_name")).getAttribute("value");
		System.out.println("Hotel Name: "+ hotelName);
		
		String location = driver.findElement(By.id("location")).getAttribute("value");
		System.out.println("Location: "+location);
		
		String roomT = driver.findElement(By.id("room_type")).getAttribute("value");
		System.out.println("Room Type: "+roomT);
		
		String arriveDate = driver.findElement(By.id("arrival_date")).getAttribute("value");
		System.out.println("Arrive Date: "+arriveDate);
		
		String departuretext = driver.findElement(By.id("departure_text")).getAttribute("value");
		System.out.println("Departure Text: "+departuretext);
		
		String totalRoom = driver.findElement(By.id("total_rooms")).getAttribute("value");
		System.out.println("Total Room: "+totalRoom);
		
		String adultperRoom = driver.findElement(By.id("adults_room")).getAttribute("value");
		System.out.println("Adults Per Room: "+adultperRoom);
		
		String childrenRoom = driver.findElement(By.id("children_room")).getAttribute("value");
		System.out.println("Children per Room: "+childrenRoom);
		
		String priceNight = driver.findElement(By.id("price_night")).getAttribute("value");
		System.out.println("Price Per Night: "+priceNight);
		
		String totalPrice = driver.findElement(By.id("total_price")).getAttribute("value");
		System.out.println("Total Price: "+totalPrice);
		
		String gst = driver.findElement(By.id("gst")).getAttribute("value");
		System.out.println("GST: "+gst);
		
		String finalPrice = driver.findElement(By.id("final_price")).getAttribute("value");
		System.out.println("Final Price: "+finalPrice);
		
		String fName = driver.findElement(By.id("first_name")).getAttribute("value");
		System.out.println("First name: "+fName);
		
		String lName = driver.findElement(By.id("last_name")).getAttribute("value");
		System.out.println("Last Name: "+lName);
		
		String address = driver.findElement(By.id("address")).getAttribute("value");
		System.out.println("Address: "+address);
		
		String orderNo = driver.findElement(By.id("order_no")).getAttribute("value");
		System.out.println("Order No: "+orderNo);
		
		driver.quit();
	}

}
