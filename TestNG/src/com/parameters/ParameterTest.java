package com.parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	
	WebDriver driver;

	@Test
	@Parameters({"env","browser","url","emailId"})
	public void yahooLoginTest(String env,String browser,String url,String emailId)
	{
		if(browser.equals("chrome"))
		{
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\Shashank\\eclipse-workspace\\TestNG\\chromedriver.exe");
		driver=new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			System.setProperty("webDriver.gecko.driver", "C:\\Users\\Shashank\\eclipse-workspace\\TestNG\\geckodriver");
			driver=new FirefoxDriver();
		}
		driver.get(url);
		driver.findElement(By.xpath("//*[@id='login-username']")).clear();
		driver.findElement(By.xpath("//*[@id='login-username']")).sendKeys(emailId);
		driver.findElement(By.xpath("//*[@id='login-signin']")).click();
	}
	
}
