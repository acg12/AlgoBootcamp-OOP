package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Validation {
	public boolean validName(String name) {
		return name.endsWith("shoe") ? true : false;
	}
	
	public boolean validCategory(String category) {
		if(category.contains("Sneaker") || 
		   category.contains("Running") || 
		   category.contains("Boot")) {
			return true;
		}
		return false;
	}
	
	public boolean validDate(String date) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			sdf.setLenient(false); // reject invalid dates
			sdf.parse(date);
		} catch (ParseException e) {
			// TODO: handle exception
			return false;
		}
		return true;
	}
	
	public boolean validPrice(int price) {
		return (price >= 5000) ? true : false;
	}
}
