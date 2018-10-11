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
		System.out.println("Hello Wizard, I am the sorting hat and welcome to Hogwarts!");
		System.out.println("[Press Enter to continue]");
		scan.nextLine();
		
		Datatypes.numbers();
		System.out.println("[Press Enter to continue]");
		scan.nextLine();
		
		Conditions.compareHouse();
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
		char answ = 'z';
		while (answ != 'Y' && answ != 'N') {               //Operator precedence determines the way in which operators are parsed with respect to each other.
			System.out.println();                          // An example is a OR statement, as soon as the first value yields true, it is true.
			System.out.println("Would you like to put on the sorting hat? (Y/N):");
			answ = scan.nextLine().toUpperCase().charAt(0);
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
			else if (answ == 'N') {
			System.out.println("I did not want to sit on your head anyways!");
			}
			else {
				System.out.println("This is a yes or no questions.");
			}
		}
		System.out.println("[Press ENTER to leave Hogwarts]");
		scan.nextLine();
		scan.close();
		System.out.println("I hope you had a nice visit at the Hogwarts, Wizarding School.");
	}

}
