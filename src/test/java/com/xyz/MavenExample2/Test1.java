package com.xyz.MavenExample2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).clear();
		
		driver.findElement(By.name("q")).sendKeys("New York");
		
		driver.findElement(By.name("q")).submit();
		Thread.sleep(5000);
		
		driver.findElement(By.partialLinkText("New York City - Wikipedia")).click();
		Thread.sleep(5000);
		
		driver.close();
	}

}
