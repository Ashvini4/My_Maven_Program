package com.groups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NestedGroups {
WebDriver driver ;
	
	@Test(groups="ChromePath")
	public void setChromePath()
	{
		System.setProperty("webdriver.chrome.driver", "C://Utkarshaa_Academy//chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	@Test(groups="launchFB")
	public void launchFB()
	{				
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}
	@Test(groups="login")
	public void login() {
		driver.findElement(By.id("email")).sendKeys("ashvini");
		driver.findElement(By.id("pass")).sendKeys("12335");
	}
}
