package com.qa.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest {

@Test
public void google()
{
	//Set property path for Chrome Driver
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sh360659\\Downloads\\Gradle-KT\\binary\\chromedriver.exe");
	//Initialize chrome Driver
	WebDriver driver = new ChromeDriver();
	//Invoke Browser
	driver.get("https:\\www.google.com");
	String title = driver.getTitle();
	Assert.assertEquals(title, "Google");
	System.out.println("Title is " +title);
	driver.close();
			
}
}
