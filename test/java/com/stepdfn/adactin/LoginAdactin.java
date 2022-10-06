package com.stepdfn.adactin;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginAdactin {
	WebDriver driver;
	
	@Given("User on AdactinHotelApp page")
	public void user_on_adactin_hotel_app_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@When("User Should login {string}, {string}")
	public void user_should_login(String username, String password) {
		WebElement txtUser = driver.findElement(By.id("username"));
		txtUser.sendKeys(username);

		WebElement txtPass = driver.findElement(By.id("password"));
		txtPass.sendKeys(password);
		
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
	}

	@When("User Should Search Hotel {string},{string},{string},{string},{string},{string}")
	public void user_should_search_hotel(String Location, String Hotel, String RoomType, String NoOfRooms, String Adults, String Child) {
		
		WebElement txtLocation = driver.findElement(By.id("location"));
		txtLocation.sendKeys(Location);
		
		WebElement txtHotel = driver.findElement(By.id("hotels"));
		txtHotel.sendKeys(Hotel);
		
		WebElement txtRoomType = driver.findElement(By.id("room_type"));
		txtRoomType.sendKeys(RoomType);
		
		WebElement txtNoOfRoom = driver.findElement(By.id("room_nos"));
		txtNoOfRoom.sendKeys(NoOfRooms);
		
		WebElement txtAdult = driver.findElement(By.id("adult_room"));
		txtAdult.sendKeys(Adults);
		
		WebElement txtChild = driver.findElement(By.id("child_room"));
		txtChild.sendKeys(Child);
		
		WebElement btnSubmit = driver.findElement(By.id("Submit"));
		btnSubmit.click();
	}

	@When("User Should Select a Hotel")
	public void user_should_select_a_hotel() {
		WebElement btnSelctHotl = driver.findElement(By.id("radiobutton_0"));
		btnSelctHotl.click();
		
		WebElement btnContinue = driver.findElement(By.id("continue"));
		btnContinue.click();
		
	}
	@When("user Should Book a Hotel {string}, {string}, {string},{string},{string},{string},{string},{string},")
	public void user_should_book_a_hotel(String firstName, String lastName, String Address, String cardNo, String cardType, String expMonth, String expYear, String ccv) {
	
		WebElement txtFname = driver.findElement(By.id("first_name"));
		txtFname.sendKeys(firstName);
	
		WebElement txtLname = driver.findElement(By.id("last_name"));
		txtLname.sendKeys(lastName);
		
		WebElement txtAddress = driver.findElement(By.id("address"));
		txtAddress.sendKeys(Address);
		
		WebElement txtCardNo = driver.findElement(By.id("cc_num"));
		txtCardNo.sendKeys(cardNo);
		
		WebElement txtCardType = driver.findElement(By.id("cc_type"));
		txtCardType.sendKeys(cardType);
		
		WebElement txtExpMonth = driver.findElement(By.id("cc_exp_month"));
		txtExpMonth.sendKeys(expMonth);
		
		WebElement txtExpYear = driver.findElement(By.id("cc_exp_year"));
		txtExpYear.sendKeys(expYear);
		
		WebElement txtCCV = driver.findElement(By.id("cc_cvv"));
		txtCCV.sendKeys(ccv);
		
		WebElement btnBookNow = driver.findElement(By.id("book_now"));
		btnBookNow.click();
	}
	
	@Then("User  should get Order Id")
	public void user_should_get_order_id() {
		WebElement txtOrderId = driver.findElement(By.id("order_no"));
		String attribute = txtOrderId.getAttribute("value");
		System.out.println(attribute);
		
	}



}



















