package com.testNG.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest {
	@Test
	public void openFaceBook() {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("FaceBook is open");

	}

	@Test

	public void openGoggle() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.google.com/");
		System.out.println("goggle is open");
	}

	@Test
	public void openAmazon() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.amazon.com/");
		System.out.println("Amazon is open");
	}

}
