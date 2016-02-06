package com.diplom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import ru.yandex.qatools.allure.annotations.Step;

import com.diplom.elements.Button;
import com.diplom.elements.SelectList;
import com.diplom.elements.TextField;

public class AddAddressPage extends InternalPage{

	public AddAddressPage(PageManager pages) {
		super(pages);
	}
	
	public AddAddressPage ensurePageLoaded(){
		super.ensurePageLoaded();
		wait.until(ExpectedConditions.presenceOfElementLocated(By
				.xpath("//h1[text() = 'Edit / add address book entry']")));
		return this;
	}

	@FindBy(name = "firstname")
	public TextField firtNameField;
	
	@FindBy(name = "lastname")
	public TextField lastNameField;
	
	@FindBy(name = "address")
	public TextField addressField;
	
	@FindBy(name = "home")
	public TextField homeTelephoneField;
	
	@FindBy(name = "mobile")
	public TextField mobileTelephoneField;
	
	@FindBy(name = "work")
	public TextField workTelephoneField;
	
	@FindBy(name = "email")
	public TextField emailField;
	
	@FindBy(name = "email2")
	public TextField email2Field;
	
	@FindBy(name = "bday")
	public SelectList bdayField;
	
	@FindBy(name = "bmonth")
	public SelectList bmonthField;
	
	@FindBy(name = "byear")
	public TextField byearField;
	
	@FindBy(name = "new_group")
	public SelectList groupField;
	
	@FindBy(name = "submit")
	public Button submitButton;
	
	@FindBy(xpath = "//form[@action = 'edit.php']/*[@name = 'update']")
	public Button updateButton;
	
	@FindBy(xpath = "//form[@action = 'delete.php']/*[@name = 'update']")
	public Button deleteButton;
	
	@Step("Заполнить поле FirstName значением {0}")
	public AddAddressPage setFirtNameField(String text){
		firtNameField.clearAndType(text);
		return this;
	}
	
	@Step("Заполнить поле Last name значением {0}")
	public AddAddressPage setLastNameField(String text){
		lastNameField.clearAndType(text);
		return this;
	}
	
	@Step("Заполнить поле Address значением {0}")
	public AddAddressPage setAddressField(String text){
		addressField.clearAndType(text);
		return this;
	}
	
	@Step("Заполнить поле Telephone Home значением {0}")
	public AddAddressPage setHomeTelephoneField(String text){
		homeTelephoneField.clearAndType(text);
		return this;
	}
	
	@Step("Заполнить поле Telephone Mobile значением {0}")
	public AddAddressPage setMobileTelephoneField(String text){
		mobileTelephoneField.clearAndType(text);
		return this;
	}
	
	@Step("Заполнить поле Telephone Work значением {0}")
	public AddAddressPage setWorkTelephoneField(String text){
		workTelephoneField.clearAndType(text);
		return this;
	}
	
	@Step("Заполнить поле Email значением {0}")
	public AddAddressPage setEmailField(String text){
		emailField.clearAndType(text);
		return this;
	}
	
	@Step("Заполнить поле Email2 значением {0}")
	public AddAddressPage setEmail2Field(String text){
		email2Field.clearAndType(text);
		return this;
	}
	
	@Step("Заполнить поле Day значением {0}")
	public AddAddressPage setBdayField(String text){
		bdayField.select(text);
		return this;
	}
	
	@Step("Заполнить поле Month значением {0}")
	public AddAddressPage setBmonthField(String text){
		bmonthField.select(text);
		return this;
	}
	
	@Step("Заполнить поле Year значением {0}")
	public AddAddressPage setByearField(String text){
		byearField.clearAndType(text);
		return this;
	}
	
	@Step("Заполнить поле Group значением {0}")
	public AddAddressPage setGroupField(String text){
		groupField.select(text);
		return this;
	}
	
	@Step("Нажать кнопку Enter")
	public void clickSubmitButton(){
		submitButton.click();
	}
	
	@Step("Нажать кнопку Update")
	public void clickUpdateButton(){
		updateButton.click();
	}
	
	@Step("Нажать кнопку Delete")
	public void clickDeleteButton(){
		deleteButton.click();
	}
	
}
