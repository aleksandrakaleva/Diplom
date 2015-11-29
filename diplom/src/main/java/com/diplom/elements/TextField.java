package com.diplom.elements;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class TextField extends Element {

	public TextField(WebElement webElement) {
		super(webElement);
	}
	
	 public void clear() {
        webElement.clear();
	 }
	 
	 public void type(String value) {
	    webElement.sendKeys(value);
	 }
	 
	 public void typeEnter() {
		webElement.sendKeys(Keys.ENTER);
	 }
	 
	 public String getValue() {
		return webElement.getAttribute("value");
	 }
	 
	 public void clearAndType(String value) {
		 webElement.clear();
		 webElement.sendKeys(value);
	 }
	 
	 

}
