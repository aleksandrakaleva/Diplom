package com.diplom;

import org.testng.annotations.Test;

import com.diplom.data.GeneratorDataAddress;
import com.diplom.model.Address;

import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Title;

@Title("Тесты адресса")
@Description("Тесты аресса")
public class AddressTest extends TestBase {

	@Title("Тест создания адресса")
	  @Description("Тест создания адресса")
	  //@Test(dataProviderClass = GeneratorDataAddress.class, dataProvider = "newAddressData")
	  public void testAddNewAddress(Address address){
		  app.getAddressHelper()
		  	.createNewAddress(address); 
	  }
	  
	  @Title("Тест редактирования адресса")
	  @Description("Тест редактирования адресса")
	  //@Test(dataProviderClass = GeneratorDataAddress.class, dataProvider = "newAddressData")
	  public void testUpdateAddress(Address editAddress, Address address){
		  app.getAddressHelper()
		  	.updateAddress(editAddress, address);
	  }
	  
	  @Title("Тест удаления адресса")
	  @Description("Тест удаления адресса")
	  //@Test(dataProviderClass = GeneratorDataAddress.class, dataProvider = "newAddressData")
	  public void testDeleteAddress(Address address){
		  app.getAddressHelper()
		  	.deleteAddress(address); 
	  }
  
	  @Title("Тест добавление адресса в группу")
	  @Description("Тест добавление адресса в группу")
	  @Test(dataProviderClass = GeneratorDataAddress.class, dataProvider = "addAddressData")
	  public void testAddAddressToGroup(Address address){
		  app.getAddressHelper()
		  	.addAddress(address);
	  }
}
