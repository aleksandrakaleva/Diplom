package com.diplom.applogic;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * 
 * Класс отвечающий за навигацию по проекту
 *
 */
public class NavigationHelper extends DriverBasedHelper{
	
	private String baseUrl;
	
	/**
	 * Конструктор
	 * @param manager
	 */
	public NavigationHelper(ApplicationManager manager) {
		super(manager);
		this.baseUrl = manager.getBaseUrl();
	}
	
	public void openHomePage(){
		driver.get(baseUrl);
	}
	
	public void openListAdressPage(){
		pages.internalPage
			.clickMenuHome();
		pages.homePage
			.waitPageLoaded();
	}
	
	
	public void openAddAdressPage(){
		pages.internalPage
			.clickMenuAddNew();
		pages.addAddressPage
			.waitPageLoaded();
	}

	
	
	
	

}
