package com.testNG.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGPractice {
	WebDriver driver;	

	@BeforeTest(groups= {"demo1"})
	public void setUp() {
		System.out.println("@Before Execute");
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.google.com/");

	}

	@AfterTest(groups= {"demo1"})
	public void tearDown() {
		System.out.println("@After Execute");
		driver.quit();

	}

	@Test(groups= {"demo1"})

	public void cart() {
		System.out.println("cart method");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Bangladesh");
	}

	@Test(groups= {"demo2"})
	public void bill(){
		System.out.println("bill method ");
	}
	@Test(groups = {"demo3"})
	
	public void search() {
		System.out.println("search method run");
	}

}
