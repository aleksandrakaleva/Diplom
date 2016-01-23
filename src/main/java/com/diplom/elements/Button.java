package com.diplom.elements;

import org.openqa.selenium.WebElement;

public class Button extends Element{
	
	public Button(WebElement webElement) {
		super(webElement);
	}

	public void click() {
       webElement.click();
	}
	
	public int getYLocation() {
	   return webElement.getLocation().getY();
	}
	
	

}
