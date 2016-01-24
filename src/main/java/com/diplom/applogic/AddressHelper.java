package com.diplom.applogic;

import org.openqa.selenium.By;

import ru.yandex.qatools.allure.annotations.Step;

import com.diplom.model.Address;

public class AddressHelper extends DriverBasedHelper{

	public AddressHelper(ApplicationManager manager) {
		super(manager);
	}
	
	@Step("Создание нового аккаунта")
	public void createNewAddress(Address address){
		pages.internalPage.clickMenuAddNew();
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
		
		pages.internalPage.clickMenuHome();
		org.testng.Assert.assertTrue(pages.homePage.isElementPresent(By
				.xpath("//td[contains(text(), '"+address.getLastName()+"')]")));
	}

}
