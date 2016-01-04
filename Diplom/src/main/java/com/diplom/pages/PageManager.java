package com.diplom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageManager {
	
	private WebDriver driver;
	
	public HomePage homePage;
	public InternalPage internalPage;
	public AddAddressPage addAddressPage;
	public GroupsPage groupsPage;
	public AddGroupPage addGroupPage;
	
	public PageManager(WebDriver driver){
		this.driver = driver;
		homePage = initElements(new HomePage(this));
		internalPage = initElements(new InternalPage(this));
		addAddressPage = initElements(new AddAddressPage(this));
		groupsPage = initElements(new GroupsPage(this));
		addGroupPage = initElements(new AddGroupPage(this));
	}
	
	private <T extends Page> T initElements(T page) {
		PageFactory.initElements(new DisplayedElementLocatorFactory(driver, 30), page);
		return page;
	}
	
	public WebDriver getWebDriver(){
		return driver;
	}

}
