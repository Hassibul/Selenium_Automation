package com.Selenium_Automation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gmail {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/gmail/about");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("identifierId")).sendKeys("Joyalam204@gmail.com");
		driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Joy1998@");
		driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[2]")).click();

	}

}
