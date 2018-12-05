// Created by: Zachary Maroney

package integrationProject;

/**
 * array and if statements with breaks.
 * @author Zacharay Maroney
 */
public class Loops {

  /**
   * Create and use do/while loops.
   */
  public static void doLoop() {
    int i = 5;
    do {
      System.out.println("this is still gonna print because this is a do/while loop");
      i++;
    } while (i > 10);
  }

  /**
   * Declare, instantiate, initialize and use a one-dimensional array.
   */
  public static void doArrayBreak() {
    int[] numbers = {1, 2, 3, 4, 5};

    for (int x : numbers) {  // Create and use the enhanced for loop
      if (x == 4) {
        break; // breaks stops the for statement from continuing through the array at 4.
      }
      System.out.println(x);
    }
  }
}
