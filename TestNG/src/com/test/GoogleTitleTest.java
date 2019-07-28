package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\Shashank\\eclipse-workspace\\TestNG\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
	}
	
	@Test()
	public void googleTitleTest()
	{
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google123","title is not matching");
	}

	
	@Test()
	public void mailLinkTest()
	{
		boolean b=driver.findElement(By.linkText("Gmail")).isDisplayed();
		Assert.assertTrue(b);
		
	}
	
	@AfterMethod()
	public void tearDown()
	{
		driver.quit();
	}

}
