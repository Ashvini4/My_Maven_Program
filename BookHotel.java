package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookHotel {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Software-Testing\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goibibo.com/hotels/");//URL
		driver.findElement(By.name("CountryType")).click();//selecting country
		driver.findElement(By.xpath("//input[@id='downshift-1-input']")).click();//click on search
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/div[1]/ul[1]/li[4]/div[1]")).click();//body/div[@id='root']/div[2]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/div[1]/ul[1]/li[4]/div[1]
		
		driver.findElement(By.xpath("//p[contains(text(),'Delhi')]")).click();//selecting city from Where dropdown
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='search-widget-checkin-input']")).click();//selecting calendar from check in
		
		//driver.findElement(By.xpath("//body/div[@id='root']/section[1]/div[1]/div[1]/div[2]/div[2]/section[1]/div[1]/div[1]/div[1]/span[1]/*[1]")).click();
		//driver.findElement(By.xpath("//body/div[@id='root']/section[1]/div[1]/div[1]/div[2]/div[2]/section[1]/div[1]/div[1]/div[2]/div[1]/ul[2]/li[33]/span[1]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Check-out')]")).click();
		
		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[1]/section[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/section[1]/div[1]/div[2]/div[2]/div[1]/ul[2]/li[4]/span[1]")).click();
	//night count
		//driver.findElement(By.xpath("//div[contains(text(),'1 Night')]")).click();
		
		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[1]/section[1]/div[1]/div[1]/div[4]/div[1]/input[1]")).click();
		
		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[1]/section[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/span[2]")).click();
		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[1]/section[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/span[2]")).click();
		for(int i=1;i<3;i++)//adding 2 childs
		{
			driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[1]/section[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[3]/div[1]/span[2]")).click();
		}
		System.out.println(driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[1]/section[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[3]/span[1]")).isEnabled());
		driver.findElement(By.xpath("//button[contains(text(),'Done')]")).click();
		System.out.println("It's Done.....");
	}

}
