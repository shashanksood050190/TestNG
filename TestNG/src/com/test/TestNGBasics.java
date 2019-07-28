package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	
	//pre condition annotations
	@BeforeSuite //1
	public void setUp() {
		System.out.println("@BeforeSuite---setup system property for chrome");
	}
	
	
	@BeforeTest //2
	public void launchBrowser() {
		System.out.println("@BeforeTest---launch chrome browser");
	}
	
	@BeforeClass //3
	public void login()
	{
		System.out.println("@BeforeClass---login method ");
	}
	
	@BeforeMethod //4
	public void enterURL()
	{
		System.out.println("@BeforeMethod----enter url");
	}
	
	
	
	//test cases  
	@Test //5
	public void titleTest()
	{
		System.out.println("@Test--Google title test");
	}
	
	@Test
	public void searchTest()
	{
		System.out.println("@Test---search test ");
	}
	
	
	//post condition annotations
	
	
	@AfterMethod
	public void logOut()
	{
		System.out.println("@AfterMethod---log out from app");
	}

	@AfterClass
	public void closeBrowser() {
		System.out.println("@AfterClass---close  browser");
	}
	
	@AfterTest
	public void deletAllCookies()
	{
		System.out.println("@AfterTest---delete all cookies");
	}
	
	@AfterSuite
	public void generateTestReport() {
		System.out.println("@AfterSuite----generate test report");
	}
}
