package com.diplom.applogic;

import org.openqa.selenium.By;

import ru.yandex.qatools.allure.annotations.Step;

import com.diplom.model.Address;

public class AddressHelper extends DriverBasedHelper{

	public AddressHelper(ApplicationManager manager) {
		super(manager);
	}
	
	@Step("Создание нового адресса")
	public void createNewAddress(Address address){
		manager.getNavigationHelper()
			.openAddAdressPage();
		pages.addAddressPage
			.setFirtNameField(address.getFirstName())
			.setLastNameField(address.getLastName())
			.setAddressField(address.getAddress())
			.setHomeTelephoneField(address.getHomeTelephone())
			.setMobileTelephoneField(address.getMobileTelephone())
			.setWorkTelephoneField(address.getWorkTelephone())
			.setEmailField(address.getEmail())
			.setEmail2Field(address.getEmail2())
			.setBdayField(address.getDayBirthday())
			.setBmonthField(address.getMounthBirthday())
			.setByearField(address.getYearBirthday())
			.setGroupField(address.getGroups())
			.clickSubmitButton();
		
		manager.getNavigationHelper()
			.openListAdressPage();
		org.testng.Assert.assertTrue(pages.homePage.isElementPresent(By
				.xpath("//td[contains(text(), '"+address.getLastName()+"')]")));
	}
	
	@Step("Редактивроание адресса")
	public void updateAddress(Address editAddress, Address address){
		manager.getNavigationHelper()
			.openListAdressPage();
		pages.homePage
			.clickEditButton(editAddress.getFirstName());
		pages.addAddressPage
			.setFirtNameField(address.getFirstName())
			.setLastNameField(address.getLastName())
			.setAddressField(address.getAddress())
			.setHomeTelephoneField(address.getHomeTelephone())
			.setMobileTelephoneField(address.getMobileTelephone())
			.setWorkTelephoneField(address.getWorkTelephone())
			.setEmailField(address.getEmail())
			.setEmail2Field(address.getEmail2())
			.setBdayField(address.getDayBirthday())
			.setBmonthField(address.getMounthBirthday())
			.setByearField(address.getYearBirthday())
			.setGroupField(address.getGroups())
			.clickUpdateButton();
		
		manager.getNavigationHelper()
			.openListAdressPage();
		org.testng.Assert.assertTrue(pages.homePage.isElementPresent(By
				.xpath("//td[contains(text(), '"+address.getLastName()+"')]")));
	}
	
	@Step("Удаление адресса")
	public void deleteAddress(Address address){
		manager.getNavigationHelper()
			.openListAdressPage();
		pages.homePage
			.clickEditButton(address.getFirstName());
		pages.addAddressPage
			.clickDeleteButton();

	}

}
