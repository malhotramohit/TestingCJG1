package com.gs.ilp.corejava.selenium.demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

// tdd -> (selenium ): webdriver, rc,
// bdd (cucumber/spark/java apps) --> feature behavior

public class TestChromeBrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/mohitmalhotra/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		// Launch website
		driver.navigate().to("https://www.youtube.com/");

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Click on the search text box and send value
		driver.findElement(By.id("search")).sendKeys("Gyansetu Gurgaon");

		// Click on the search button
		driver.findElement(By.id("search-icon-legacy")).click();
		// TestNG
		// Gyansetu Gurgaon - YouTube
		Assert.assertEquals("YouTube", driver.getTitle());

	}

}
