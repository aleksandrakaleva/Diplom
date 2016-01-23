package com.diplom.applogic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.diplom.pages.PageManager;

public class DriverBasedHelper {
	
	protected WebDriver driver;
	protected WebDriverWait wait;
	public PageManager pages;
	protected ApplicationManager manager;
	
	public DriverBasedHelper(ApplicationManager manager){
		this.driver = manager.getWebDriver();
		wait = new WebDriverWait(driver, 10);
		pages = new PageManager(driver);
		this.manager = manager;
	}

	
	
	

}
