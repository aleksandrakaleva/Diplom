package com.diplom.elements;

import java.text.ParseException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TimeField extends Element{

	public TimeField(WebElement webElement) {
		super(webElement);
	}
	
	public String getValue() {
		return webElement.getAttribute("value");
	}
	
	public void select(WebDriver driver, String time) throws ParseException {
		
		webElement.click();
		
		if(Integer.parseInt(time.substring(0, time.indexOf(":")))>12){
			if(driver.findElement(By.xpath("//div[@class = 'dtp-picker-datetime']"
					+ "//a[@class = 'dtp-meridien-pm'][text() = 'PM']")).isDisplayed()){
				driver.findElement(By.xpath("//div[@class = 'dtp-picker-datetime']"
						+ "//a[@class = 'dtp-meridien-pm'][text() = 'PM']")).click();
			}
			driver.findElement(By
					.xpath("//div[@class = 'dtp']//a[@class = 'dtp-select-hour']"
							+ "[text() = '"+(Integer.parseInt(time.substring(0, time.indexOf(":")))-12)+"']"))
								.click();
		}else{
			driver.findElement(By
					.xpath("//a[@class = 'dtp-select-hour'][text() = '"+(Integer.parseInt(time
							.substring(0, time.indexOf(":"))))+"']")).click();
		}
		
		if(Integer.parseInt(time.substring(time.indexOf(":") + 1))>0){
			driver.findElement(By.xpath("//div[@class = 'dtp-picker-datetime']"
					+ "//a[@class = 'dtp-meridien-minutes']")).click();
			driver.findElement(By.xpath("//a[@class = 'dtp-select-minute']"
					+ "[text() = '"+(Integer.parseInt(time.substring(time.indexOf(":") + 1)))+"']"))
						.click();

		}
		
		driver.findElement(By
				.xpath("//div[@class = 'dtp']//button[@class = 'dtp-btn-ok btn btn-positive']"
						+ "[contains(text(), 'OK')]"))
					.click();
	
		
	}

}
