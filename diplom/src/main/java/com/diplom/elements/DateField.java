package com.diplom.elements;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DateField extends Element{

	public DateField(WebElement webElement) {
		super(webElement);
	}
	
	public String getValue() {
		return webElement.getAttribute("value");
	}
	
	public void select(WebDriver driver, String date) throws ParseException {
		
		//String date = "24/05/2053";
		
		webElement.click();
		
		int year = Integer.parseInt(date.substring(date.lastIndexOf("/")+1));
		int yearActual = Integer.parseInt(driver.findElement(By
				.xpath("//div[@class = 'dtp']//div[@class = 'dtp-actual-year p80']"))
				.getText());
		
		for(int i = 0; i<=12; i++){
			if(!driver.findElement(By.xpath("//div[@class = 'dtp']//div[@class = 'dtp-actual-month p80']"))
					.getText().contains(getMonth(date.substring(date.indexOf("/")+1
							, date.lastIndexOf("/"))))){
				driver.findElement(By.xpath("//div[@class = 'dtp']//a[@class = 'dtp-select-month-after']")).click();
			}
			
		}
		
		if((yearActual - year < 0)){
			for(int i = 0; i<Math.abs(yearActual - year); i++){
				driver.findElement(By.xpath("//div[@class = 'dtp']//a[@class = 'dtp-select-year-after']")).click();
			}
			
		}else if(yearActual - year>0){
			for(int i = 0; i<(yearActual - year); i++){
				driver.findElement(By.xpath("//div[@class = 'dtp']//a[@class = 'dtp-select-year-before']")).click();
			}
			
		}
		
		driver.findElement(By
				.xpath("//div[@class = 'dtp']//a[contains(@class, 'dtp-select-day')][contains(text()"
						+ ", '"+date.substring(0, date.indexOf("/"))+"')]/.."))
					.click();
		
		driver.findElement(By
				.xpath("//div[@class = 'dtp']//button[@class = 'dtp-btn-ok btn btn-positive'][contains(text(), 'OK')]"))
					.click();
		
	}
	
	private static String getMonth(String month){
		String strintMonth = null;
		if(month.equals("01")){
			strintMonth = "JAN";
		}else if(month.equals("02")){
			strintMonth = "FEB";
		}else if(month.equals("03")){
			strintMonth = "MAR";
		}else if(month.equals("04")){
			strintMonth = "APR";
		}else if(month.equals("05")){
			strintMonth = "MAY";
		}else if(month.equals("06")){
			strintMonth = "JUN";
		}else if(month.equals("07")){
			strintMonth = "JUL";
		}else if(month.equals("08")){
			strintMonth = "AUG";
		}else if(month.equals("09")){
			strintMonth = "SEP";
		}else if(month.equals("10")){
			strintMonth = "OCT";
		}else if(month.equals("11")){
			strintMonth = "NOV";
		}else if(month.equals("12")){
			strintMonth = "DEC";
		}
		
		return strintMonth;
	}
	

}
