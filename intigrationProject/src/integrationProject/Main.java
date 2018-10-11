/*
 * Created By: Zachary Maroney
 * 
 * This is a demonstration of all the cool things one can do with Java and the knowledge that I have
 * gain through this taking this course. Throughout the code there are many references to the Harry
 * Potter book series.
 */

package integrationProject;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Hello Wizard, I am the sorting hat and welcome to Hogwarts!");
    System.out.println("[Press Enter to continue]");
    scan.nextLine();

    Datatypes.assignStats();
    System.out.println("[Press Enter to continue]");
    scan.nextLine();

    Conditions.compareHouse();
    System.out.println("[Press Enter to continue]");
    scan.nextLine();

    Words.indexChar();
    System.out.println("[Press Enter to continue]");
    scan.nextLine();

    Words.castSpell();
    System.out.println("[Press Enter to continue]");
    scan.nextLine();

    System.out.println("What mythical animal would you like embued in to your wand?(ex. dragon):");
    String essence = scan.nextLine();
    System.out.println("What kind of wood would you like your wand to be made out of?(ex. birch):");
    String wood = scan.nextLine();
    System.out.println(
        "Wow! Such a great wand that is " + Methods.askWood(wood) + Methods.askEssence(essence));
    // (wood) and (essence) are arguments for the wandWood and wandEssence methods.
    System.out.println("[Press Enter to continue]");
    scan.nextLine();

    char answ = 'z';
    while (answ != 'Y' && answ != 'N') { // Operator precedence determines the way in which
                                         // operators are parsed with respect to each other.
                                         // An example is a OR statement, as soon as the first value yields true,
                                         // it is true.
      System.out.println("Would you like to put on the sorting hat? (Y/N):");
      answ = scan.nextLine().toUpperCase().charAt(0);
      // prompts user to input 'y' or 'n'.
      if (answ == 'Y') {
        switch (Pickanumber.selectNum()) {
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
      } else if (answ == 'N') {
        System.out.println("I did not want to sit on your head anyways!");
      } else {
        System.out.println("This is a yes or no questions.");
      }
    }
    System.out.println("[Press ENTER to leave Hogwarts]");
    scan.nextLine();
    scan.close();

    System.out.println("I hope you had a nice visit at the Hogwarts, Wizarding School.");
  }

}
