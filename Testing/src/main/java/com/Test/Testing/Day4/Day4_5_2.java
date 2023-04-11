package com.Test.Testing.Day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day4_5_2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co=new ChromeOptions();
    	co.addArguments("--remote-allow-origins=*");
    	
    	WebDriverManager.chromedriver().setup();
    	WebDriver driver=new ChromeDriver();
    	
    	driver.get("https://j2store.net/free/");
    	driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/a/img")).click();
    	Thread.sleep(5000);
    	
    	List<WebElement> list=driver.findElements(By.xpath("//h2[@itemprop=\"name\"]"));
    	
    	for(WebElement link:list) {
    		System.out.println(link.getText());
    	}
	}
}
