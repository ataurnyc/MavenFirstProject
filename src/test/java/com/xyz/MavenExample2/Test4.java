package com.xyz.MavenExample2;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test4 {
	public WebDriver driver;

	@Test(description= "This is our first test cases")
	public void t1_openBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void t2_openURL() throws InterruptedException {
		driver.get("https://google.com/");
		Thread.sleep(2000);
	}

	@Test
	public void t3_search() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys("New York");
		driver.findElement(By.name("q")).submit();
		Thread.sleep(5000);
	}

	@Test(dependsOnMethods="t3_search")
	public void t4_result() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("New York City - Wikipedia")).click();
		Thread.sleep(5000);
	}

	@Test(enabled=false)
	public void t5_closeBrowser() {
		driver.close();
	}

}
