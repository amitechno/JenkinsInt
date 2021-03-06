package com.selenium2019;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHover {
	WebDriver driver;
	@Test
	public void UseMouseHover(){
		System.setProperty("webdriver.chrome.driver", "/Users/amitsharma/Documents/workspace/selenium2019/driver/chromedriver");
		driver =new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		WebElement more = driver.findElement(By.xpath("//*[@id='ch_funnel_more']"));
		 Actions action = new Actions(driver);
		 action.moveToElement(more).build().perform();
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		 driver.findElement(By.linkText("International Flights")).click();
	}
	
	

}
