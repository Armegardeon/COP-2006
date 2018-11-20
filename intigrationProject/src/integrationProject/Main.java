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
    Continue.pressEnter();

    Datatypes.assignStats();
    Continue.pressEnter();

    Conditions.compareHouse();
    Continue.pressEnter();

    Words.indexChar();
    Continue.pressEnter();

    Words.castSpell();
    Continue.pressEnter();
    System.out.println("<> Wand Crafting Stations <>");
    System.out
        .println("Type a mythical animal that you would like embued in to your wand.(ex. dragon):");
    String essence = scan.nextLine();
    System.out.println(
        "Type a kind of wood that you would like your wand to be made out of.(ex. birch):");
    String wood = scan.nextLine();
    System.out.println(
        "Wow! Such a great wand that is " + Methods.askWood(wood) + Methods.askEssence(essence));
    // (wood) and (essence) are arguments for the wandWood and wandEssence methods.
    Continue.pressEnter();

    char answ = 'y';
    boolean goodInput = false;
    while (!goodInput) { // Operator precedence determines the way in which
                         // operators are parsed with respect to each other.
                         // An example is a OR statement, as soon as the first value yields true,
                         // it is true.
      System.out
          .println("Would you like to put on the sorting hat?:\n(type Y for yes or N for no)");
      try {
        answ = scan.nextLine().toUpperCase().charAt(0);
      } catch (Exception ex) {
        System.out.println("Oh, a quiet type, Im going to assume you wanna be sorted.");
        answ = 'Y';
      }
      // prompts user to input 'y' or 'n'.
      if (answ == 'Y') {
        goodInput = true;
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
        goodInput = true;
      } else {
        System.out.println("This is a yes or no questions. \nCan you please type another answer.");
      }
    }
    System.out.println("[Press ENTER to leave Hogwarts]");
    scan.nextLine();
    scan.close();

    System.out.println("I hope you had a nice visit at the Hogwarts, Wizarding School.");
  }

}
