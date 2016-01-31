package com.diplom.applogic;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import com.diplom.util.PropertyLoader;
import com.github.javafaker.Faker;

import ru.stqa.selenium.factory.WebDriverFactory;
import ru.yandex.qatools.allure.annotations.Attachment;

public class ApplicationManager {
	
	private NavigationHelper navigationHelper;
	private AddressHelper addressHelper;
	private GroupHelper groupsHelper;
	
	public Faker faker = new Faker();
	
	private WebDriver driver;
	private static String gridHubUrl;
	private static String baseUrl;
	private static Capabilities capabilities;
	
	public ApplicationManager() throws IOException{
		baseUrl = PropertyLoader.loadProperty("site.url");
	    gridHubUrl = PropertyLoader.loadProperty("grid.url");
	    if ("".equals(gridHubUrl)) {
	      gridHubUrl = null;
	    }
	    capabilities = PropertyLoader.loadCapabilities();
	    
	    driver = WebDriverFactory.getDriver(gridHubUrl, capabilities);
	    
	    navigationHelper = new NavigationHelper(this);
	    addressHelper = new AddressHelper(this);
	    groupsHelper = new GroupHelper(this);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    getNavigationHelper().openHomePage();
	    addressHelper.pages.internalPage.waitPageLoaded();
	    
	}
	
	public GroupHelper getGroupHelper(){
		return groupsHelper;
	}
	
	public AddressHelper getAddressHelper(){
		return addressHelper;
	}
	
	
	public NavigationHelper getNavigationHelper(){
		return navigationHelper;
	}
	
	public WebDriver getWebDriver(){
		return driver;
	}
	
	protected String getBaseUrl(){
		return baseUrl;
	}
	
	
	public void stop(){
		if (driver != null){
			driver.quit();
		}
	}
	
	@Attachment(value = "{0}", type = "text/plain")
	public static byte[] saveImageAttach(String attachName) {
		try {
	          URL defaultImage = new URL(attachName);
	          File imageFile = new File(defaultImage.toURI());
	          return toByteArray(imageFile);
	    	} catch (Exception e) {
	    		e.printStackTrace();
	    	}
	      return new byte[0];
	}
	  
	  private static byte[] toByteArray(File file) throws IOException {
		  return Files.readAllBytes(Paths.get(file.getPath()));
	  }

}
