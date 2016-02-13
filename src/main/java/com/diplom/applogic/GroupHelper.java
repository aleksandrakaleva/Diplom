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
		manager.getNavigationHelper()
			.openGroupsPage();
		pages.groupsPage
			.clickNewGroupButton();
		pages.addGroupPage.setGroupNameField(group.getGroupName())
			.setGroupHeaderField(group.getGroupHeader())
			.setGroupFooterFieldField(group.getGroupFooter())
			.clickSubmitButton();
		manager.getNavigationHelper()
			.openGroupsPage();
		org.testng.Assert.assertTrue(pages.homePage.isElementPresent(By
				.xpath("//*[text() = '"+group.getGroupName()+"']")));

	}
	
	@Step("Редактирование группы")
	public void updateGroup(Group editGroup, Group group){
		manager.getNavigationHelper()
			.openGroupsPage();
		pages.groupsPage
			.selectGroupCheckbox(editGroup.getGroupName())
			.clickEditGroupButton();
		pages.addGroupPage.setGroupNameField(group.getGroupName())
			.setGroupHeaderField(group.getGroupHeader())
			.setGroupFooterFieldField(group.getGroupFooter())
			.clickUpdateButton();
		manager.getNavigationHelper()
			.openGroupsPage();
		org.testng.Assert.assertTrue(pages.homePage.isElementPresent(By
			.xpath("//*[text() = '"+group.getGroupName()+"']")));
		
	}
	
	@Step("Удаление группы")
	public void deleteGroup(Group group){
		manager.getNavigationHelper()
			.openGroupsPage();
		pages.groupsPage
			.selectGroupCheckbox(group.getGroupName())
			.clickDeleteGroupButton();
	}

}
