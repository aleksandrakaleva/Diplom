package com.diplom;

import org.testng.annotations.Test;

import com.diplom.data.GeneratorDataAddress;
import com.diplom.data.GeneratorDataGroup;
import com.diplom.model.Address;
import com.diplom.model.Group;

import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Title;

@Title("Тесты групп")
@Description("Тесты групп")
public class GroupTest extends TestBase{
	
	
	@Title("Тест создания группы")
	@Description("Тест создания группы")
	@Test(dataProviderClass = GeneratorDataGroup.class, dataProvider = "newGroupData")
	public void testAddNewGroup(Group group){
		app.getGroupHelper()
			.createNewGroup(group);
	}
	 
	@Title("Тест редактирования группы")
	@Description("Тест редактирования группы")
	@Test(dataProviderClass = GeneratorDataGroup.class, dataProvider = "updateGroupData")
	public void testUpdateGroup(Group editGroup, Group group){
		app.getGroupHelper()
			.updateGroup(editGroup, group);
	}
	 

	@Title("Тест удаления группы")
	@Description("Тест удаления группы")
	@Test(dataProviderClass = GeneratorDataGroup.class, dataProvider = "deleteGroupData")
	public void testDeleteGroup(Group group){
		app.getGroupHelper()
			.deleteGroup(group);
	}

}
