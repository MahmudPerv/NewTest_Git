package seleniumJavaPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWebTable {
	@Test
	void getTable()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> table = driver.findElements(By.xpath("//div[@id='leftcontainer']/table/tbody/tr"));
		System.out.println("WebTable Size is: "+table.size());
		for(WebElement t:table)
		{	
			
		System.out.println("Total WebTable Value is: "+t.getSize()+" = "+t.getText());
				
		}
		driver.quit();
	}

}
