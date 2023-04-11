package com.Test.Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day4_2 {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co=new ChromeOptions();
    	co.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
    	WebElement fname=driver.findElement(By.id("input-firstname"));
    	fname.sendKeys("Shyam");

    	Thread.sleep(2000);
    	WebElement lname=driver.findElement(By.id("input-lastname"));
    	lname.sendKeys("Sundar");

    	Thread.sleep(2000);
    	WebElement email=driver.findElement(By.id("input-email"));
    	email.sendKeys("shyam@gmail.com");

    	JavascriptExecutor js=(JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,500)","");
    	
    	Thread.sleep(2000);
    	WebElement pass=driver.findElement(By.cssSelector("input#input-password"));
    	pass.sendKeys("skcet");

    	Thread.sleep(2000);
    	WebElement sub=driver.findElement(By.id("input-newsletter-yes"));
    	sub.click();
	}

}
