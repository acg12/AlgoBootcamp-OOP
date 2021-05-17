package main;

import java.util.concurrent.ThreadLocalRandom;

public class Shoe {
	
	private String id;
	private String name;
	private String category;
	private String releaseDate;
	private int price;

	public Shoe(String name, String category, String releaseDate, int price) {
		// TODO Auto-generated constructor stub
		this.id = generateId();
		this.name = name;
		this.category = category;
		this.releaseDate = releaseDate;
		this.price = price;
	}

	private String generateId() {
		String ID = "SH";
		
		for(int i = 0; i < 3; i++) {
			Integer n = ThreadLocalRandom.current().nextInt(0, 10);
			ID += n.toString();
		}
		
		return ID;
	}
	
	public String toString() {
		String result = "";
		
		result += this.name + "-" + this.id + "\n";
		result += "==========================\n";
		result += "Category: " + this.category + "\n";
		result += "Release date: " + this.releaseDate + "\n";
		result += "Price: " + this.price + "\n";
		
		return result;
	}
}
