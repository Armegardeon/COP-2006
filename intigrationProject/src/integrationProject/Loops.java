// Created by: Zachary Maroney

package integrationProject;

public class Loops {

  public static void doLoop() {    // Create and use do/while loops
    int i = 5;
    do {
      System.out.println("this is still gonna print because this is a do/while loop");
    } while (i > 10);
  }

  public static void doArrayBreak() {
    int[] numbers = {1, 2, 3, 4, 5}; // Declare, instantiate, initialize and use a one-dimensional
                                     // array

    for (int x : numbers) {  // Create and use the enhanced for loop
      if (x == 4) {
        break; // breaks stops the for statement from continuing through the array at 4.
      }
      System.out.println(x);
    }
  }
}