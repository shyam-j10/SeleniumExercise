package com.Test.Testing.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day4_5_1 {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://j2store.net/free/");
		
		String currentUrl1=driver.getCurrentUrl();
		String expectedUrl1="https://j2store.net/free/";
		if(currentUrl1.equals(expectedUrl1)) {
			System.out.println("Matched");
		}else {
			System.out.println("Unmatched");
		}
		
		driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/a/img")).click();
		
		String currentUrl2=driver.getCurrentUrl();
		String expectedUrl2="https://j2store.net/free/index.php/shop?filter_catid=11";
		if(currentUrl2.equals(expectedUrl2)) {
			System.out.println("Matched");
		}else {
			System.out.println("Unmatched");
		}
		
	}

}
