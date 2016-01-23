package com.diplom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.diplom.elements.Button;

public class GroupsPage extends InternalPage{

	public GroupsPage(PageManager pages) {
		super(pages);
	}
	
	public GroupsPage ensurePageLoaded(){
		super.ensurePageLoaded();
		wait.until(ExpectedConditions.presenceOfElementLocated(By
				.xpath("//h1[text() = 'Groups']")));
		return this;
	}
	
	@FindBy(name = "new")
	public Button newGroupButton;
	
	public void clickNewGroupButton(){
		newGroupButton.click();
	}
	
	

}
