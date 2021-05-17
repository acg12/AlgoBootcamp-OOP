package main;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoeController {
	
	Validation control = new Validation();
	Scanner scan = new Scanner(System.in);

	public ShoeController() {
		// TODO Auto-generated constructor stub
	}

	public void add(ArrayList<Shoe> shoes) {
		// TODO Auto-generated method stub
		String name, category, releaseDate;
		int price;
		
		do {
			System.out.print("Input shoe's name [name ends with shoe, example: \"Fire shoe\"]: ");
			name = scan.nextLine();
		} while(!control.validName(name));
		
		do {
			System.out.print("Input shoe's category [Sneaker | Running | Boot] (case sensitive): ");
			category = scan.nextLine();
		} while(!control.validCategory(category));
		
		do {
			System.out.print("Input shoe's release date [dd-mm-yyyy]: ");
			releaseDate = scan.nextLine();
		} while(!control.validDate(releaseDate));
		
		do {
			System.out.print("Input shoe's price [more than or equals to 5000]: ");
			price = scan.nextInt();
			scan.nextLine();
		} while(!control.validPrice(price));
		
		shoes.add(new Shoe(name, category, releaseDate, price));
		System.out.println("Shoe added!");
	}
	
	public void view(ArrayList<Shoe> shoes) {
		// TODO Auto-generated method stub
		if(shoes.isEmpty()) {
			System.out.println("No shoes available...");
		} else {
//			for (int i = 1; i <= shoes.size(); i++) {
//				System.out.println(i + ". " + shoes.get(i-1).toString());
//			}
			
			for (Shoe shoe : shoes) {
				System.out.println(shoes.indexOf(shoe) + 1 + ". " + shoe);
			}
		}
	}
	
	public void delete(ArrayList<Shoe> shoes) {
		// TODO Auto-generated method stub
		if(shoes.isEmpty()) {
			System.out.println("No shoes available...");
		} else {
			view(shoes);
			
			int max = shoes.size();
			int del = 0;
			do {
				System.out.print("Choose shoe's number to delete [1.." + max + "]: ");
				del = scan.nextInt();
			} while(del < 1 || del > max);
			
			shoes.remove(del-1);
			System.out.println("Shoe removed!");
		}
	}

}
