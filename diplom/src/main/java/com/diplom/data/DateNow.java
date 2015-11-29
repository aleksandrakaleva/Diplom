package com.diplom.data;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateNow {
	
	public String dateNow(){
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("dd");
		return dateFormat.format(date);
	}
	
	public Date stringToDate(String date, String dateFormat) throws ParseException{
		SimpleDateFormat format = new SimpleDateFormat(dateFormat);
		Date docDate= format.parse(date);
		return docDate;
	}

}
