package com.groups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupsSet {
	WebDriver driver;
	@Test(groups="setPath")
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C://Utkarshaa_Academy//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	@Test(priority=1,groups="regression")
	public void openKite() {
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
	}
	@Test(priority=2,groups="sanity")
	public void checkTitle() {
		driver.findElement(By.xpath("//title[contains(text(),\"Kite - Zerodha's fast and elegant flagship trading\")]"));
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		String Expectedtitle = "Kite - Zerodha's fast and elegant flagship trading platform";
		// //h2[contains(text(),'Login to Kite')]
		Assert.assertEquals(actualTitle, Expectedtitle);
	}
	

}
