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
		address.setFirstName("FirstName" + new Random().nextInt(1000000))
			.setLastName("LastName" + new Random().nextInt(1000000))
			.setAddress("Street, " + new Random().nextInt(1000000))
			.setHomeTelephone("" + new Random().nextInt(1000000))
			.setMobileTelephone("" + new Random().nextInt(1000000))
			.setWorkTelephone("" + new Random().nextInt(1000000))
			.setEmail("mail" + new Random().nextInt(1000000) + "@mail.ru")
			.setEmail2("mail" + new Random().nextInt(1000000) + "@mail.ru")
			.setDayBirthday(""+new Random().nextInt(28))
			.setMounthBirthday("May")
			.setYearBirthday("1996")
			.setGroups("Rob");
		list.add(new Object[]{address});
		return list.iterator();
	}
	
	@DataProvider(name = "updateAddressData")
	public static Iterator<Object[]> updateAddressDataGenerate(){
		List<Object[]> list = new ArrayList<Object[]>();
		Address editAddress = new Address();
		editAddress.setFirstName("Титова");
		Address address = new Address();
		address.setFirstName("FirstName" + new Random().nextInt(1000000))
			.setLastName("LastName" + new Random().nextInt(1000000))
			.setAddress("Street, " + new Random().nextInt(1000000))
			.setHomeTelephone("" + new Random().nextInt(1000000))
			.setMobileTelephone("" + new Random().nextInt(1000000))
			.setWorkTelephone("" + new Random().nextInt(1000000))
			.setEmail("mail" + new Random().nextInt(1000000) + "@mail.ru")
			.setEmail2("mail" + new Random().nextInt(1000000) + "@mail.ru")
			.setDayBirthday(""+new Random().nextInt(28))
			.setMounthBirthday("May")
			.setYearBirthday("1996")
			.setGroups("Rob");
		list.add(new Object[]{editAddress, address});
		return list.iterator();
	}
	
	@DataProvider(name = "deleteAddressData")
	public static Iterator<Object[]> deleteAddressDataGenerate(){
		List<Object[]> list = new ArrayList<Object[]>();
		Address address = new Address();
		address.setFirstName("Тихонов");
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
