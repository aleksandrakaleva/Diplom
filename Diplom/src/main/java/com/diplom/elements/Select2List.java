package com.diplom.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import ru.stqa.selenium.factory.WebDriverFactory;

public class Select2List extends Element{

	public Select2List(WebElement webElement) {
		super(webElement);
	}
	
	public void select(WebDriver driver, String value) {
		webElement.click();
		driver.findElement(By.xpath("//*[@id = 'select2-drop']//input"))
		.sendKeys(value);
		driver.findElement(By.xpath("//span[text() = '"+value+"']")).click();  
	}
	
	public void getValue() {
		webElement.getText();
		 
	}

}
