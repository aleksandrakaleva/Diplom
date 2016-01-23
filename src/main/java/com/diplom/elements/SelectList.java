package com.diplom.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectList extends Element{

	public SelectList(WebElement webElement) {
		super(webElement);
	}
	
	public void select(String value) {
		Select select = new Select(webElement);
		select.selectByVisibleText(value);   
	}

}
