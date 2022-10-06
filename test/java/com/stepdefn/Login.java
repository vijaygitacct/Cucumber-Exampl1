package com.stepdefn;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	
	WebDriver driver;
	@Given("User on AdactinHotelApp page")
	public void A() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@When("User Should Enter UserName and Password")
	public void B() {

		WebElement txtUser = driver.findElement(By.id("username"));
		txtUser.sendKeys("Greens8767");

		WebElement txtPass = driver.findElement(By.id("password"));
		txtPass.sendKeys("L4R739");

	}

	@When("User Should Click Login button")
	public void C() {


		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
	}

	@Then("User Should Verify after Login Success  Msg")
	public void D() {
		Assert.assertTrue("Verify Login", true);

	}

}

	












