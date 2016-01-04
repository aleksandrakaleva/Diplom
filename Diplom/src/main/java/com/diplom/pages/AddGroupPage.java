package com.diplom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import ru.yandex.qatools.allure.annotations.Step;

import com.diplom.elements.Button;
import com.diplom.elements.TextField;

public class AddGroupPage extends GroupsPage{

	public AddGroupPage(PageManager pages) {
		super(pages);
	}
	
	public AddGroupPage ensurePageLoaded(){
		super.ensurePageLoaded();
		wait.until(ExpectedConditions.presenceOfElementLocated(By
				.xpath("//label[text() = 'Group footer (Comment):']")));
		return this;
	}

	@FindBy(name = "group_name")
	public TextField groupNameField;
	
	@FindBy(name = "group_header")
	public TextField groupHeaderField;
	
	@FindBy(name = "group_footer")
	public TextField groupFooterField;
	
	@FindBy(name = "submit")
	public Button submitButton;
	
	@Step("Заполнить поле GroupName значением {0}")
	public AddGroupPage setGroupNameField(String text){
		groupNameField.clearAndType(text);
		return this;
	}
	
	@Step("Заполнить поле GroupHeader значением {0}")
	public AddGroupPage setGroupHeaderField(String text){
		groupHeaderField.clearAndType(text);
		return this;
	}
	
	@Step("Заполнить поле GroupFooter значением {0}")
	public AddGroupPage setGroupFooterFieldField(String text){
		groupFooterField.clearAndType(text);
		return this;
	}
	
	@Step("Нажать кнопку Enter information")
	public void clickSubmitButton(){
		submitButton.click();
	}
	
	

}
