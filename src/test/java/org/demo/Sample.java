package org.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	//WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	WebElement searchbox = driver.findElement(By.xpath("//input[@type='text']"));
	searchbox.sendKeys("iphone 15 pro max",Keys.ENTER);
	List<WebElement> iphone = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
	List<WebElement> price = driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
	for(int i=0;i<iphone.size();i++) {
		WebElement phonelist = iphone.get(i);
		String text = phonelist.getText();
		WebElement pricelist = price.get(i);
		String text2 = pricelist.getText();
		System.out.println("Phone names"+text+""+"price:"+text2);
	}
}
}