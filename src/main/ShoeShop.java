package main;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoeShop {

	public ShoeShop(boolean onApp) {
		// TODO Auto-generated constructor stub
		
		Scanner scan = new Scanner(System.in);
		ShoeController sc = new ShoeController();
		ArrayList<Shoe> shoes = new ArrayList<>();
		Utils util = new Utils();
		
		shoes.add(new Shoe("Budishoe", "Running", "20-10-2000", 5001));
		shoes.add(new Shoe("Regi shoe", "Boot", "20-10-2000", 15000));
		shoes.add(new Shoe("Running shoe", "Running", "20-10-2000", 60000));
		shoes.add(new Shoe("Sneak shoe", "Sneaker", "20-10-2000", 10000));
		shoes.add(new Shoe("Custard shoe", "Boot", "20-10-2005", 6500));
		
		while(onApp) {
			System.out.println("Shoe Shop");
			System.out.println("=========");
			System.out.println("1. View shoes");
			System.out.println("2. Add shoe");
			System.out.println("3. Delete shoe");
			System.out.println("4. Exit");
			
			int menu = 0;
			do {
				System.out.print(">> ");
				menu = scan.nextInt();
				scan.nextLine();
			} while(menu < 1 || menu > 4);
			
			switch(menu) {
			case 1:
				sc.view(shoes);
				util.pressEnter();
				break;
			case 2:
				sc.add(shoes);
				util.pressEnter();
				break;
			case 3:
				sc.delete(shoes);
				util.pressEnter();
				break;
			case 4:
				System.out.println("Thank you for using this application!");
				onApp = false;
				break;
			}
		}
		scan.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ShoeShop(true);
	}

}
