package intigrationProject;
import java.util.Scanner;

public class Conditions {
	
	public static void sortingHat() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Would you like to put on the sorting hat? (Y/N):");
		char answ = scan.nextLine().toUpperCase().charAt(0);
		scan.close();
		if (answ == 'Y') {
			switch (Pickanumber.random()) {
			case 1:
				System.out.println("You are a Gryffindor!");
				break;
			case 2:
				System.out.println("You are a Ravenclaw!");
				break;
			case 3:
				System.out.println("You are a Hufflepuff!");
				break;
			case 4:
				System.out.println("You are a Slytherin!");
				break;
			}
		}
		else {
			System.out.println("I did not want to sit on your head anyways!");
		}
	}
		
}
