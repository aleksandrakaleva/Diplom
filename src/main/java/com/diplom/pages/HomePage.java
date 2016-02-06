package com.diplom.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.diplom.elements.Button;
import com.diplom.elements.SelectList;
import com.diplom.elements.TextField;

import ru.yandex.qatools.allure.annotations.Step;
//страница диплома
public class HomePage extends InternalPage{

	public HomePage(PageManager pages) {
		super(pages);
	}
	
	public HomePage ensurePageLoaded(){
		super.ensurePageLoaded();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@title = 'Addressbook']")));
		return this;
	}
	
	@FindBy(name = "searchstring")
	private TextField searchField;
	
	@FindBy(name = "to_group")
	private SelectList toGroupSelect;	

	@FindBy(name = "add")
	private Button toaddButton;
	

	@Step("Ввод значения {0} в поле Поиска")
	public HomePage setSearchField(String text) {
		searchField.clearAndType(text);
		return this;
	}
	@Step("Выбрать значение {0} из выдающего списка")
	public HomePage settoGroupSelect(String text) {
		toGroupSelect.select(text);
			return this;
	}
	@Step("Нажать на кнопку Add to")
	public HomePage clickToAddButton() {
		toaddButton.click();
			return this;
	}
	@Step("Ввод значения {0} в поле Поиска")
	public HomePage selectAddress(String text) {
		driver.findElement(By
				.xpath("//td[text()='"+text+"']/..//input[@name = 'selected[]']"))
				.click();
		return this;
	}
	@Step("Нажать на кнопку редактирования на контакте со сзначением {0}")
	public void clickEditButton(String text) {
		driver.findElement(By.xpath("")).click();
		pages.addAddressPage.waitPageLoaded();
	}
	
}
