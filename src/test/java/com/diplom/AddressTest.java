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
  @Test(dataProviderClass = GeneratorDataAddress.class, dataProvider = "newAddressData")
  public void testAddNewAddress(Address address){
	  app.getAddressHelper().createNewAddress(address); 
  }
  

}
