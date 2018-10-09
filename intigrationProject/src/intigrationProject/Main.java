/*Created By: Zachary Maroney
 * 
 * This is a demonstration of all the cool things one can do with Java
 * and the knowledge that I have gain through this taking this course.
 * Throughout the code there are many references to the Harry Potter
 * book series.
 */

package intigrationProject;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello Wizard, I am the sorting hat!");
		System.out.println("[Press Enter to continue]");
		scan.nextLine();
		
		Datatypes.numbers();
		System.out.println("[Press Enter to continue]");
		scan.nextLine();
		
		Sstring.compareHouse();
		System.out.println("[Press Enter to continue]");
		scan.nextLine();
		
		Sstring.indexChar();
		System.out.println("[Press Enter to continue]");
		scan.nextLine();
		
		Sstring.escape();
		System.out.println("[Press Enter to continue]");
		scan.nextLine();
		
		System.out.println("What essence of a mythical animal would you want in your wand?:");
		String essence = scan.nextLine();
		System.out.println("What kind of wood would you like your wand to be made out of?:");
		String wood = scan.nextLine();
		System.out.println("Wow! Such a great wand that is "+Methods.wandWood(wood) +Methods.wandEssence(essence));
		// (wood) and (essence) are arguments for the wandWood and wandEssence methods.
		System.out.println("[Press Enter to continue]");
		scan.nextLine();
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
