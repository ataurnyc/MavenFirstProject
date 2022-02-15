package com.xyz.MavenExample2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2 {
	public WebDriver driver;
	@Parameters ({"browser"})
	@Test(description= "This is our first test cases")
	public void t1_openBrowser(String browser) throws InterruptedException {
		
		Reporter.log("****** Test case 1 started*********");
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("Test case 1 suceessfully passed");
	}

	@Test
	public void t2_openURL() throws InterruptedException {
		driver.get("https://google.com/");
		Thread.sleep(2000);
		Reporter.log("Test case 2 suceessfully passed");
	}

	@Parameters({"word"}) 
	@Test 
	public void t3_search(String term) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys(term);
		driver.findElement(By.name("q")).submit();
		Thread.sleep(5000);
		Reporter.log("Test case 3 suceessfully passed");
	}

	@Test(dependsOnMethods="t3_search")
	public void t4_result() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("New York City - Wikipedia")).click();
		Thread.sleep(5000);
		Reporter.log("Test case 4 suceessfully passed");
	}

	@Test//(enabled=false)
	public void t5_closeBrowser() {
		driver.close();
	}

}
