package com.diplom.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.testng.annotations.DataProvider;

import com.diplom.model.Group;

public class GeneratorDataGroup {
	
	@DataProvider(name = "newGroupData")
	public static Iterator<Object[]> newGroupDataGenerate(){
		List<Object[]> list = new ArrayList<Object[]>();
		Group group = new Group();
		group.setGroupName("GroupName" + new Random().nextInt(1000000))
			.setGroupHeader("GroupHeader" + new Random().nextInt(1000000))
			.setGroupFooter("GroupFooter" + new Random().nextInt(1000000));
		list.add(new Object[]{group});
		return list.iterator();
	}

}
