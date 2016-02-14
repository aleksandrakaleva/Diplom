package com.diplom.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.testng.annotations.DataProvider;

import com.diplom.model.Address;

public class GeneratorDataAddress {
	
	@DataProvider(name = "newAddressData")
	public static Iterator<Object[]> newAddressDataGenerate(){
		List<Object[]> list = new ArrayList<Object[]>();
		Address address = new Address();
		address.setFirstName("Пригожин")
			.setLastName("Иосиф")
			.setAddress("г. Одесса, ул. Космонавтов, 17")
			.setHomeTelephone("63869825")
			.setMobileTelephone("380501503309")
			.setWorkTelephone("80033309")
			.setEmail("prigojin2041969@email.ru")
			.setEmail2("prigojin2041969@gmail.com")
			.setDayBirthday("2")
			.setMounthBirthday("April")
			.setYearBirthday("1969")
			.setGroups("Суворовский район");
		list.add(new Object[]{address});
		return list.iterator();
	}
	
	@DataProvider(name = "updateAddressData")
	public static Iterator<Object[]> updateAddressDataGenerate(){
		List<Object[]> list = new ArrayList<Object[]>();
		Address editAddress = new Address();
		editAddress.setFirstName("Кузнецова");
		Address address = new Address();
		address.setFirstName("Великая")
			.setLastName("Лидия" + new Random().nextInt(1000000))
			.setAddress("г. Одесса, ул. Академика Воробьева, 13")
			.setHomeTelephone("6-35-800")
			.setMobileTelephone("38 096 52 36 485")
			.setWorkTelephone("236-325-54")
			.setEmail("aleksbolotnikov@mail.ru")
			.setEmail2("aleksei85@mail.ru")
			.setDayBirthday("16")
			.setMounthBirthday("October")
			.setYearBirthday("1985");
		list.add(new Object[]{editAddress, address});
		return list.iterator();
	}
	
	@DataProvider(name = "deleteAddressData")
	public static Iterator<Object[]> deleteAddressDataGenerate(){
		List<Object[]> list = new ArrayList<Object[]>();
		Address address = new Address();
		address.setFirstName("Титова");
		list.add(new Object[]{address});
		return list.iterator();
	}
		
	@DataProvider(name = "addAddressData")
	public static Iterator<Object[]> addAddressDataGenerate(){
		List<Object[]> list = new ArrayList<Object[]>();
		Address address = new Address();
		address.setFirstName("Смирнов")
			.setGroups("Суворовский район");
		list.add(new Object[]{address});
		return list.iterator();
	}

}
