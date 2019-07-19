package org.cts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Branches {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHA\\eclipse-workspace\\Sample\\driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.snapdeal.com/");
		WebElement source = d.findElement(By.id("inputValEnter"));
		source.sendKeys("EarPhone");
		
		WebElement btn = d.findElement(By.xpath("//span[text()='Search']"));
		btn.click();
		
		WebElement dst = d.findElement(By.xpath("//p[text()='boAt Bassheads 100 In Ear Wired Earphones With Mic (Black) Handsfree']"));
		dst.click();
		
        String s= d.getWindowHandle();
		
		Set<String> a= d.getWindowHandles();
		
		for (String i : a) {
			if (!i.equals(s)) {
				d.switchTo().window(i);
				
				
			}
			
			
		}
		
		WebElement btn2 = d.findElement(By.xpath("//span[text()='add to cart']"));
		btn2.click();
	
		
	}
	

}
