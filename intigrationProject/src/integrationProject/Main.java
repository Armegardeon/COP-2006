/*
 * Created By: Zachary Maroney
 * 
 * This is a demonstration of all the cool things one can do with Java and the knowledge that I have
 * gain through this taking this course. Throughout the code there are many references to the Harry
 * Potter book series.
 */

package integrationProject;

import java.util.Scanner;

/**
 * Main class that executes all the methods.
 * @author Zachary Maroney
 */
public class Main {

  /**
   * main method that holds all the 
   * @param args runs the whole program.
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out
        .println("Hello Wizard, I am the sorting hat and welcome to Hogwarts!\nWhat is your name?");
    String name = scan.nextLine();
    System.out.println("Ahh, Nice to meet you " + name + ".");
    Continue.pressEnter();

    Datatypes.assignStats();
    Continue.pressEnter();

    Conditions.compareHouse();
    Continue.pressEnter();

    Minimum.printMin(); // Find the smallest value in an array. (In Minimum class).
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
    String house = HouseSelection.selectHouse();
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
        System.out.println("You are a " + house + ", congratulations!");
      } else if (answ == 'N') {
        System.out.println("I did not want to sit on your head anyways!");
        goodInput = true;
        house = "un-sorted wizard";
      } else {
        System.out.println("This is a yes or no questions. \nCan you please type another answer.");
      }
    }
    Continue.pressEnter();

    House hs = new House(name, house);
    hs.toString();

    System.out.println("[Press ENTER to leave Hogwarts]");
    scan.nextLine();

    System.out.println("I hope you had a nice visit at the Hogwarts, Wizarding School.");
    System.out.println();
    System.out.println("Rest of the text has nothing to do with Harrry Potter and is test code.");

    Continue.pressEnter();

    int[] numList = {1, 3, 5, 7, 9, 2, 4, 6, 8};

    Accumulator.getSum(numList); // Get a sum of the values in an array using an accumulator. (In
    // getSum class)
    Continue.pressEnter();

    System.out.println("At 5, the Index is: " + Index.findIndex(numList, 5)); // Search an array
    // and identify the
    // index where a
    // value was found.
    // (In Index class).

    System.out.println("At 6, the Index is: " + Index.findIndex(numList, 6));
    Continue.pressEnter();

    TwoDimensionalArray.make2DArray();
    Continue.pressEnter();

    ArrayListEmpty.testArrayList();
    Continue.pressEnter();

    int[][] board = {{690, 420, 412, 404}, {626, 512, 985, 561}, {128, 235, 1567, 1241},
        {6346, 123, 3242, 231}};

    SearchTwoDimensional.locateValue(board, 420);
    SearchTwoDimensional.locateValue(board, 985);
    SearchTwoDimensional.locateValue(board, 6346);
    Continue.pressEnter();
    scan.close();

    System.out.println("Thank you for using my program!");
  }
}
