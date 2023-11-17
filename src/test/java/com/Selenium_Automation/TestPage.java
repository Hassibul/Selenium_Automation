package com.Selenium_Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestPage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testpages.eviltester.com/styled/validation/input-validation.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.name("firstname")).sendKeys("Hassibul");
		driver.findElement(By.name("surname")).sendKeys("Alam Joy HASSAM ");
		driver.findElement(By.name("age")).sendKeys("25");
		driver.findElement(By.name("country")).sendKeys("Bangladesh");
		driver.findElement(By.name("notes")).sendKeys("Nice Place To Visit");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.quit();

	}

}
