package com.Selenium_Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation_Exercise {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.automationexercise.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Signup / Login")).click();
		driver.findElement(By.name("name")).sendKeys("hassibul123");
		driver.findElement(By.name("email")).sendKeys("hassibul1998@gmail.com");
		driver.findElement(By.name("password")).sendKeys("joy123");
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		//driver.quit();

	}

}
