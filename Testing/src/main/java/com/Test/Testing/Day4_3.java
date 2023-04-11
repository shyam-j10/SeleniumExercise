package com.Test.Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day4_3 {
	public static void main( String[] args ) throws InterruptedException
    {
		ChromeOptions co=new ChromeOptions();
    	co.addArguments("--remote-allow-origins=*");
    	
    	WebDriverManager.chromedriver().setup();//setting up chrome driver
    	WebDriver driver=new ChromeDriver();
    	
    	driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
    	
    	driver.findElement(By.xpath("//input[@id=\"input-to-name\"]")).sendKeys("Warner");
    	driver.findElement(By.xpath("//input[@id=\"input-to-email\"]")).sendKeys("warner@gmail.com");
    	
    	driver.findElement(By.xpath("//input[@id=\"input-from-name\"]")).sendKeys("Shyam");
    	driver.findElement(By.xpath("//input[@id=\"input-from-email\"]")).sendKeys("shyam@gmail.com");
    	JavascriptExecutor js=(JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,500)","");
    	
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//input[@id=\"input-theme-6\"]")).click();

    	
    	driver.findElement(By.xpath("//textarea[@id=\"input-message\"]")).sendKeys("Gift delivered");
    	
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/div/input")).click();

    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/button")).click();
    
    	
    	
    }

}
