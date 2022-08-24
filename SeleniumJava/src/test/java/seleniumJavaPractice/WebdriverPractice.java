package seleniumJavaPractice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.grid.web.servlet.handler.SeleniumBasedRequest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverPractice {
      WebDriver driver;
      WebDriverWait wait;
      Wait <WebDriver> fWait;
	/*
	 * what are the method available in SeleniumWebDriver>> 
	 * method of SearchContext
	 * interface 1.findElement() 2.findEmements() 
	 * method of WebDriver Interface.
	 * 1.close() 
	 * 2.get() 
	 * 3.getCurrentUrl() 
	 * 4.getTitle() 
	 * 5.getPageSource()
	 * 6.getWindowHandle() 
	 * 7.getWidowHandles()
	 *  8.manage()
	 * 9.navigate().to().refresh()//back()//forw 
	 * 10.quit() 
	 * 11.switchTo()
	 * 
	 * method of TakeScreenshot interface.
	 * takeScreenshotAs(args)
	 *method of JavascriptExecutor interface
	 *executeScript()
	 *
	 *method of WebElement interface
	 *1.clear()
	 *click()/submit()
	 *getAttribute()
	 *getCssValue()
	 *getLocation()
	 *getRect()
	 *getSize()
	 *getTagName()
	 *getText()
	 *isDisplayed()
	 *isEnabled()
	 *isSelected()
	 *
	 *
	 *
	 *
	 *
	 */
    @Test
	public void getDriver() throws InterruptedException{
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		// WebDriverManager.firefoxdriver().setup();
		 driver = new ChromeDriver();//upCasting
		//ChromeDriver driver1 = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
	    wait = new WebDriverWait(driver, 20);
	    String eTitle= "Amazon.com. Spend less. Smile more.";
	    String aTitle="";
		//driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println("Title of this page= " + driver.getTitle());
		if(eTitle.equals(aTitle)) {
			System.out.println("Test Passed");
			
		}else {
			System.out.println("Test Failed");
		}
		WebElement element;
		element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("twotabsearchtextbox")));
		element.sendKeys("I phone 13Pro");
		Thread.sleep(3000);
		element.sendKeys(Keys.ENTER);
		
		wait.until(ExpectedConditions.elementSelectionStateToBe(By.xpath(""), false));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		//method of WebDriverWait Class >>alertIsPresent()>elementSelectionStateToBe()
		//elementToBeClickable()>>elementToBeSelected()>>presenceOfElementLocated()
		//presenceOfAllElementsLocatedBy()>>visibilityOf()>>visibilityOfAllElements()
		//
		//System.out.println("Current page URL= " + driver.getCurrentUrl());
		//Thread.sleep(3000);
	     //driver.findElements(By.id("twotabsearchtextbox"));
		//findProduct.sendKeys("IPhone 13Pro");
		//findProduct.sendKeys(Keys.ENTER);
		//driver.findElement(By.id("nav-search-submit-button")).click();
		
		//Thread.sleep(3000);
		//WebElement search = driver.findElement(By.name("q"));
		//search.sendKeys("Bangladesh");
		fWait = new FluentWait<WebDriver>(driver).withTimeout(30,TimeUnit.SECONDS).
				pollingEvery(3,TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		
		driver.quit();
	

	}

}
