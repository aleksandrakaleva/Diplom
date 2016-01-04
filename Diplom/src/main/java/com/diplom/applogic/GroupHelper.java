package com.diplom.applogic;

import org.openqa.selenium.By;

import ru.yandex.qatools.allure.annotations.Step;

import com.diplom.model.Address;
import com.diplom.model.Group;

public class GroupHelper extends DriverBasedHelper{
	
	public GroupHelper(ApplicationManager manager) {
		super(manager);
	}
	
	@Step("Создание новой группы")
	public void createNewGroup(Group group){
		pages.internalPage
			.clickMenuGroups();
		pages.groupsPage
			.ensurePageLoaded();
		pages.groupsPage
			.clickNewGroupButton();
		pages.addGroupPage
			.ensurePageLoaded();
		pages.addGroupPage.setGroupNameField(group.getGroupName())
			.setGroupHeaderField(group.getGroupHeader())
			.setGroupFooterFieldField(group.getGroupFooter())
			.clickSubmitButton();
		
		pages.internalPage.clickMenuGroups();
		pages.groupsPage
			.ensurePageLoaded();
		org.testng.Assert.assertTrue(pages.homePage.isElementPresent(By
				.xpath("//*[text() = '"+group.getGroupName()+"']")));

	}

}
