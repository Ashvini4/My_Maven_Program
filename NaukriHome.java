package com.groups;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class NaukriHome {
	WebDriver driver ;
	WebDriverWait wait;
	Actions action;
	@Test(groups= {"click","actionMove","demo"})
	public void openNaukri()  {
		System.setProperty("webdriver.chrome.driver", "C://Utkarshaa_Academy//chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		driver.get("https://www.naukri.com/");
		action=new Actions(driver);	
	}
	
	@Test(priority=1,groups="actionMove")
	public void moveOnJobs() {
		WebElement jobs=driver.findElement(By.xpath("//div[contains(text(),'Jobs')]"));
		action.moveToElement(jobs).perform();
	}
	@Test(priority=2,groups="demo")
	public void Companies() throws IOException {
		WebElement companies=driver.findElement(By.xpath("//li[contains(@class,'Companies')]"));
		action.moveToElement(companies).perform();
		
		TakesScreenshot sc=(TakesScreenshot)driver;
		File f1=sc.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f1, new File("C:\\Users\\DELL\\my-project1\\"+showTime()+"companies1.jpeg"));
	}
	public static String showTime() {
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}
}
