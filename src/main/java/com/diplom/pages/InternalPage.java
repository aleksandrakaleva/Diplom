package com.diplom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.diplom.elements.Button;

import ru.yandex.qatools.allure.annotations.Step;

public class InternalPage extends Page{

	public InternalPage(PageManager pages) {
		super(pages);
	}
	
	public InternalPage ensurePageLoaded(){
		super.ensurePageLoaded();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("container")));
		return this;
	}
	
	@FindBy(xpath = "//a[@href = './']")
	public WebElement menuHome;
	
	@FindBy(xpath = "//a[@href = 'edit.php']")
	private Button menuAddNew;
	
	@FindBy(xpath = "//a[@href = 'group.php']")
	private Button menuGroups;
	
	@FindBy(xpath = "//a[@href = 'birthdays.php']")
	private Button menuNextBirthdays;
	
	@FindBy(xpath = "//a[@href = 'view.php?all&print']")
	private Button menuPrintAll;
	
	@FindBy(xpath = "//a[@href = 'view.php?all&print&phones'")
	private Button menuPrintPhones;
	
	@FindBy(xpath = "//a[@href = 'csv.php'")
	private Button menuExportCsv;
	
	@Step("Нажать меню Home")
	public void clickMenuHome(){
		wait.until(ExpectedConditions.visibilityOf(menuHome)).click();
	}
	
	@Step("Нажать меню add new")
	public void clickMenuAddNew(){
		menuAddNew.click();
	}
	
	@Step("Нажать меню groups")
	public void clickMenuGroups(){
		menuGroups.click();
	}
	
	@Step("Нажать меню next birthdays")
	public void clickMenuNextBirthdays(){
		menuNextBirthdays.click();
	}
	
	@Step("Нажать меню print all")
	public void clickMenuPrintAll(){
		menuPrintAll.click();
	}
	
	@Step("Нажать меню print phones")
	public void clickMenuPrintPhones(){
		menuPrintPhones.click();
	}
	
	@Step("Нажать меню export csv")
	public void clickMenuExportCsv(){
		menuExportCsv.click();
	}
	
	
	
	


}
