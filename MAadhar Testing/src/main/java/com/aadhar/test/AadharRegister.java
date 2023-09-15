package com.aadhar.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AadharRegister {
	public WebDriver webdriver;

	@Test
	public void ChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91870\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		webdriver = new ChromeDriver();
		webdriver.manage().window().maximize();
		System.out.println("Chrome Browser is Opened!!");

	}

	@Test
	public void TestHome() {
		webdriver.get("http://localhost:4200/login");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		webdriver.findElement(By.xpath("//div[@class='login-container']")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		webdriver.get("http://localhost:4200/user-register");

		webdriver.findElement(By.id("name")).sendKeys("Ujjwal Pratik");
		webdriver.findElement(By.id("dob")).sendKeys("10/02/2000");
		webdriver.findElement(By.id("emailid")).sendKeys("pratik4525@gmail.com");
		webdriver.findElement(By.id("address")).sendKeys("Dumra, Sitamarhi");
		webdriver.findElement(By.id("mobileno")).sendKeys("9142092979");
		webdriver.findElement(By.id("gender")).sendKeys("Male");
	}

}