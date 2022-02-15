package com.xyz.MavenExample2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test3 {
	
	@Test
	@BeforeSuite
	public void testcase1() {
		System.out.println("Before Suite");
	}
	
	@BeforeClass
	public void testcase2() {
		System.out.println("Before Class");
	}
	
	@Test
	@BeforeTest
	public void testcase3() {
		System.out.println("Before Test");
	}
	
	@Test
	@BeforeMethod
	public void testcase4() {
		System.out.println("Before Method");
	}
	
	@Test
	public void testcase5() {
		System.out.println("Test");
	}
	
	@Test
	@AfterMethod
	public void testcase6() {
		System.out.println("After Method");
	}
	
	@Test
	@AfterTest
	public void testcase7() {
		System.out.println("After Test");
	}
	
	@AfterClass
	public void testcase8() {
		System.out.println("After Class");
	}
	
	@Test
	@AfterSuite
	public void testcase9() {
		System.out.println("After Suite");
	}

}
