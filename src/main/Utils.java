package main;

import java.util.Scanner;

public class Utils {

	public void pressEnter() {
		Scanner s = new Scanner(System.in);
		System.out.print("Press enter to continue...");
		s.nextLine();
	}
}
