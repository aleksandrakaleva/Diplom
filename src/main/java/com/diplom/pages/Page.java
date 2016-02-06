package com.diplom.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.diplom.elements.CustomFieldDecorator;




public abstract class Page {

	protected WebDriver driver;
	  protected WebDriverWait wait;
	  protected PageManager pages;


	  public Page(PageManager pages) {
	    this.pages = pages;
	    driver = pages.getWebDriver();
	    wait = new WebDriverWait(driver, 5);
	    PageFactory.initElements(new CustomFieldDecorator(driver), this);
	  }
	  
	  public WebDriver getWebDriver(){
		  return driver;
	  }

	  public String getTitle() {
	    return driver.getTitle();
	  }
	  
	  public Page ensurePageLoaded(){
		  return this;
	  }
	  
	  public boolean waitPageLoaded(){
		  try {
			  ensurePageLoaded();
			  return true;
			
		  } catch (TimeoutException to) {
			return false;
		  }
		  
	  }
	  
	  public void scrollPage(int position){
		  String js = String.format("window.scroll(0, %s)", position);
		  ((JavascriptExecutor)driver).executeScript(js);
		  
	  }
	  
	  public boolean isElementPresent(By locator) {
			try {
				driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
				wait.until(ExpectedConditions.presenceOfElementLocated(locator));
				return true;
			} catch (WebDriverException e) {
				return false;
			}
	  }
	  
	  public boolean isNotElementPresent(WebDriver driver, By locator) {
			try {
				driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
				return true;
			} catch (WebDriverException e) {
				return false;
			}
	  }
	  
	  public boolean isElementPresent(WebElement webElement) {
			try {
				webElement.isDisplayed();
				return true;
			} catch (WebDriverException e) {
				return false;
			}
	  }
  

 

}
