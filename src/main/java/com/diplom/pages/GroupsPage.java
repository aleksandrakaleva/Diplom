package com.diplom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import ru.yandex.qatools.allure.annotations.Step;

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
	
	@FindBy(name = "edit")
	public Button editGroupButton;
	
	@FindBy(name = "delete")
	public Button deleteGroupButton;
	
	@Step("Нажать на кнопку New group")
	public void clickNewGroupButton(){
		newGroupButton.click();
		pages.addGroupPage
			.waitPageLoaded();
	}
	
	@Step("Нажать на кнопку Delete droup")
	public void clickDeleteGroupButton(){
		deleteGroupButton.click();
	}
	
	@Step("Нажать на кнопку Edit group")
	public void clickEditGroupButton(){
		editGroupButton.click();
	}
	
	@Step("Нажать на кнопку Edit group")
	public GroupsPage selectGroupCheckbox(String text){
		driver.findElement(By.xpath("//input[@title = 'Select ("+text+")']")).click();
		return this;
	}
	
	

}
